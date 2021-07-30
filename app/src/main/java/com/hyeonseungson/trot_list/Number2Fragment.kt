package com.hyeonseungson.trot_list

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Number2Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_number2, container, false)

        val items = mutableListOf<String>()
        items.add("숫자 2-1")
        items.add("숫자 2-2")
        items.add("숫자 2-3")
        items.add("숫자 2-4")
        items.add("숫자 2-5")
        items.add("숫자 2-6")
        items.add("숫자 2-7")
        items.add("숫자 2-8")
        items.add("숫자 2-9")
        items.add("숫자 2-10")
        items.add("숫자 2-11")
        items.add("숫자 2-12")
        items.add("숫자 2-13")
        items.add("숫자 2-14")
        items.add("숫자 2-15")
        items.add("숫자 2-16")
        items.add("숫자 2-17")
        items.add("숫자 2-18")
        items.add("숫자 2-19")
        items.add("숫자 2-20")

        val rv = view.findViewById<RecyclerView>(R.id.numberRv2)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter

        rv.layoutManager = LinearLayoutManager(context)

        val image1 = view.findViewById<ImageView>(R.id.image1)
        image1.setOnClickListener {
            it.findNavController().navigate(R.id.action_number2Fragment_to_number1Fragment)
        }

        val image3 = view.findViewById<ImageView>(R.id.image3)
        image3.setOnClickListener {
            it.findNavController().navigate(R.id.action_number2Fragment_to_number3Fragment)
        }

        return view
    }
}