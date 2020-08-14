package com.enigma.exercise_fragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CounterHandler {

    lateinit var counterFragment: CounterFragment
    lateinit var counterShowFragment: CounterShowFragment

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        counterFragment = fragment as CounterFragment
        counterShowFragment = fragment2 as CounterShowFragment
        println("MAIN_ACTIVITY this = $this")
    }

    override fun notifyCounterIncrease(){
        counter+=1
        counterShowFragment.notifyCounterChange(counter)
    }

    override fun notifyCounterDecrease(){
        counter-=1
        counterShowFragment.notifyCounterChange(counter)
    }

    fun toSecondActivity(view: View) {
        startActivity(Intent(this, SecondActivity::class.java))
    }
}
