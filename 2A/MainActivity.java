package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import java.util.Random


class MainActivity : AppCompatActivity() {
    var f: EditText? = null
    var s: EditText? = null
    var result: TextView? = null
    var btn1: Button? = null
    var btn2: Button? = null
    var btn3: Button? = null
    var btn4: Button? = null
    var clear: Button? = null
    var cl: ConstraintLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        f = findViewById<EditText?>(R.id.t1)
        s = findViewById<EditText?>(R.id.t2)
        result = findViewById<TextView?>(R.id.t3)
        btn1 = findViewById<Button?>(R.id.button1)
        btn2 = findViewById<Button?>(R.id.button2)
        btn3 = findViewById<Button?>(R.id.button3)
        btn4 = findViewById<Button?>(R.id.button4)
        clear = findViewById<Button?>(R.id.button5)
        cl = findViewById<ConstraintLayout?>(R.id.cl)
        btn1!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val editing1 = f!!.getText().toString()
                val editing2 = s!!.getText().toString()
                val n1 = editing1.toInt()
                val n2 = editing2.toInt()
                val sum = n1 + n2
                result!!.setText("Sum is " + sum)
                result!!.setTextColor(Color.parseColor("#A10404"))
            }
        })
        btn2!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val editing1 = f!!.getText().toString()
                val editing2 = s!!.getText().toString()
                val n1 = editing1.toInt()
                val n2 = editing2.toInt()
                val diA = n1 - n2
                result!!.setText("DiAerence is " + diA)
                result!!.setTextColor(Color.parseColor("#4CAF50"))
            }
        })
        btn3!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val editing1 = f!!.getText().toString()
                val editing2 = s!!.getText().toString()
                val n1 = editing1.toInt()
                val n2 = editing2.toInt()
                val prod = n1 * n2
                result!!.setText("Product is " + prod)
                result!!.setTextColor(Color.parseColor("#2196F3"))
            }
        })
        btn4!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val editing1 = f!!.getText().toString()
                val editing2 = s!!.getText().toString()
                val n1 = editing1.toInt()
                val n2 = editing2.toInt()
                val q = n1 / n2
                result!!.setText("Quotient is " + q)
                result!!.setTextColor(Color.parseColor("#E1789C"))
            }
        })
        clear!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                f!!.setText("0")
                s!!.setText("0")
                result!!.setText("0")
                val r = Random()
                cl!!.setBackgroundColor(Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256)))
            }
        })
        cl!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                val r = Random()
                cl!!.setBackgroundColor(Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256)))
            }
        })
    }
}
