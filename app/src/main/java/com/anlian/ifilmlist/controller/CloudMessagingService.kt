package com.anlian.ifilmlist.controller

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
const val TAG = "SERVICE"
class CloudMessagingService: FirebaseMessagingService() {
    override fun onNewToken(token: String) {
        super.onNewToken(token)
        Log.d(TAG, "onNewToken: $token")
    }
}