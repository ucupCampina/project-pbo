package com.empat.kelasku.data.api.jastis;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.empat.kelasku.Main;
import com.empat.kelasku.data.model.Environment;
import com.empat.kelasku.data.model.JadwalModel;
import com.empat.kelasku.data.model.LoginModel;
import com.empat.kelasku.data.model.ResponseModel;
import com.empat.kelasku.ui.view.JadwalView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Query;


public class JastisApi {

    public static final String BASE_URL = Environment.DEV.getUrl();
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
    
    public static BlockingQueue<ResponseModel> loginUser(LoginModel data) {
            JastisApiInterface jastisApiInterface = JastisApi.getClient().create(JastisApiInterface.class);
            
            System.out.println("Sending loginUser API request...");
            
            final BlockingQueue<ResponseModel> blockingQueue = new ArrayBlockingQueue<>(1);
            Call<ResponseModel> loginCall = jastisApiInterface.loginUser(data);
            loginCall.enqueue(new Callback<ResponseModel>() {
				@Override
				public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
					blockingQueue.add((ResponseModel) response.body());
				}

				@Override
				public void onFailure(Call<ResponseModel> call, Throwable t) {
					
				}
            	
            });
            return blockingQueue;
    }
    
    public static void getJadwal(String tingkat, String jurusan, String rombel) {
        JastisApiInterface jastisApiInterface = JastisApi.getClient().create(JastisApiInterface.class);
        
        System.out.println("Sending getJadwal API request...");
        
        Call<List<JadwalModel>> jadwalCall = jastisApiInterface.getJadwal(tingkat, jurusan, rombel);
        jadwalCall.enqueue(new Callback<List<JadwalModel>>() {
            @Override
            public void onResponse(Call<List<JadwalModel>> call, Response<List<JadwalModel>> response) {
                Main.listJadwal = (ArrayList<JadwalModel>) response.body();
                System.out.println("Request done with " + Main.listJadwal.size() + " of total items");
                if (Main.listJadwal != null) {
                	((JadwalView) Main.activeContentPanelView).createJadwalHariIni(Main.listJadwal);                	
                }
            }

            @Override
            public void onFailure(Call<List<JadwalModel>> call, Throwable t) {
                System.out.println("Get jadwal API with error" + t.toString());
            }
        });
    }
}
