package com.example.dialogfragmentdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.fragment.app.DialogFragment

class CustomDialog: DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        dialog?.requestWindowFeature(Window.FEATURE_NO_TITLE)
//        return super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.dialog_layout, container)
    }
}