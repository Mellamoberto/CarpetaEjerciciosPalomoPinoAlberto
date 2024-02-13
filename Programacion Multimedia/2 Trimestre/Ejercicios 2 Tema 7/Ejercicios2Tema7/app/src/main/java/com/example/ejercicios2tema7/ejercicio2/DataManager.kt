package com.example.ejercicios2tema7.ejercicio2

import android.content.ContentValues
import android.content.Context

class DataManager(context: Context) {
    /*creamos una instancia de DatabaseHelper y le añadimos el contexto, es decir acceso a recursos, base de datos, etc */
    private val dbHelper = DatabaseHelper(context)

    fun addData(nombre: String, contasenia: String) {
        val db = dbHelper.writableDatabase   //usamos el método par //escribir en la bbdd

        val values = ContentValues().apply {
            put(DatabaseHelper.COLUMN_NAME, nombre)
            put(DatabaseHelper.COLUMN_CONTRASENIA, contasenia)
        }
        db.insert(DatabaseHelper.TABLE_NAME, null, values)
        db.close()
    }
    fun getAllData(context: Context): String {
        val db = dbHelper.readableDatabase
        val cursor = db.query(com.example.ejercicios2tema7.ejercicio2.DatabaseHelper.TABLE_NAME, null, null, null, null, null, null)

        val data = StringBuilder()  // Cambiado de names a data

        // Verificar si el cursor no es nulo y si puede moverse al primer elemento
        if (cursor != null && cursor.moveToFirst()) {
            // Obtener los índices de las columnas
            val nameIndex = cursor.getColumnIndex(com.example.ejercicios2tema7.ejercicio2.DatabaseHelper.COLUMN_NAME)
            val contraseniaIndex = cursor.getColumnIndex(com.example.ejercicios2tema7.ejercicio2.DatabaseHelper.COLUMN_CONTRASENIA)

            // Verificar si las columnas existen en el cursor
            if (nameIndex != -1 && contraseniaIndex != -1) {
                do {
                    // Obtener los datos de las columnas
                    val name = cursor.getString(nameIndex)
                    val contrasenia = cursor.getString(contraseniaIndex)

                    // Agregar los datos al StringBuilder
                    data.append("$name, $contrasenia\n")  // Cambiado de names a data
                } while (cursor.moveToNext())
            }

            cursor.close()
            db.close()

            if (data.isEmpty()) {
                return "No hay datos en la base de datos"
            }

            return data.toString()
        }

        // Devolver un mensaje predeterminado si no hay datos
        return "No hay datos en la base de datos"
    }
}

