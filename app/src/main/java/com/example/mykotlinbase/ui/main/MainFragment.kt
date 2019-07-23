package com.example.mykotlinbase.ui.main

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.mykotlinbase.R
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject


class MainFragment @Inject constructor() : Fragment(){

    @Inject lateinit var presenterImpl : PresenterImpl

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)

    }

    override
    fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }
}