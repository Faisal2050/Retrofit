package com.example.faisal.retro;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface API extends Call<ModelClass> {
        @FormUrlEncoded
        @POST("insert.php")
    Call<ModelClass> InsertUser(
          @Field("name") String name,
          @Field("email") String email,
          @Field("pass") String pass
        );
}
