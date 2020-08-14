package com.enigma.exercise_fragment.view_model

import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel(){
    var counter: Int = 0

    fun increase(){
        counter+=1
    }
    fun decrease(){
        counter-=1
    }
}