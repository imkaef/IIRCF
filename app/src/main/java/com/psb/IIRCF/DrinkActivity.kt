package com.psb.IIRCF

import android.content.Intent
import android.nfc.NfcAdapter
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_drink.*


class DrinkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink)
        val drinkid = getIntent().getIntExtra(DrinkCategoryActivity.EXTRA_ID, -1);
        val drinkposition=getIntent().getIntExtra(DrinkCategoryActivity.EXTRA_POSITION, -1);
        val drink = Drink.drinks[drinkposition.toInt()]
        name.setText(drinkid.toString())
        description.setText(drinkposition.toString())
        photo.setImageResource(drink.imageResourceId)
    }
}
