package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var todoList= mutableListOf<Todo>(
            Todo("Beat Ojaru",false),
            Todo("Take a bath",false),
            Todo("Eat momos",false),
            Todo("Go for ride",false),
            Todo("Study",false),
            Todo("Eat chocolates",false),
            Todo("Go for a jog",false),
            Todo("Play PUBG",false),
            Todo("Play with ojaru",false),
            Todo("Play with panda",false)
        )
        val myAdapter=TodoAdapter(todoList)
        rvTodos.adapter=myAdapter
        rvTodos.layoutManager=LinearLayoutManager(this)
        btnAdd.setOnClickListener {
            val title=etTodo.text.toString()
            val todoo=Todo(title,false)
            todoList.add(todoo)
            myAdapter.notifyItemInserted(todoList.size-1)
        }
    }
}