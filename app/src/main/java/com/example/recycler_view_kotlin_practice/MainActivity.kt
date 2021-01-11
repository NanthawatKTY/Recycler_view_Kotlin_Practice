package com.example.recycler_view_kotlin_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var conduitLists = mutableListOf(
            Conduits("Type 1", 15.0, 10),
            Conduits("Type 2", 15.0, 1),
            Conduits("Type 3", 15.0, 120),
            Conduits("Type 4", 15.0, 5)
        )

        val adapter = ConduitAdapter(conduitLists)
        rvConduit.adapter = adapter
        rvConduit.layoutManager = LinearLayoutManager(this)

        AddConduitBtn.setOnClickListener {
            val titleType = edtAddTxtType.text.toString()
            val titleSize = edtAddTxtSize.text.toString()
            val titleAmount = edtAddTxtAmount.text.toString()
            val conduit = Conduits(titleType, titleSize.toDouble(), titleAmount.toInt())
            conduitLists.add(conduit)
            adapter.notifyItemInserted(conduitLists.size - 1)
        }
    }
}