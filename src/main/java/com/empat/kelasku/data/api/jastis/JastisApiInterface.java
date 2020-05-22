package com.empat.kelasku.data.api.jastis;

import java.util.List;

import com.empat.kelasku.data.model.JadwalModel;
import com.empat.kelasku.data.model.LoginModel;
import com.empat.kelasku.data.model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface JastisApiInterface {

	@POST("user/auth")
	Call<ResponseModel> loginUser(@Body LoginModel data);

	@GET("jadwal")
	Call<List<JadwalModel>> getJadwal(@Query("tingkat") String tingkat, @Query("jurusan") String jurusan,
			@Query("rombel") String rombel);

	@GET("kelas/request")
	Call<ResponseModel> requestKelas(@Query("user_id") String userId, @Query("kelas") String kelas);

}
