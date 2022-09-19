package com.example.android3lesson1.model

import android.content.Context
import android.widget.Toast

class ModelCounter {

    private var count = 0
    var boolean = false

    fun increment(){
        ++count
    }
    fun decrement(){
        --count
    }
    fun toast(context: Context){
        if (count == 10){
            Toast.makeText(context, "Поздравляем!",Toast.LENGTH_SHORT).show()
        }
    }
    fun changeColor():Boolean{
        if (count>14){
            boolean = true
        } else boolean = false
        return  boolean
    }

    fun getCount(): Int {
        return count
    }
}