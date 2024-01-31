package mx.edu.itesca.preexamenu1

import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var gc: Double = 0.0
    var gf: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etC: EditText = findViewById(R.id.etC)
        val etF: EditText = findViewById(R.id.etF)
        val btnGC: Button = findViewById(R.id.btnGC)
        val btnGF: Button = findViewById(R.id.btnGF)

        // Método de listener botones
        btnGC.setOnClickListener {
            ConvertirGCF()
            etC.setText(gc.toString())
        }

        btnGF.setOnClickListener {
            ConvertirGFC()
            etF.setText(gf.toString())
        }
    }

    fun ConvertirGCF() {
        val fahrenheitText = findViewById<EditText>(R.id.etF).text.toString()
        if (fahrenheitText.isNotEmpty()) {
            gf = fahrenheitText.toDouble()
            gc = (gf - 32) / 1.8
        }
    }

    fun ConvertirGFC() {
        val celsiusText = findViewById<EditText>(R.id.etC).text.toString()
        if (celsiusText.isNotEmpty()) {
            gc = celsiusText.toDouble()
            gf = gc * 1.8 + 32
        }
    }
}