package jp.sadashi.sample.viewbind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import jp.sadashi.sample.viewbind.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.submitButton.setOnClickListener(::submit)
    }

    private fun submit(view: View) {
        // do something
        println("Click $view")
    }
}
