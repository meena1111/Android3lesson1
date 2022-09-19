package com.example.android3lesson1.presenter

import android.content.Context
import com.example.android3lesson1.Injector
import com.example.android3lesson1.View.CounterView
import com.example.android3lesson1.model.ModelCounter

class Presenter {

    lateinit var view: CounterView
    private val model = Injector.getModel()

    fun increment() {
       model.increment()
        view.updateCount(model.getCount().toString())
    }
    fun decrement(){
        model.decrement()
        view.updateCount(model.getCount().toString())
    }
    fun toast(context: Context){
        model.toast(context)
        view.updateCount(model.getCount().toString())
    }
    fun changeColor(): Boolean{
        model.changeColor()
        return  model.boolean
    }

    fun attachView(view: CounterView){
        this.view = view
    }
}