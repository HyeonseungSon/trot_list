package com.hyeonseungson.trot_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Number3Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_number3, container, false)

        val items = mutableListOf<String>()
        items.add("숫자 3-1")
        items.add("숫자 3-2")
        items.add("숫자 3-3")
        items.add("숫자 3-4")
        items.add("숫자 3-5")
        items.add("숫자 3-6")
        items.add("숫자 3-7")
        items.add("숫자 3-8")
        items.add("숫자 3-9")
        items.add("숫자 3-10")
        items.add("숫자 3-11")
        items.add("숫자 3-12")
        items.add("숫자 3-13")
        items.add("숫자 3-14")
        items.add("숫자 3-15")
        items.add("숫자 3-16")
        items.add("숫자 3-17")
        items.add("숫자 3-18")
        items.add("숫자 3-19")
        items.add("숫자 3-20")

        val rv = view.findViewById<RecyclerView>(R.id.numberRv3)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter

        rv.layoutManager = LinearLayoutManager(context)

        val image1 = view.findViewById<ImageView>(R.id.image1)

        image1.setOnClickListener {
            it.findNavController().navigate(R.id.action_number3Fragment_to_number1Fragment)
        }

        val image2 = view.findViewById<ImageView>(R.id.image2)

        image2.setOnClickListener {
            it.findNavController().navigate(R.id.action_number3Fragment_to_number2Fragment)
        }

        return view
    }
}