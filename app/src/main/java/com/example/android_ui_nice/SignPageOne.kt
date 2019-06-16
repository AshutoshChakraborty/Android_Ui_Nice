package com.example.android_ui_nice

import android.os.Bundle
import android.text.SpannableString
import android.text.style.UnderlineSpan
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.sigm_page_one.*


class SignPageOne : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sigm_page_one)
        val spannable = SpannableString("Sign up")
        spannable.setSpan(UnderlineSpan(), 0, spannable.length, 0)
        signUp.text = spannable

    }
}
