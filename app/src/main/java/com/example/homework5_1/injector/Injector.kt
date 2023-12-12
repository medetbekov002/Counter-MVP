package com.example.homework5_1.injector

import com.example.homework5_1.model.Model
import com.example.homework5_1.presenter.Presenter

class Injector {
    companion object {
        fun fillModel() = Model()
        fun fillPresenter() = Presenter()
    }
}