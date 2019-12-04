package jp.sadashi.sample.viewbind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.submit_button)
        button.setOnClickListener(::submit)
    }

    private fun submit(view: View) {
        // do something
        println("Click $view")
    }
}
