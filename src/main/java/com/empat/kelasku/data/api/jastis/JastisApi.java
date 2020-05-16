package com.empat.kelasku.data.api.jastis;

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
}
