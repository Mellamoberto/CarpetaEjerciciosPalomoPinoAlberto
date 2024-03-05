package com.example.datospersonales

import android.content.ContentValues
import android.content.Context

class DataManager(context: Context) {
    private val dbHelper = DatabaseHelper(context)


    fun addData(
        id: Int, titulo: String, autor: String, genero: String,
        editorial: String, anio: Int
    ) {
        val db = dbHelper.writableDatabase

        val values = ContentValues().apply {
            put(DatabaseHelper.COLUMN_ID, id)
            put(DatabaseHelper.COLUMN_TITULO, titulo)
            put(DatabaseHelper.COLUMN_AUTOR, autor)
            put(DatabaseHelper.COLUMN_GENERO, genero)
            put(DatabaseHelper.COLUMN_EDITORIAL, editorial)
            put(DatabaseHelper.COLUMN_ANIO, anio)
        }
        db.insert(DatabaseHelper.TABLE_NAME, null, values)
        db.close()
    }


    fun getAllData(context: Context): String {
        val db = dbHelper.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM ${DatabaseHelper.TABLE_NAME}", null)
        val data = StringBuilder()

        while (cursor.moveToNext()) {
            val idIndex = cursor.getColumnIndex(DatabaseHelper.COLUMN_ID)
            val tituloIndex = cursor.getColumnIndex(DatabaseHelper.COLUMN_TITULO)
            val autorIndex = cursor.getColumnIndex(DatabaseHelper.COLUMN_AUTOR)
            val generoIndex = cursor.getColumnIndex(DatabaseHelper.COLUMN_GENERO)
            val editorialIndex = cursor.getColumnIndex(DatabaseHelper.COLUMN_EDITORIAL)
            val anioIndex = cursor.getColumnIndex(DatabaseHelper.COLUMN_ANIO)

            if (idIndex != -1 && tituloIndex != -1 && autorIndex != -1 && generoIndex != -1
                && editorialIndex != -1 && anioIndex != -1
            ) {
                val id = cursor.getInt(idIndex)
                val titulo = cursor.getString(tituloIndex)
                val autor = cursor.getString(autorIndex)
                val genero = cursor.getString(generoIndex)
                val editorial = cursor.getString(editorialIndex)
                val anio = cursor.getInt(anioIndex)

                data.append("$id, ")
                data.append("$titulo, ")
                data.append("$autor, ")
                data.append("$genero, ")
                data.append("$editorial, ")
                data.append("$anio, ")
                data.append("\n")
            }
        }

        cursor?.close()
        db.close()

        if (data.isEmpty()) {
            return "No hay datos en la base de datos"
        }

        return data.toString()
    }

    fun deleteAllData(context: Context) {
        val db = dbHelper.writableDatabase
        db.delete(DatabaseHelper.TABLE_NAME, null, null)
        db.close()
    }

}