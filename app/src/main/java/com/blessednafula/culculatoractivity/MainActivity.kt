package com.blessednafula.culculatoractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etNum1:EditText
    lateinit var etNum2:EditText
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
     lateinit var btnDivision:Button
    lateinit var btnModulus:Button
    lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNum1=findViewById(R.id.etNum1)
        etNum2=findViewById(R.id.etNum2)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnDivision=findViewById(R.id.btnDivision)
        btnModulus=findViewById(R.id.btnModulus)
        tvResult=findViewById(R.id.tvResult)
        tvResult.setOnClickListener {

        }
        btnAdd.setOnClickListener {
            var num1 = etNum1.text.toString().toInt()
            var num2 = etNum2.text.toString().toInt()
            adddition(num1, num2)
        }
        btnSubtract.setOnClickListener {
            var num1 = etNum1.text.toString().toInt()
            var num2 = etNum2.text.toString().toInt()
            subtraction(num1, num2)
        }
        btnDivision.setOnClickListener {
            var num1 = etNum1.text.toString().toInt()
            var num2 = etNum2.text.toString().toInt()
            division(num1, num2)
        }
        btnModulus.setOnClickListener {
            var num1 = etNum1.text.toString().toInt()
            var num2 = etNum2.text.toString().toInt()
            modulus(num1, num2)
        }

    }
     fun division(num1: Int, num2: Int) {
        var  division=(num1/num2)
        tvResult.text.toString()

    }

    fun modulus(num1: Int, num2: Int) {
         var modulus=num1%num2
        tvResult.text.toString()

    }

     fun subtraction(num1: Int, num2: Int) {
        var subtraction=(num1-num2)
        tvResult.text.toString()

    }


    fun adddition(num1: Int, num2: Int) {
        var adddition=(num1+num2)
        tvResult.text.toString()

    }
}
