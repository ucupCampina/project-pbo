package com.empat.kelasku.data.api.jastis;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import com.empat.kelasku.data.model.JadwalModel;
import java.util.List;

public interface JastisApiInterface {
    @GET("jadwal")
    Call<List<JadwalModel>> getJadwal(@Query("hari") String hari, @Query("tingkat") String tingkat, @Query("jurusan") String jurusan, @Query("rombel") String rombel);
}
