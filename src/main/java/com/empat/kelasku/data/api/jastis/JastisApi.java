package com.empat.kelasku.data.api.jastis;

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

public class JastisApi {

	public static final String BASE_URL = Environment.PROD.getUrl() + "/api/v1/";
	private static Retrofit retrofit = null;

	public static Retrofit getClient() {
		if (retrofit == null) {
			retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
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

				System.out.println("Get loginUser API with error" + t.toString());
			}

		});
		return blockingQueue;
	}

	public static void getJadwal(String tingkat, String jurusan, String rombel) {
		JastisApiInterface jastisApiInterface = JastisApi.getClient().create(JastisApiInterface.class);

		System.out.println(tingkat + jurusan + rombel);
		System.out.println("Sending getJadwal API request...");

		Call<List<JadwalModel>> jadwalCall = jastisApiInterface.getJadwal(tingkat, jurusan, rombel);
		jadwalCall.enqueue(new Callback<List<JadwalModel>>() {
			@Override
			public void onResponse(Call<List<JadwalModel>> call, Response<List<JadwalModel>> response) {
				Main.listJadwal = (ArrayList<JadwalModel>) response.body();
				System.out.println("Request done with " + Main.listJadwal.size() + " of total items");
				if (Main.listJadwal != null) {
					if (Main.activeContentPanelView instanceof JadwalView) {
						((JadwalView) Main.activeContentPanelView).createJadwalHariIni(Main.listJadwal);						
					}
				}
			}

			@Override
			public void onFailure(Call<List<JadwalModel>> call, Throwable t) {
				System.out.println("Get jadwal API with error" + t.toString());
			}
		});
	}

	public static ResponseModel requestKelas(String userId, String kelas) {
		JastisApiInterface jastisApiInterface = JastisApi.getClient().create(JastisApiInterface.class);

		final BlockingQueue<ResponseModel> blockingQueue = new ArrayBlockingQueue<>(1);
		ResponseModel response = null;

		System.out.println("Sending requestKelas API request...");

		Call<ResponseModel> requestKelasCall = jastisApiInterface.requestKelas(userId, kelas);

		requestKelasCall.enqueue(new Callback<ResponseModel>() {

			@Override
			public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
				blockingQueue.add((ResponseModel) response.body());
			}

			@Override
			public void onFailure(Call<ResponseModel> call, Throwable t) {
				System.out.println("Get requestKelas API with error" + t.toString());
			}
		});

		try {
			response = blockingQueue.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return response;
	}

}
