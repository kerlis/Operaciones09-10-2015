package com.kotlin.order.coffee.operaciones

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.widget.Button
import android.widget.LinearLayout

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        var linearLayout =  findViewById(R.id.linearlayout) as LinearLayout

        var button1 = Button(this)
        button1.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT)
        button1.setText("hacer click")

        button1.setOnClickListener {
            button1.setText("hizo click")

        }
        linearLayout.addView(button1)



/*
        var constraintlayout =  ConstraintLayout(this)
        var button2 = Button(this)
        button2.layoutParams = ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT)
        button2.setText("hacer click")

        button2.setOnClickListener {
            button2.setText("hizo click")

        }
        constraintlayout.addView(button2)

*/



    }
}
