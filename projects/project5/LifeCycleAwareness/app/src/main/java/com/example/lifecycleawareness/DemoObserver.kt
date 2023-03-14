package com.example.lifecycleawareness

import android.util.Log
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.DefaultLifecycleObserver
import java.sql.Timestamp


class DemoObserver: DefaultLifecycleObserver {
    private val timeMillis = System.currentTimeMillis()
    private val timeStamp = Timestamp(timeMillis)

    private val LOG_TAG = "LifecycleAwarenessApp"
    private var logText = ""

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        logText = ("onResume was fired at " + timeStamp + "\n*****")
        Log.i(LOG_TAG, logText)

    }

    override fun onPause(owner: LifecycleOwner) {
        super.onResume(owner)
        logText = ("onPause was fired at " + timeStamp + "\n*****")
        Log.i(LOG_TAG, logText)
    }

    override fun onCreate(owner: LifecycleOwner) {
        super.onResume(owner)
        logText = ("onCreate was fired at " + timeStamp)
        Log.i(LOG_TAG, logText)
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onResume(owner)
        logText = ("onStart was fired at " + timeStamp)
        Log.i(LOG_TAG, logText)
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onResume(owner)
        logText = ("onStop was fired at " + timeStamp)
        Log.i(LOG_TAG, logText)
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onResume(owner)
        logText = ("onDestroy was fired at " + timeStamp + "\n*****")
        Log.i(LOG_TAG, logText)
    }


}