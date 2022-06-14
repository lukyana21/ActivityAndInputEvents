package id.lukyana.activityandinputevents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputPanjang: EditText = findViewById(R.id.isiPanjang)
        val inputLebar: EditText = findViewById(R.id.isiLebar)
        val inputTinggi: EditText = findViewById(R.id.isiTinggi)
        val tombol: Button = findViewById(R.id.tombolHitung)
        val hasilHitung: TextView = findViewById(R.id.hasil)

        tombol.setOnClickListener {
            val panjang = inputPanjang.text.toString()
            val lebar = inputLebar.text.toString()
            val tinggi = inputTinggi.text.toString()

            if(panjang.isBlank() || lebar.isBlank() || tinggi.isBlank()){
                hasilHitung.text = "Tidak boleh kosong"
            }else{
                val hasil = (panjang.toDouble() * lebar.toDouble() * tinggi.toDouble()).toString()
                hasilHitung.text = hasil
            }
        }
    }
}