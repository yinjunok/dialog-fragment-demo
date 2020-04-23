package com.example.dialogfragmentdemo

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class LoginDialog: DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
//        return super.onCreateDialog(savedInstanceState)
        val builder = AlertDialog.Builder(activity)
        val inflater = activity?.layoutInflater
        val view = inflater?.inflate(R.layout.login_dialog, null)
        builder.setView(view)
        builder.setPositiveButton("Sign in"
        ) { _, _ -> {

        }}.setNegativeButton("Cancel", null)

        return builder.create()
    }
}