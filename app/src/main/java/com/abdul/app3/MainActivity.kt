package com.abdul.app3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity(), HeadlinesFragment.HeadlinesClickListener { //3a
    companion object{
        var TAG = MainActivity::class.java.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onHeadlineclick(headline: String) {
        Log.i(TAG,"from main activity --"+headline)//5
        //6
       var newsDetailsFragment: NewsDetailsFragment = supportFragmentManager.findFragmentById(R.id.newDetailsfragment) as NewsDetailsFragment
        newsDetailsFragment.setNews(headline)
    }
}