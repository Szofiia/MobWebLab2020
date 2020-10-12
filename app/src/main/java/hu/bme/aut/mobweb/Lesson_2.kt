package hu.bme.aut.mobweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_lesson_2.*
import java.util.*

class Lesson_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_2)
        pressButton.setOnClickListener{
            // Toast.makeText(this,"Hello " + inputName.text + " the time is: "
            //        + Calendar.getInstance().time.toString(), Toast.LENGTH_LONG).show()
            Snackbar.make(lesson2Container,
                "Hello ${inputName.text}," +
                " the time is: ${Calendar.getInstance().time}", Snackbar.LENGTH_LONG).show()
            dateText.text = Calendar.getInstance().time.toString()

        }
    }
}