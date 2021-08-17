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
                MenuItem("empréstimos", R.drawable.ic_payments_white_24dp),
                MenuItem("pic", R.drawable.ic_military_tech_white_24dp),
                MenuItem("seguros", R.drawable.ic_lock_white_24dp),
                MenuItem("soluções", R.drawable.ic_build_white_24dp),
                MenuItem("investimentos", R.drawable.ic_moving_black_24dp),
                MenuItem("renegociação", R.drawable.ic_swap_horizontal_circle_white_24dp),
                MenuItem("meus comprovantes", R.drawable.ic_receipt_black_24dp),
                MenuItem("consórcio", R.drawable.ic_negotiations_white_24dp),
                MenuItem("poupança", R.drawable.ic_savings_black_24dp),
                MenuItem("financiamento de imóvel", R.drawable.ic_house_white_24dp),
                MenuItem("iupp(programa de pontos)"),
                MenuItem("iPhone pra Sempre", R.drawable.ic_shopping_bag_white_24dp),
                MenuItem("câmbio", R.drawable.ic_autorenew_white_24dp),
                MenuItem("viagem", R.drawable.ic_flight_takeoff_white_24dp),
                MenuItem("meu pacote", R.drawable.ic_inventory_2_white_24dp),
                MenuItem("plano de viagens", R.drawable.ic_star_outline_white_24dp),
                MenuItem("Portabilidade de salário.", R.drawable.ic_request_quote_white_24dp)
            )
        )
    }

}