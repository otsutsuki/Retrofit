package com.example.theodhor.retrofit2;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Dori on 12/28/2016.
 */

public interface Interface {

    @FormUrlEncoded
    @POST("/sp/index.php")
    Call<ServerResponse> post(
            @Field("method") String method,
            @Field("username") String username,
            @Field("password") String password
    );

    @GET("/sp/index.php")
    Call<ServerResponse> get(
            @Query("method") String method,
            @Query("username") String username,
            @Query("password") String password
    );

}