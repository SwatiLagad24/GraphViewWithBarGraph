package com.example.graphview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var graphView:Graphview
    private val marks= IntArray(5)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
             marks[0]=90
        marks[1]=80
        marks[2]=60
        marks[3]=50
        marks[4]=70
        setContentView(R.layout.activity_main)
        graphView=findViewById(R.id.GraphId)


        graphView.values=marks
    }
}