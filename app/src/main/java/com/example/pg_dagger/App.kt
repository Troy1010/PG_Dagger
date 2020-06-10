package com.example.pg_dagger

import android.app.Application
import com.example.pg_dagger.dependency_injection.component.AppComponent
import com.example.pg_dagger.dependency_injection.component.DaggerAppComponent
import com.example.pg_dagger.dependency_injection.module.ApplicationModule
import com.example.tmcommonkotlin.logz

class App : Application() {
    lateinit var component : AppComponent
    override fun onCreate() {
        logz("START")
        super.onCreate()
        instance = this
        component = DaggerAppComponent.builder().applicationModule(ApplicationModule()).build()
    }

    companion object {
        lateinit var instance: App
            private set
    }


    fun getMyComponent(): AppComponent {
        return component
    }
}
