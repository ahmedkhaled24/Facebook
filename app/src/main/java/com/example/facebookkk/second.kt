package com.example.facebookkk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_second.*

class second : AppCompatActivity() , TextWatcher {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Edit_email.addTextChangedListener(this)
        Edit_passs.addTextChangedListener(this)

        icon_image.animate().translationYBy(-520f).scaleX(0.65f).scaleY(0.65f).duration=1300

    }

    override fun afterTextChanged(s: Editable?) {}

    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
        var email = Edit_email.text.toString()
        var password = Edit_passs.text.toString()
        btn_login.isEnabled = email.isNotEmpty() && password.isNotEmpty()
    }
}
