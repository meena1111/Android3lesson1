package com.example.android3lesson1.View

import android.content.Context
import android.widget.Toast
import com.example.android3lesson1.model.ModelCounter

interface CounterView {

    fun updateCount(count: String)
}