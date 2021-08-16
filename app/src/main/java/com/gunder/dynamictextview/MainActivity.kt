package com.gunder.dynamictextview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        inisialisasi variabel
        val layout = findViewById<RelativeLayout>(R.id.root)

//        membuat textView secara terprogram
        val textView = TextView(this)

//        setting width dan height
        textView.layoutParams = RelativeLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT)

//        melakukan setting text
        textView.text = "GUNADERMAWAN"
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 40f)
        textView.setTextColor(Color.MAGENTA)
//        aksi ketika diklik
        textView.setOnClickListener(){
            Toast.makeText(this@MainActivity,"Hello Gunder",Toast.LENGTH_SHORT).show()
        }

//        menambahkan textView kedalam LinearLayout
        layout?.addView(textView)

    }
}