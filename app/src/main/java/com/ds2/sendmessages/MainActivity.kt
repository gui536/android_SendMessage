package com.ds2.sendmessages

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

const val EXTRA_MESSAGE = "com.ds2.sendmessages.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

 fun sendMessage(view : View){
    val textMessage = findViewById<EditText>(R.id.TextMessage)
/*  Essas linhas mostram o valor de displayMessage na própria Activity.
    Removidas pois iremos mostrar esse valor na próxima activity
    val displayMessage = findViewById<TextView>(R.id.displayMessage)
    displayMessage.text = textMessage.text */
    val message = textMessage.text.toString()
    val intent = Intent(this, DisplayMessageActivity::class.java).apply { putExtra(EXTRA_MESSAGE, message) }
    startActivity(intent)
 }
}