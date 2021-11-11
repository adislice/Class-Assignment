package com.tugas.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var covid_list = ArrayList<Covid>()
        covid_list.add(Covid("Data Covid-19", "Data dan Statistik Terkini Covid-19", R.drawable.ic_twotone_coronavirus_24))
        covid_list.add(Covid("Kuota Vaksin", "Informasi Kuota Vaksin", R.drawable.ic_vaccines_black_24dp))
        covid_list.add(Covid("Kebijakan Tes PCR", "Syarat dan Kebijakan Tes PCR", R.drawable.ic_twotone_testpcr_24))
        covid_list.add(Covid("Pembelajaran Tatap Muka", "Informasi Penyelenggaraan PTM", R.drawable.ic_twotone_school_24))
        covid_list.add(Covid("Bantuan Sosial", "Informasi Penyaluran Bantuan Selama Pandemi", R.drawable.ic_twotone_account_balance_wallet_24))

        val mRecycleView = findViewById<RecyclerView>(R.id.recycler_view)
        val viewAdapter: RecyclerView.Adapter<*> = CovidAdapter(covid_list)
        val viewManager = LinearLayoutManager(this)

        mRecycleView.apply {
            setHasFixedSize(true)
            adapter = viewAdapter
            layoutManager = viewManager
            addItemDecoration(DividerItemDecoration(this.context, DividerItemDecoration.VERTICAL))
        }

    }
}