package edu.temple.classactivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var myButton : Button
    lateinit var inputText: EditText
    lateinit var textview: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         myButton = findViewById(R.id.button)
        inputText = findViewById(R.id.inputText)

        findViewById<Button>(R.id.button).setOnClickListener {
            if(inputText.text.isNotEmpty()){
                textview.text = "Hello" + inputText.text + "Welcome!"
                inputText.setText("")
            }
            else{
                textview.text = "Please enter your name!"
            }
        }
    }
}