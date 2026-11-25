package com.baism.cw2

import android.app.Activity
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val input = EditText(this).apply {
            hint = getString(R.string.hint)
            inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
        }
        val result = TextView(this)
        val button = Button(this).apply {
            text = getString(R.string.check)
            setOnClickListener { result.text = PasswordValidator.describe(input.text.toString()) }
        }

        setContentView(
            LinearLayout(this).apply {
                orientation = LinearLayout.VERTICAL
                setPadding(48, 48, 48, 48)
                addView(input)
                addView(button)
                addView(result)
            }
        )
    }
}
