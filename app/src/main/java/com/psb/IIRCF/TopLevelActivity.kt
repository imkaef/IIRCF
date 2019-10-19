package com.psb.IIRCF

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_top_level.*
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class TopLevelActivity : AppCompatActivity() {
//Code | Convert Java File to Kotlin File Ctrl+Shift+Alt+K.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_level)
    list_options.setOnItemClickListener(){
            parent, view, position, id ->
            if(position == 0){
                val intent = Intent(this, DrinkCategoryActivity::class.java)
                startActivity(intent)
            }

        }
    }
}
