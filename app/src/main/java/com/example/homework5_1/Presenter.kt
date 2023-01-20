package com.example.homework5_1

class Presenter {
    private val model = Model()
    lateinit var view: View

    fun increment() {
        model.increment()
        view.changeCount(model.count)
    }

    fun attachView(view: View) {
        this.view = view
    }
}