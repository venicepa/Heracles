package com.yhao.service;

import com.google.common.util.concurrent.RateLimiter;

public class EasonRateLimiter {

    RateLimiter rateLimiter = RateLimiter.create(10);


    public void doAcquire() {
        rateLimiter.acquire();
    }

    public void ff() {

    }

}
