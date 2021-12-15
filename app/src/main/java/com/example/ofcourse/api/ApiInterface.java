package com.example.ofcourse.api;

import com.example.ofcourse.Model.login.Login;
import com.example.ofcourse.Model.register.Register;
import com.example.ofcourse.responsemodel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("api/login")
    Call<Login> loginResponse(@Field("email") String email, @Field("password") String password);

    @FormUrlEncoded
    @POST("api/register")
    Call<Register> registerResponse(@Field("name") String name, @Field("email") String email, @Field("phone") String phone, @Field("password") String password);


    @GET("api/mapel")
    Call<List<responsemodel>> getPost();


}
