package com.eci.cosw.taskplanner;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AuthService {

    @POST("token/login")
    Call<Token> login(@Body LoginWrapper loginWrapper);

}
