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


    override fun onHeadlineclick(headline: String) {
        Log.i(TAG,"from main activity --"+headline)//5
        //6
       var newsDetailsFragment: NewsDetailsFragment = supportFragmentManager.findFragmentById(R.id.newDetailsfragment) as NewsDetailsFragment
        newsDetailsFragment.setNews(headline)
    }
}