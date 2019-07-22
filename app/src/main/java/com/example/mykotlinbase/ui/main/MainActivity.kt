package com.example.mykotlinbase.ui.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mykotlinbase.MyApplication
import com.example.mykotlinbase.R
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

@Inject lateinit var presenterImpl : PresenterImpl


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("  !!!!!!!!!!!!!!!!!    !!!!!!!!!!!!!!!!!   $presenterImpl")
    }

}
