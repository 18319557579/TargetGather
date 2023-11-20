package com.example.targetgather

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.utilsgather.lifecycle_callback.CallbackActivity
import com.example.utilsgather.logcat.LogUtil

class ResponseSchemeActivity : CallbackActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_response_scheme)

        getInfo(intent)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        getInfo(intent!!)
    }

    private fun getInfo(intent: Intent) {
        LogUtil.d("scheme:" + intent.scheme)
        val uri = intent.data
        LogUtil.d( "scheme: " + uri?.scheme)
        LogUtil.d( "host: " + uri?.host)
        LogUtil.d( "port: " + uri?.port)
        LogUtil.d( "path: " + uri?.path)
        LogUtil.d( "queryString: " + uri?.query)
        LogUtil.d( "queryParameter: " + uri?.getQueryParameter("car_id"))
    }
}