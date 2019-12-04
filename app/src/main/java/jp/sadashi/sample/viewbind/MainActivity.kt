package jp.sadashi.sample.viewbind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick

class MainActivity : AppCompatActivity() {
    @BindView(R.id.submit_button)
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        println("Button is $button")
    }

    @OnClick(R.id.submit_button)
    fun submit(view: View) {
        // do something
        println("Click $view")
    }
}
