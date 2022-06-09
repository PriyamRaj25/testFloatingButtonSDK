package com.example.bugreportsdk

import android.app.Activity
import android.content.Context
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class AddBugReportButton(){

    companion object {
        fun addButton(myContext: Context) {

            val myActivity = myContext as Activity
            val viewGroup =
                (myActivity.findViewById(android.R.id.content) as ViewGroup).getChildAt(0) as ViewGroup

            val floatingButton = FloatingActionButton(myContext)

            //TODO different layout types would have different layout_params

            floatingButton.setLayoutParams(
                FrameLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                )
            )



            viewGroup.addView(floatingButton)
        }
    }

}