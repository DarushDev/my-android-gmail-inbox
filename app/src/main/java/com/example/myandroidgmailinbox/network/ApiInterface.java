package com.example.myandroidgmailinbox.network;

import com.example.myandroidgmailinbox.model.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("emails")
    Call<List<Message>> getInbox();

}