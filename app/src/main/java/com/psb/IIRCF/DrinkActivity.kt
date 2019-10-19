package com.psb.IIRCF

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_drink.*


class DrinkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink)
        val drinkid = getIntent().getExtras().get("id")
        val drink = Drink.drinks[drinkid as Int]
        name.setText(drink.name)
        description.setText(drink.description)
        photo.setImageResource(drink.imageResourceId)
    }
}
