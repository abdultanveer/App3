package com.abdul.app3

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class NewsDetailsFragment : Fragment() {
    lateinit var tvNews:TextView //7

    companion object{
        var TAG = NewsDetailsFragment::class.java.simpleName
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         super.onCreateView(inflater, container, savedInstanceState)
        Log.i(HeadlinesFragment.TAG,"oncreateview")
        var layout : View = inflater.inflate(R.layout.fragment_newsdetails,container,false)
        tvNews = layout.findViewById(R.id.textViewNewsDetail)
        return layout;
    }

    fun setNews(headline: String) {
        tvNews.setText(headline) //8
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.i(TAG,"onAttach")

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG,"oncreate")
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i(TAG,"onActivityCreated")
        var a: String = "abc"
       // a = null
    }
    override fun onStart() {
        super.onStart()
        Log.i(TAG,"onstart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"onresume")

    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"onpause")

    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"onstop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"onstop")
    }
}