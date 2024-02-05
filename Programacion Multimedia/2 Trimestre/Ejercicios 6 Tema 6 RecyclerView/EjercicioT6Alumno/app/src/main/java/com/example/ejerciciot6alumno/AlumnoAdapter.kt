package com.example.ejerciciot6alumno

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class alumnoAdapter(private val alumnoList: List<Alumno>) :
    RecyclerView.Adapter<alumnoAdapter.alumnoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): alumnoViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_alumno, parent, false)
        return alumnoViewHolder(view)
    }

    override fun onBindViewHolder(holder: alumnoViewHolder, position: Int) {
        val alumno = alumnoList[position]
        holder.nameTextView.text = alumno.name
        holder.apellidosTextView.text = alumno.apellidos
        holder.direccionTextView.text = alumno.asignatura
        holder.ciudadTextView.text = alumno.nota.toString()
    }

    override fun getItemCount(): Int = alumnoList.size

    class alumnoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = view.findViewById(R.id.nameTextView)
        val apellidosTextView: TextView = view.findViewById(R.id.apellidosTextView)
        val direccionTextView: TextView = view.findViewById(R.id.asignaturaTextView)
        val ciudadTextView: TextView = view.findViewById(R.id.notaTextView)
    }
}