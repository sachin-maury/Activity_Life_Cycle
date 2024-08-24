package com.hedroid.activitylifecycle

import android.os.Bundle
import android.util.Log
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("TAG ", "onCreate: I am a Running")
        Toast.makeText(this ,"onCreate" ,Toast.LENGTH_SHORT).show()

    }

    override fun onStart(){
        super.onStart()
        Log.d("TAG" , "onStart: I am a Running")
        Toast.makeText(this ,"onStart" ,Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG ", "onResume: I am a Running")
        Toast.makeText(this ,"onResume" ,Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG" , "onPause: I am a Running")
        Toast.makeText(this ,"onPause" ,Toast.LENGTH_SHORT).show()
    }
    override fun onStop() {
        super.onStop()
        Log.d("TAG ", "onStop: I am a Running")
        Toast.makeText(this ,"onStop" ,Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("TAG ", "onRestart: I am a Running")
        Toast.makeText(this ,"onRestart" ,Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG" , "onDestroy: I am a Running")

        Toast.makeText(this ,"onDestroy" ,Toast.LENGTH_SHORT).show()
    }


}