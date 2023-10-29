package com.example.gmailkt

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class GmailAdapter(context: Context, dataArrayList : ArrayList<Gmail?>?) : ArrayAdapter<Gmail?>(context, R.layout.gmail,dataArrayList!!) {
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        var view = view
        val listGmail = getItem(position)

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.gmail, parent, false)
        }
        var image = view!!.findViewById<ImageView>(R.id.gmailImageComponent)
        var title = view.findViewById<TextView>(R.id.title)
        var summary = view.findViewById<TextView>(R.id.gmailSummary)
        var content = view.findViewById<TextView>(R.id.gmailContent)

        image.setImageResource(listGmail!!.image)
        title.text = listGmail.title
        summary.text = listGmail.summary
        content.text = listGmail.content
        return view
    }
}