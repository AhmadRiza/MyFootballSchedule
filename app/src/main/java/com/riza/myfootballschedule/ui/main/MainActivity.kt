package com.riza.myfootballschedule.ui.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.riza.myfootballschedule.R

class MainActivity : AppCompatActivity(),MvpView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
