package com.alizhezi.base.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.alizhezi.base.R

/**
 * Copyright (C) 2019 The ailizhezi.com Inc. All rights reserved
 * Author: 吕鹏 gavin6116@gmail.com
 * Time Created at 2019/2/18 
 * Description：Lifecycle使用例子
 */
class LifecycleActivity : AppCompatActivity() {

    var accountModel:AccountModel?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)


      //  lifecycle.addObserver(TestLifeCycle())







    }
}
