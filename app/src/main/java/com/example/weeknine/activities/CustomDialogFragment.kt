package com.example.weeknine.activities

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.weeknine.R
import kotlinx.android.synthetic.main.fragment_custom_dialog.view.*

class CustomDialogFragment:DialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView:View=inflater.inflate(R.layout.fragment_custom_dialog, container, false)
        rootView.cancel.setOnClickListener {
            dismiss()
        }
        rootView.enter.setOnClickListener {  }
        return rootView
    }
}