package com.example.pg_dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pg_dagger.models.LoginModel
import com.example.pg_dagger.dependency_injection.component.DaggerAppComponent
import com.example.pg_dagger.dependency_injection.module.UserModule
import com.example.tmcommonkotlin.getToday
import com.example.tmcommonkotlin.logz
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var loginModel: LoginModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var component = DaggerAppComponent.builder()
            .userModule(UserModule())
            .build()
        component.inject(this)

        logz("Email:${loginModel.email} Phone:${loginModel.phone}")
    }
}
