package com.mattermost.rnbeta

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class AuxSyncService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val action = intent?.action ?: "unknown"
        val extras = intent?.extras?.toString() ?: "no extras"
        Log.w("AuxSyncService", "Started with action=$action extras=$extras")
        // No-op work; return without foreground, no permission checks
        stopSelf(startId)
        return START_NOT_STICKY
    }
}


