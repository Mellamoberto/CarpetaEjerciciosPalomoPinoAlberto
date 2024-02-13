package com.example.ejercicios2tema7.ejercicio3

import android.content.ContentValues
import android.content.Context

class DataManager(context: Context) {
    /*creamos una instancia de DatabaseHelper y le añadimos el contexto, es decir acceso a recursos, base de datos, etc */
    private val dbHelper = DatabaseHelper(context)

    fun addData(nombre: String, apellidos: String, dni: String, edad: Int, curso: String) {
        val db = dbHelper.writableDatabase   //usamos el método par //escribir en la bbdd

        val values = ContentValues().apply {
            put(DatabaseHelper.COLUMN_NAME, nombre)
            put(DatabaseHelper.COLUMN_APELLIDOS, apellidos)
            put(DatabaseHelper.COLUMN_DNI, dni)
            put(DatabaseHelper.COLUMN_EDAD, edad)
            put(DatabaseHelper.COLUMN_CURSO, curso)
        }
        db.insert(DatabaseHelper.TABLE_NAME, null, values)
        db.close()
    }

    //rawQuery crea una consulta y la devuelve en un cursor
    fun getAllData(context: Context): String {
        val db = dbHelper.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM ${DatabaseHelper.TABLE_NAME}", null)
        val data = StringBuilder()

        while (cursor.moveToNext()) {
            val nameIndex = cursor.getColumnIndex(DatabaseHelper.COLUMN_NAME)
            val apellidosIndex = cursor.getColumnIndex(DatabaseHelper.COLUMN_APELLIDOS)
            val dniIndex = cursor.getColumnIndex(DatabaseHelper.COLUMN_DNI)
            val edadIndex = cursor.getColumnIndex(DatabaseHelper.COLUMN_EDAD)
            val cursoIndex = cursor.getColumnIndex(DatabaseHelper.COLUMN_CURSO)

            // Verifica si las columnas existen en el cursor
            if (nameIndex != -1 && apellidosIndex != -1 && dniIndex != -1 && edadIndex != -1 && cursoIndex != -1) {
                val name = cursor.getString(nameIndex)
                val apellidos = cursor.getString(apellidosIndex)
                val dni = cursor.getString(dniIndex)
                val edad = cursor.getInt(edadIndex)
                val curso = cursor.getString(cursoIndex)

                data.append("$name, ")
                data.append("$apellidos, ")
                data.append("$dni, ")
                data.append("$edad, ")
                data.append("$curso, ")
                data.append("\n")
            }
        }

        cursor.close()
        db.close()

        if (data.isEmpty()) {
            return "No hay datos en la base de datos"
        }

        return data.toString()
    }
}
