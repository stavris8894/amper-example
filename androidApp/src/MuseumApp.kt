package com.example.amper

import android.app.Application
import com.example.amper.di.initKoin

class MuseumApp : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }
}
