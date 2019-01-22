package com.example.plxi.retrofitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import retrofit2.*;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    // TODO - insert your themoviedb.org API KEY here
    private final static String API_KEY = "7e8f60e325cd06e164799af1e317d7a7";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);
        Call<Login> call = apiService.login("krunal", "plxi.krunal@gmail.com", "krunall123", "8460322950", "Prelax Infotech", "male");
        call.enqueue(new Callback<Login>() {
            @Override
            public void onResponse(Call<Login> call, retrofit2.Response<Login> response) {
                Login login = response.body();
                Log.e("message", login.getMessage());
            }

            @Override
            public void onFailure(Call<Login> call, Throwable t) {

            }
        });
       /* Call<MoviesResponse> call = apiService.getTopRatedMovies(API_KEY);
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.movies_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        call.enqueue(new Callback<MoviesResponse>() {
            @Override
            public void onResponse(Call<MoviesResponse> call, Response<MoviesResponse> response) {
                final List<Movie> movies = response.body().getResults();
                Log.d(TAG, "Number of movies received: " + movies.size());
                recyclerView.setAdapter(new MoviesAdapter(movies, R.layout.list_item_movie, MainActivity.this, new listener() {
                    @Override
                    public void click(int position) {
                        Call<MoviesResponse> call = apiService.getMovieDetails(movies.get(position).getId(), API_KEY);
                        call.enqueue(new Callback<MoviesResponse>() {
                            @Override
                            public void onResponse(Call<MoviesResponse> call, Response<MoviesResponse> response) {
                                Log.e(TAG, "response " + response.message());

                            }

                            @Override
                            public void onFailure(Call<MoviesResponse> call, Throwable t) {
                                // Log error here since request failed
                                Log.e(TAG, t.toString());
                            }
                        });
                    }
                }));
            }

            @Override
            public void onFailure(Call<MoviesResponse> call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
            }
        });
    }

    public interface listener {
        void click(int position);
    }*/
    }
}
