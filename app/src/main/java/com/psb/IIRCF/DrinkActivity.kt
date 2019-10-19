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
        val drink = Drink.drinks[drinkid.toInt()]
        name.setText(drink.name)
        description.setText(drink.description)
        photo.setImageResource(drink.imageResourceId)
    }
}
