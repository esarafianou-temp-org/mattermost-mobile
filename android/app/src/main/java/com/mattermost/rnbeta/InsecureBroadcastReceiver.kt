package com.mattermost.rnbeta

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class InsecureBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val action = intent?.action ?: "unknown"
        val extrasSummary = intent?.extras?.toString() ?: "no extras"
        Log.w("InsecureReceiver", "Received broadcast action=$action extras=$extrasSummary")
        context?.let {
            Toast.makeText(it, "Received: $action", Toast.LENGTH_SHORT).show()
        }
    }
}


