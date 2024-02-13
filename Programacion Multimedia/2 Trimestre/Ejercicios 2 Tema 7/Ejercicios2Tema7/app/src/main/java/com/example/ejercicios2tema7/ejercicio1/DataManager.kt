package com.example.ejercicios2tema7.ejercicio1

import android.content.ContentValues
import android.content.Context
import com.example.ejercicios2tema7.ejercicio2.DatabaseHelper
import com.example.ejercicios2tema7.ejercicio2.DatabaseHelper.Companion.COLUMN_NAME

class DataManager(context: Context) {
    /*creamos una instancia de DatabaseHelper y le añadimos el contexto, es decir acceso a recursos, base de datos, etc */
    private val dbHelper = DatabaseHelper(context)

    fun addData(nombre: String) {
        val db = dbHelper.writableDatabase   //usamos el método par //escribir en la bbdd

        val values = ContentValues().apply {
            put(DatabaseHelper.COLUMN_NAME, nombre)
        }
        db.insert(DatabaseHelper.TABLE_NAME, null, values)
        db.close()
    }

    //rawQuery crea una consulta y la devuelve en un cursor
    fun getAllData(context: Context): String {
        val db = dbHelper.readableDatabase
        val cursor =
            db.rawQuery("SELECT $COLUMN_NAME AS name FROM ${DatabaseHelper.TABLE_NAME}", null)
        val names = StringBuilder()

        // Verificar si el cursor no es nulo y si puede moverse al primer elemento
        if (cursor != null && cursor.moveToFirst()) {
            // Obtener el índice de la columna usando el alias
            val nameIndex = cursor.getColumnIndex("name")

            // Verificar si la columna existe en el cursor
            if (nameIndex != -1) {
                do {
                    // Obtener el nombre desde el cursor usando el índice
                    val name = cursor.getString(nameIndex)

                    // Agregar el nombre al StringBuilder
                    names.append("$name\n")
                } while (cursor.moveToNext())
            }
        }

        // Cerrar el cursor y la base de datos
        cursor?.close()
        db.close()

        // Verificar si hay nombres en el StringBuilder
        if (names.isEmpty()) {
            return "No hay nombres en la base de datos"
        }

        return names.toString()
    }
}