package com.empat.kelasku.data.api.jastis;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

import com.empat.kelasku.data.model.JadwalModel;
import com.empat.kelasku.data.model.LoginModel;
import com.empat.kelasku.data.model.ResponseModel;

import java.util.List;

public interface JastisApiInterface {
	@GET("jadwal")
	Call<List<JadwalModel>> getJadwal(@Query("tingkat") String tingkat, @Query("jurusan") String jurusan,
			@Query("rombel") String rombel);

	@POST("user/auth")
	Call<ResponseModel> loginUser(@Body LoginModel data);
}
