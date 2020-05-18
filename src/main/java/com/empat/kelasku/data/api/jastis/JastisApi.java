package com.empat.kelasku.data.api.jastis;

import java.util.List;

import com.empat.kelasku.data.model.JadwalModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class JastisApi {

    public static final String BASE_URL = "http://jastis.herokuapp.com/api/v1/";
    private static Retrofit retrofit = null;
    
    public static List<JadwalModel> listJadwal;


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
        
        System.out.println("Sending and getJadwal API request...");
        
        Call<List<JadwalModel>> jadwalCall = jastisApiInterface.getJadwal();
        jadwalCall.enqueue(new Callback<List<JadwalModel>>() {
            @Override
            public void onResponse(Call<List<JadwalModel>> call, Response<List<JadwalModel>> response) {
                listJadwal = (List<JadwalModel>) response.body();
            }

            @Override
            public void onFailure(Call<List<JadwalModel>> call, Throwable t) {
                System.out.println("Get jadwal API with error" + t.toString());
            }
        });
    }
}
