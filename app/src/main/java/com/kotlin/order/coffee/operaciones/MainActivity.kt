package com.kotlin.order.coffee.operaciones
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
         val txtcifra1 = findViewById(R.id.txtcifra1) as TextView
         val txtcifra2 = findViewById(R.id.txtcifra2) as TextView
         val txtresultado = findViewById(R.id.txtresultado) as TextView
            val btnsuma = findVieyId(R.id.btnsuma) as Button
         btnsuma.setOnClickListener {
             var primero = txtcifra1.text.toString().toInt()
             var segundo = txtcifra2.text.toString().toInt()
             var valor =  primero + segundo
             txtresultado.setText(" " + valor + " " )
         }
         */
}


fun suma(view: View){
  var txtcifra1 = findViewById(R.id.txtcifra1) as TextView
  var txtcifra2 = findViewById(R.id.txtcifra2) as TextView
  var txtresultado = findViewById(R.id.txtresultado) as TextView
  var primero = txtcifra1.text.toString().toInt()
  var segundo = txtcifra2.text.toString().toInt()
  var valor =  primero + segundo
  txtresultado.setText("" + valor  + "")
}

fun division(view: View){
  var txtcifra1 = findViewById(R.id.txtcifra1) as TextView
  var txtcifra2 = findViewById(R.id.txtcifra2) as TextView
  var txtresultado = findViewById(R.id.txtresultado) as TextView
  var primero = txtcifra1.text.toString().toInt()
  var segundo = txtcifra2.text.toString().toInt()
  var valor =  primero / segundo
  txtresultado.setText("" + valor  + "")
}

fun resta(view: View){
  var txtcifra1 = findViewById(R.id.txtcifra1) as TextView
  var txtcifra2 = findViewById(R.id.txtcifra2) as TextView
  var txtresultado = findViewById(R.id.txtresultado) as TextView
  var primero = txtcifra1.text.toString().toInt()
  var segundo = txtcifra2.text.toString().toInt()
  var valor =  primero - segundo
  txtresultado.setText("" + valor  + "")
}

fun multiplicacion(view: View){
  var txtcifra1 = findViewById(R.id.txtcifra1) as TextView
  var txtcifra2 = findViewById(R.id.txtcifra2) as TextView
  var txtresultado = findViewById(R.id.txtresultado) as TextView
  var primero = txtcifra1.text.toString().toInt()
  var segundo = txtcifra2.text.toString().toInt()
  var valor =  primero * segundo
  txtresultado.setText("" + valor  + "")
}
}
