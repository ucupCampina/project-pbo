package com.empat.kelasku;

import com.empat.kelasku.data.api.jastis.JastisApi;
import com.empat.kelasku.data.api.jastis.JastisApiInterface;
import com.empat.kelasku.data.model.JadwalModel;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        getJadwal();
    }
    
    
    // ? Example API request
    public static void getJadwal() {
        JastisApiInterface jastisApiInterface = JastisApi.getClient().create(JastisApiInterface.class);
        
        System.out.println("Sending and API request...");
        
        Call<List<JadwalModel>> jadwalCall = jastisApiInterface.getJadwal();
        jadwalCall.enqueue(new Callback<List<JadwalModel>>() {
            @Override
            public void onResponse(Call<List<JadwalModel>> call, Response<List<JadwalModel>> response) {
                List<JadwalModel> listJadwal = (List<JadwalModel>) response.body();
                listJadwal.forEach(data -> {
                    // ! Do something with the data
                    System.out.println(data);
                });
            }

            @Override
            public void onFailure(Call<List<JadwalModel>> call, Throwable t) {
                System.out.println("Get jadwal API with error" + t.toString());
            }
        });
    }
}
