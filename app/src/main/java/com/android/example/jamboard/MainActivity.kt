package com.android.example.jamboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.android.example.jamboard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding :ActivityMainBinding
    private var aPerson :Person = Person("Ali","12345","ali@gmail.com","123 Jalan ABC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.personData=aPerson


        binding.btnUpdate.setOnClickListener(){

            aPerson.email="123@gmail.com"
            binding.apply { invalidateAll() }

        }



    }
}