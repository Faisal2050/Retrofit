package com.example.faisal.retro;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
        public static  final  String BASE_URL="http://127.0.0.1/retrofit/";
        public static Retrofit instance;
        public static RetrofitClient retrofitClient;
        private RetrofitClient(){
            instance=new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        public static synchronized RetrofitClient getInstence(){
            if(instance==null){
                retrofitClient=new RetrofitClient();
                return retrofitClient;
            }
            return retrofitClient;
        }
        public static API getApi(){
            return instance.create(API.class);
        }
}
