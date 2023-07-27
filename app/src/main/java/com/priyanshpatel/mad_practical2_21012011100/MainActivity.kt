package com.priyanshpatel.mad_practical2_21012011100

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity()"
     fun showMessage(message:String){
         Log.i(TAG, message: )
         Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
     }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        showMessage("onCreate method is called")

    }
    override fun onStart(){
        super.onStart()
        showMessage("onStart method is called")
    }

    override fun onCreate
}