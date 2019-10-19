package com.psb.IIRCF

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import kotlinx.android.synthetic.main.activity_drink_category.*

class DrinkCategoryActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_ID = "id"
        const val EXTRA_POSITION = "position"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink_category)
        val listAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, Drink.drinks)
        list_drinks.setAdapter(listAdapter)
        //Передача напитка, выбранного пользователем
        list_drinks.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DrinkActivity::class.java)
            intent.putExtra(EXTRA_POSITION,position)
            intent.putExtra(EXTRA_ID,id)
            startActivity(intent)
        }
    }
}
