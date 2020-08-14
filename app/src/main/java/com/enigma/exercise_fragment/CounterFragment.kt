package com.enigma.exercise_fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_counter.*


class CounterFragment : Fragment(), View.OnClickListener {

    lateinit var counterHandler: CounterHandler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        counterHandler = activity as CounterHandler
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_counter, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        increaseButton.setOnClickListener(this)
        decreaseButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            increaseButton ->{
                println("INCREASE BUTTON KEPANGGIL")
                counterHandler.notifyCounterIncrease()
            }
            decreaseButton ->{
                println("DECREASE BUTTON KEPANGGIL")
                counterHandler.notifyCounterDecrease()
            }
        }
    }
}
