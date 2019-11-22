package com.alizhezi.base.lifecycle;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * Copyright (C) 2019 The ailizhezi.com Inc. All rights reserved
 * Author: 吕鹏 gavin6116@gmail.com
 * Time Created at 2019/2/18
 * Description：TestLifeCycle
 */
public class TestLifeCycle implements LifecycleObserver {

    private static final String TAG = "test";

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        Log.d(TAG, "onCreate: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        Log.d(TAG, "onStart: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        Log.d(TAG, "onResume: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        Log.d(TAG, "onPause: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        Log.d(TAG, "onStop: ");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        Log.d(TAG, "onDestroy: ");
    }



    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    public void onAny() {
       // Log.d(TAG, "onAny: ");
    }

}
