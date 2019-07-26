package com.example.mykotlinbase.ui.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import com.example.mykotlinbase.R
import com.example.mykotlinbase.base.BaseActivity
import dagger.android.AndroidInjection
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class MainActivity : BaseActivity() {

//    @Inject lateinit var mainFragment: MainFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val manager : FragmentManager = getSupportFragmentManager()
        val transaction : FragmentTransaction = manager.beginTransaction()
        transaction.add(R.id.LinearLayout, MainFragment.newInstance())
        transaction.commit()
    }

}
