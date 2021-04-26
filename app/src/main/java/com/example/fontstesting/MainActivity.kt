package com.example.fontstesting

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter:CardRecyclerAdapter


    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val scalesList: ArrayList<CardViewClass> = ArrayList()
        scalesList.add(CardViewClass("Заголовок 1 \nЗаголовок 1", R.style.Header1))
        scalesList.add(CardViewClass("Заголовок 2 \nЗаголовок 2", R.style.Header2))
        scalesList.add(CardViewClass("Заголовок 3 \nЗаголовок 3", R.style.Header3))
        scalesList.add(CardViewClass("Заголовок 4 \nЗаголовок 4", R.style.Header4))
        scalesList.add(CardViewClass("Подзаголовок 1 \nПодзаголовок 1", R.style.Subtitle1))
        scalesList.add(CardViewClass("Подзаголовок 2 \nПодзаголовок 2", R.style.Subtitle1))
        scalesList.add(CardViewClass("Тело 1 \nТело 1", R.style.body1))
        scalesList.add(CardViewClass("Тело 1 медиум \nТело 1 медиум", R.style.body1_medium))
        scalesList.add(CardViewClass("Тело 2 \nТело 2", R.style.body2))
        scalesList.add(CardViewClass("Тело 2 медиум \nТело 2 медиум", R.style.body2_medium))
        scalesList.add(CardViewClass("Кнопка \nКнопка", R.style.button))
        scalesList.add(CardViewClass("Подпись 1 \nПодпись 1", R.style.Caption))
        scalesList.add(CardViewClass("Подпись 2 \nПодпись 2", R.style.Caption2))
        scalesList.add(CardViewClass("Оверлайн \nОверлайн", R.style.Overline))

        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.list)
        adapter = CardRecyclerAdapter(scalesList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}