package com.example.parcaburada

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.arac_kategori.view.*

class AracMarkaAdapter(tumKategori: ArrayList<AracMarka>) :
    RecyclerView.Adapter<AracMarkaAdapter.AracMarkaViewHolder>() {

    var araclar = tumKategori

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AracMarkaViewHolder {

        var inflater = LayoutInflater.from(parent.context)
        var arackategori = inflater.inflate(R.layout.arac_kategori, parent, false)

        return AracMarkaViewHolder(arackategori)

    }

    override fun getItemCount(): Int {
        return araclar.size
    }

    override fun onBindViewHolder(holder: AracMarkaViewHolder, position: Int) {

        holder.aracismi.text=araclar.get(position).aracAdi
        holder.aracLogo.setImageResource(araclar.get(position).aracLogo)

    }


    class AracMarkaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var teksatirKategori= itemView
        var aracismi= teksatirKategori.tvaracAdi
        var aracLogo=teksatirKategori.img_arac_sembol

    }
}