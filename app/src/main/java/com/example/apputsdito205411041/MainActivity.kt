package com.example.apputsdito205411041

import android.content.Intent
import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun toArticle(view: View) {
        //berfungsi membuat variabel intent dengan dan diisi dengan menggunakan sintaks dari
        //pemanggilan function Intent dengan memanggil class MainActivity2
        val intent = Intent(this@MainActivity, ArticleActivity::class.java)
        //memanggil function startActivity dengan paramater nilai dari variabel intent
        startActivity(intent)
    }
    fun toCloudServerList(view: View) {
        //berfungsi membuat variabel intent dengan dan diisi dengan menggunakan sintaks dari
        //pemanggilan function Intent dengan memanggil class MainActivity2
        val intent = Intent(this@MainActivity, CloudServerActivity::class.java)
        //memanggil function startActivity dengan paramater nilai dari variabel intent
        startActivity(intent)
    }
    fun toLinkCS(view: View) {
        //berfungsi membuat variabel intent dengan dan diisi dengan menggunakan sintaks dari
        //pemanggilan function Intent dengan memanggil class MainActivity2
        val intent = Intent(this@MainActivity, CSLinkActivity::class.java)
        //memanggil function startActivity dengan paramater nilai dari variabel intent
        startActivity(intent)
    }
}