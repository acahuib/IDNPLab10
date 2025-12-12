package com.example.lab10

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class LogWorker(context: Context, params: WorkerParameters) : Worker(context, params) {

    override fun doWork(): Result {
        Log.d("LogWorker", "Ejecutando tarea en segundo plano con WorkManager...")

        return Result.success()
    }
}
