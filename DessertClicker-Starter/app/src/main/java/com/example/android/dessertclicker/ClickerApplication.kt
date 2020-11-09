package com.example.android.dessertclicker

import android.app.Application
import timber.log.Timber

/**
 * Created by chon on 2020/11/9.
 * Hedge.
 */
class ClickerApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}