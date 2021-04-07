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
        scalesList.add(CardViewClass("Заголовок 1 \nЗаголовок 1", "Roboto", "Regular", "Sentence", 34, 44, 0.25))
        scalesList.add(CardViewClass("Заголовок 2 \nЗаголовок 1", "Roboto", "Regular", "Sentence", 28, 36, 0.2))
        scalesList.add(CardViewClass("Заголовок 3 \nЗаголовок 3", "Roboto", "Regular", "Sentence", 24, 32, 0.0))
        scalesList.add(CardViewClass("Заголовок 4 \nЗаголовок 4", "Roboto", "Medium", "Sentence", 20, 26, 0.15))
        scalesList.add(CardViewClass("Подзаголовок 1 \nПодзаголовок 1", "Roboto", "Regular", "Sentence", 16, 20, 0.15))
        scalesList.add(CardViewClass("Подзаголовок 2 \nПодзаголовок 2", "Roboto", "Medium", "Sentence", 14, 24, 0.1))
        scalesList.add(CardViewClass("Тело 1 \nТело 1", "Roboto", "Regular", "Sentence", 16, 20, 0.44))
        scalesList.add(CardViewClass("Тело 1 медиум \n Тело 1 медиум", "Roboto", "Medium", "Sentence", 16, 20, 0.44))
        scalesList.add(CardViewClass("Тело 2 \nТело 2", "Roboto", "Regular", "Sentence", 14, 20, 0.25))
        scalesList.add(CardViewClass("Тело 2 медиум \nТело 2 медиум", "Roboto", "Medium", "Sentence", 14, 20, 0.25))
        scalesList.add(CardViewClass("Кнопка \nКнопка", "Roboto", "Medium", "UPPER", 16,20, 1.35))
        scalesList.add(CardViewClass("Подпись 1 \nПодпись 1", "Roboto", "Regular", "Sentence", 12, 16, 0.4))
        scalesList.add(CardViewClass("Подпись 2 \nПодпись 2", "Roboto", "Regular", "Sentence", 11, 14, 0.0))
        scalesList.add(CardViewClass("Оверлайн \nОверлайн", "Roboto", "Medium", "UPPER", 10, 14, 1.5))

        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.list)
        adapter = CardRecyclerAdapter(scalesList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}