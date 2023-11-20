package com.example.targetgather

import android.content.Intent
import android.os.Bundle
import com.example.utilsgather.lifecycle_callback.CallbackActivity


class MainActivity : CallbackActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
    }
}