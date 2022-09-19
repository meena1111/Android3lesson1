package com.example.android3lesson1

import com.example.android3lesson1.model.ModelCounter
import com.example.android3lesson1.presenter.Presenter

class Injector {

    companion object{
        fun getPresenter(): Presenter {
            return Presenter()

        }
        fun getModel():ModelCounter {
            return ModelCounter()
        }
    }
}