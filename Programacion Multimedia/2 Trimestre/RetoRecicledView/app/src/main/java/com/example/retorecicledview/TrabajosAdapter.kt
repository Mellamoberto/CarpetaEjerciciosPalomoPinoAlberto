package com.example.retorecicledview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TrabajosAdapter(private val trabajos: List<Trabajos>, private val onTrabajosClickListener: (Trabajos) -> Unit) :
    RecyclerView.Adapter<TrabajosAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_trabajos, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val trabajos = trabajos[position]

        // Aquí es donde debes obtener el TextView dentro de la vista item_trabajos.xml
        val trabajosTextView: TextView = holder.itemView.findViewById(R.id.trabajosNameTextView)

        // Ahora, establece el texto en el TextView
        trabajosTextView.text = trabajos.name

        // Asigna el clic al itemView (puede seguir usándolo si es necesario)
        holder.itemView.setOnClickListener { onTrabajosClickListener(trabajos) }
    }

    override fun getItemCount(): Int = trabajos.size
}