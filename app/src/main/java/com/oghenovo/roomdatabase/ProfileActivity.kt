package com.oghenovo.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val newName : TextView = findViewById<TextView>(R.id.name1)
        val newEmail : TextView = findViewById<TextView>(R.id.emal1)
        val newPhone : TextView = findViewById<TextView>(R.id.phone1)

        val bundle : Bundle?= intent.extras
        val nameInput = bundle!!.getString("nameInput")
        val emailInput = bundle.getString("emailInput")
        val phoneInput = bundle.getString("phoneInput")

        newName.text = nameInput
        newEmail.text = emailInput
        newPhone.text = phoneInput


    }
}