package com.empat.kelasku.data.api.jastis;

import java.util.ArrayList;
import java.util.List;

import com.empat.kelasku.Main;
import com.empat.kelasku.data.model.JadwalModel;
import com.empat.kelasku.ui.view.JadwalView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class JastisApi {

    public static final String BASE_URL = "http://jastis.herokuapp.com/api/v1/";
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
    
    public static void getJadwal() {
        JastisApiInterface jastisApiInterface = JastisApi.getClient().create(JastisApiInterface.class);
        
        System.out.println("Sending getJadwal API request...");
        
        Call<List<JadwalModel>> jadwalCall = jastisApiInterface.getJadwal("senin", "11", "RPL", "1");
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
