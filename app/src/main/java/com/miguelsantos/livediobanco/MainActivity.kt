package com.miguelsantos.livediobanco

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.OrientationHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.miguelsantos.livediobanco.model.MenuItem

class MainActivity : AppCompatActivity() {

    private lateinit var recycler_list: RecyclerView
    private val adapter by lazy { MenuItemAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        populateRecycler()
    }

    private fun initViews() {
        recycler_list = findViewById(R.id.main_recycler)
        recycler_list.adapter = adapter
        recycler_list.layoutManager = StaggeredGridLayoutManager(2, OrientationHelper.VERTICAL)
    }

    // Mocks
    private fun populateRecycler() {
        adapter.setItemsList(
            arrayListOf(
                MenuItem("cartões"),
                MenuItem("empréstimos"),
                MenuItem("pic"),
                MenuItem("seguros"),
                MenuItem("soluções"),
                MenuItem("investimentos"),
                MenuItem("renegociação"),
                MenuItem("meus comprovantes"),
                MenuItem("consórcio"),
                MenuItem("poupança"),
                MenuItem("financiamento de imóvel"),
                MenuItem("iupp(programa de pontos)"),
                MenuItem("iPhone pra Sempre"),
                MenuItem("câmbio"),
                MenuItem("viagem"),
                MenuItem("meu pacote"),
                MenuItem("plano de viagens"),
                MenuItem("Portabilidade de salário.")
            )
        )
    }

}