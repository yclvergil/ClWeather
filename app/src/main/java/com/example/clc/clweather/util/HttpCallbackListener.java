package com.example.clc.clweather.util;

/**
 * Created by clc on 2016/3/7.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
