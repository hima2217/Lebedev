package com.example.project1


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.math.RoundingMode
import java.math.BigDecimal
import kotlin.toString as toString1

class MainActivity : AppCompatActivity() {
    private val kurs = 74
    private var a: Double? = null
    private var result: Double? = null
    private var edSum: EditText? = null
    private var txtRes: TextView? = null
    private var txtRub: TextView? = null
    private var txtDol: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edSum = findViewById(R.id.edSum)
        txtRes = findViewById(R.id.txtRes)
        txtRub = findViewById(R.id.txtRub)
        txtDol = findViewById(R.id.txtDol)



    }
    fun Generate (view: View) {
        if (txtRub?.text?.equals("Рубли")!!) {
            a = edSum?.text.toString1().toDouble()
            result = a!! / kurs
            var decimal = BigDecimal(result!!).setScale(2, RoundingMode.HALF_EVEN)
            txtRes?.text = decimal!!.toString()

        }
        else {
            a = edSum?.text.toString1().toDouble()
            result = a!! * kurs
            var decimal = BigDecimal(result!!).setScale(2, RoundingMode.HALF_EVEN)
            txtRes?.text = decimal!!.toString()
        }

    }
    fun Swap (view: View) {
        if(txtRub?.text?.equals("Рубли")!!){
            txtRub!!.text = "Доллары"
            txtDol!!.text = "Рубли"
        }
        else {
                txtDol!!.text = "Доллары"
                txtRub!!.text = "Рубли"
        }
    }
}
