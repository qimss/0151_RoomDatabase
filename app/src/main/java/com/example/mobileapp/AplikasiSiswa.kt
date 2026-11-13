package com.example.mobileapp

import android.app.Application
import com.example.mobileapp.repositori.ContainerApp
import com.example.mobileapp.repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    lateinit var container: ContainerApp
    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}