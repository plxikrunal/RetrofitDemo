package com.example.plxi.retrofitdemo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by plxi on 29/12/18.
 */

public class ApiClient {

    public static final String BASE_URL = "http://api.themoviedb.org/3/";
    public static final String BASE_URL1 = "http://ec2-18-219-247-1.us-east-2.compute.amazonaws.com/Quizwin/Webservices/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {

        if (retrofit == null) {
            //  retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL1).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
