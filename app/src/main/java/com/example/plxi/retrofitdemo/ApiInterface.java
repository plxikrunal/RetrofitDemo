package com.example.plxi.retrofitdemo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by plxi on 29/12/18.
 */

public interface ApiInterface {

    @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);

    @POST("Register.php")
    Call<Login> login(@Query("User_Name") String username,@Query("Email") String email, @Query("Password") String password, @Query("Mo_No") String mobile,@Query("Address") String address,@Query("gender") String gender);

}
