package com.example.pg_dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pg_dagger.models.LoginModel
import com.example.pg_dagger.dependency_injection.component.DaggerAppComponent
import com.example.pg_dagger.dependency_injection.module.ApplicationModule
import com.example.tmcommonkotlin.logz
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var loginModel: LoginModel

    @Inject
    @field:Named("STRING_B")
    lateinit var theString: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var component = DaggerAppComponent.builder()
//            .applicationModule(ApplicationModule())
//            .build()
//        component.inject(this)
        App.instance.component.inject(this)

        logz("Email:${loginModel.email} Phone:${loginModel.phone}")
    }
}

// RetrofitBuilder