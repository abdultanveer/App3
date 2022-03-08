package com.abdul.app3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

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

    //async -- await --- use aysnc when you want some data tobe returned
    //this coroutine can keep running as long as the application is active
 /*   suspend fun fetchUser(): User {
        return GlobalScope.async(Dispatchers.IO) {
            // make network call
            // return user
        }.await()
    }*/

    suspend fun fetchAndShowUser() {
        //val user = fetchUser() // fetch on IO thread
       // showUser(user) // back on UI thread
    }

    fun showUser(user: User) {
        // show user
    }
}