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

class Number1Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_number1, container, false)

        val items = mutableListOf<String>()
        items.add("숫자 1-1")
        items.add("숫자 1-2")
        items.add("숫자 1-3")
        items.add("숫자 1-4")
        items.add("숫자 1-5")
        items.add("숫자 1-6")
        items.add("숫자 1-7")
        items.add("숫자 1-8")
        items.add("숫자 1-9")
        items.add("숫자 1-10")
        items.add("숫자 1-11")
        items.add("숫자 1-12")
        items.add("숫자 1-13")
        items.add("숫자 1-14")
        items.add("숫자 1-15")
        items.add("숫자 1-16")
        items.add("숫자 1-17")
        items.add("숫자 1-18")
        items.add("숫자 1-19")
        items.add("숫자 1-20")

        Log.d("Check" , items.toString())

        val rv = view.findViewById<RecyclerView>(R.id.numberRv1)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter

        rv.layoutManager = LinearLayoutManager(context)


        val image2 = view.findViewById<ImageView>(R.id.image2)

        image2.setOnClickListener {
            it.findNavController().navigate(R.id.action_number1Fragment_to_number2Fragment)

        }
        val image3 = view.findViewById<ImageView>(R.id.image3)

        image3.setOnClickListener {
            it.findNavController().navigate(R.id.action_number1Fragment_to_number3Fragment)
        }

        return view
    }
}