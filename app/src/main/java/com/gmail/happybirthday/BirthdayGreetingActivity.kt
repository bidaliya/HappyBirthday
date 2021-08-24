package com.gmail.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA:String = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        //now we have to extract the intent that we have passed from main activity to this activity and because we had passed a string
        //that's why we will use getStringExtra

        val name = intent.getStringExtra(NAME_EXTRA)

        // val name = intent.getStringExtra("name")
        // put the key in the arguments which u want to get here. So the value corresponds to the key NAME_EXTRA is name

        //  val message = intent.getStringExtra(EXTRA_MESSAGE)

        birthdayGreeting.text = "Happy Birthday\n $name !!"

    }
}