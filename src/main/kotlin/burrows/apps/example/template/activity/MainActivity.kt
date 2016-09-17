package burrows.apps.example.template.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import burrows.apps.example.template.R

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class MainActivity : AppCompatActivity() {

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_main)
    }
}
