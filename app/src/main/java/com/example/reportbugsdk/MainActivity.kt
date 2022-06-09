package com.example.reportbugsdk

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import com.example.bugreportsdk.AddBugReportButton

//import com.example.bugreportsdk.AddBugReportButton


class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AddBugReportButton.addButton(this)

    }

}