package com.empat.kelasku.data.api.jastis;

import retrofit2.Call;
import retrofit2.http.GET;

import com.empat.kelasku.data.model.JadwalModel;
import java.util.List;

public interface JastisApiInterface {
    @GET("jadwal")
    Call<List<JadwalModel>> getJadwal();
}
