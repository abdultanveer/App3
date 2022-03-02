package com.abdul.app3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class NewsDetailsFragment : Fragment() {
    lateinit var tvNews:TextView //7

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         super.onCreateView(inflater, container, savedInstanceState)
        var layout : View = inflater.inflate(R.layout.fragment_newsdetails,container,false)
        tvNews = layout.findViewById(R.id.textViewNewsDetail)
        return layout;
    }

    fun setNews(headline: String) {
        tvNews.setText(headline) //8
    }
}