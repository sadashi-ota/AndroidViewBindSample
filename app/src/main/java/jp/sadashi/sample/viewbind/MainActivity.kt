package jp.sadashi.sample.viewbind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submit_button.setOnClickListener(::submit)
        println("Button is $submit_button")
    }

    private fun submit(view: View) {
        // do something
        println("Click $view")
    }
}
