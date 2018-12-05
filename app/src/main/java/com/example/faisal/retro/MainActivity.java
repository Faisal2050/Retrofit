package com.example.faisal.retro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Call<ModelClass> call= RetrofitClient.getInstence().getApi().InsertUser("Faisal","admin@admin.com","admin");
        call.enqueue(new Callback<ModelClass>() {
            @Override
            public void onResponse(Call<ModelClass> call, Response<ModelClass> response) {
                ModelClass md=response.body();
                Toast.makeText(getApplicationContext(),""+md.getAhmad(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<ModelClass> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Sorry Wrong",Toast.LENGTH_LONG).show();
            }
        });
    }
}
