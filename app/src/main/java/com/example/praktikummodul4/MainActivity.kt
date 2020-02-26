package com.example.praktikummodul4

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    fun imgButtonCancel (view: View){
            editNama.text.clear()
            radioGroup.clearCheck()
        }
    fun imgButtonAdd (view: View) {
            val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
            val radioButtonP = radioGroup.checkedRadioButtonId
            val radioButtonW = findViewById<RadioButton>(radioButtonP)
            val radioview = radioButtonW.text

            val nama = findViewById<EditText>(R.id.editNama)
            val namaview = nama.text
            val keluar = Toast.makeText(applicationContext, "nama: " + namaview+ " Gender: " +radioview, Toast.LENGTH_LONG).show()

            val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
    fun cekcoding(view: View) {
        val cbcoding = cbCoding.isChecked
        val tuliscbcod = findViewById<CheckBox>(R.id.cbCoding)
        if (cbcoding==true)
        {
            hobi("pilih","Hobi " + tuliscbcod.text)
        }
        if (cbcoding==false){
            hobi("tidak","Hobi " + tuliscbcod.text)
        }
    }
    fun cekreading(view: View) {

        val cbreading = cbReading.isChecked
        val tulisreading = findViewById<CheckBox>(R.id.cbReading)
        if (cbreading==true)
        {
            hobi("pilih","Hobi " + tulisreading.text)
        }
        if (cbreading==false){
            hobi("tidak","Hobi " + tulisreading.text)
        }
    }
    fun cbtravel(view: View) {

        val cbtravel = cbTraveling.isChecked
        val tulistravel = findViewById<CheckBox>(R.id.cbTraveling)
        if (cbtravel==true)
        {
            hobi("pilih","Hobi " + tulistravel.text)
        }
        if (cbtravel==false){
            hobi("tidak","Hobi " + tulistravel.text)
        }
    }
    fun hobi (hasil:String,isi:String) {
        if (hasil == "pilih") {
            Toast.makeText(this@MainActivity, "Anda memilih " + isi, Toast.LENGTH_SHORT).show()
        } else if (hasil == "tidak") {
            Toast.makeText(this@MainActivity, "Anda Membatalkan Pilihan " + isi, Toast.LENGTH_SHORT)
                .show()
        }
    }
}
