package hu.bme.aut.mobweb

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

class Lesson_1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_1)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Moved to Lesson 2 Activity", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
            val intent = Intent(this, Lesson_2::class.java).apply {
                putExtra("EXTRA_MESSAGE", "message")
            }
            startActivity(intent)
        }
    }
}