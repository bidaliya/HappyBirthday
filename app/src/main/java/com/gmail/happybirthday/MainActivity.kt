package com.gmail.happybirthday

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //this Createcard function will execute when OnClickListener execute

    fun Createcard(view: View) {

        val mp = MediaPlayer.create(this, R.raw.music)
        mp.start()

        val name = nameInput.editableText.toString() // this extract the string from the id called nameInput

        val toast = Toast.makeText(this, "name is $name", Toast.LENGTH_SHORT) // this makes a toast
        //here " this " corresponds to the current activity, i.e MainActivity.kt
        toast.show() // this shows a toast

        //here Intent is uses to jump from current activity to BirthdayGreetingActivity.
        //Intent also uses to jump from one activity to another location like Chrome or camera, etc
        //In this Intent constructor, we need to pass the context of current activity and the activity on which we need to open.

        val intent = Intent(this, BirthdayGreetingActivity::class.java)

        // we can also pass the data inside the intent.
        // intent.putExtra("name", name) // it accepts in the form of key, value pair. So here key is "name" and value is name


        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name) // here we have passed a companion object of name "NAME_EXTRA"

        // startActivity is the children of the AppCompatActivity(), so it can inherit the properties of its parent
        startActivity(intent)

    }


}