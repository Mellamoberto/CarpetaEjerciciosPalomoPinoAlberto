package com.example.ejercicios6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class PersonAdapter(private val personList: List<Person>) :
    RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_person, parent, false)
        return PersonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val person = personList[position]
        holder.nameTextView.text = person.name
        holder.apellidosTextView.text = person.apellidos
        holder.direccionTextView.text = person.direccion
        holder.ciudadTextView.text = person.ciudad
    }

    override fun getItemCount(): Int = personList.size

    class PersonViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = view.findViewById(R.id.nameTextView)
        val apellidosTextView: TextView = view.findViewById(R.id.apellidosTextView)
        val direccionTextView: TextView = view.findViewById(R.id.direccionTextView)
        val ciudadTextView: TextView = view.findViewById(R.id.ciudadTextView)
    }
}