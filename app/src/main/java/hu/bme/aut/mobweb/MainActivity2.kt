package hu.bme.aut.mobweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.content_main.*
import java.util.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("activityLifecycle", "onCreate")
        setContentView(R.layout.activity_main2)

        btnShow.setOnClickListener{
            Log.d("buttonpressed", "Start")
            Snackbar.make(containerElement, "Hello from Snackbar", Snackbar.LENGTH_LONG).show()
            Toast.makeText(this,
                "Hello " + inputName.text + ", The date   is " + Calendar.getInstance().time.toString(),
                Toast.LENGTH_LONG).show()
            txtDate.text = Calendar.getInstance().time.toString()
        }

    }
}