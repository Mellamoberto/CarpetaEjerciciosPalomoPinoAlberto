package com.example.simulacro2trimestre

import android.content.ContentValues
import android.content.Context

class DataManager(context: Context) {
    private val dbHelper = DatabaseHelper(context)


    fun addData(nombre: String, apellidos: String, direccion: String, cp: Int,
                ciudad: String, provincia: String, telefono: String) {
        val db = dbHelper.writableDatabase

        val values = ContentValues().apply {
            put(DatabaseHelper.COLUMN_NOMBRE, nombre)
            put(DatabaseHelper.COLUMN_APELLIDOS, apellidos)
            put(DatabaseHelper.COLUMN_DIRECCION, direccion)
            put(DatabaseHelper.COLUMN_CP, cp)
            put(DatabaseHelper.COLUMN_CIUDAD, ciudad)
            put(DatabaseHelper.COLUMN_PROVINCIA, provincia)
            put(DatabaseHelper.COLUMN_TELEFONO, telefono)
        }
        db.insert(DatabaseHelper.TABLE_NAME, null, values)
        db.close()
    }

    fun getAllData(context: Context): String {
        val db = dbHelper.readableDatabase
        val cursor = db.rawQuery("SELECT * FROM ${DatabaseHelper.TABLE_NAME}", null)
        val data = StringBuilder()

        while (cursor.moveToNext()) {
            val nombreIndex = cursor.getColumnIndex(DatabaseHelper.COLUMN_NOMBRE)
            val apellidosIndex = cursor.getColumnIndex(DatabaseHelper.COLUMN_APELLIDOS)
            val direccionIndex = cursor.getColumnIndex(DatabaseHelper.COLUMN_DIRECCION)
            val cpIndex = cursor.getColumnIndex(DatabaseHelper.COLUMN_CP)
            val ciudadIndex = cursor.getColumnIndex(DatabaseHelper.COLUMN_CIUDAD)
            val provinciaIndex = cursor.getColumnIndex(DatabaseHelper.COLUMN_PROVINCIA)
            val telefonoIndex = cursor.getColumnIndex(DatabaseHelper.COLUMN_TELEFONO)

            if (nombreIndex != -1 && apellidosIndex != -1 && direccionIndex != -1 && cpIndex != -1
                && ciudadIndex != -1 && provinciaIndex != -1 && telefonoIndex != -1) {
                val nombre = cursor.getString(nombreIndex)
                val apellidos = cursor.getString(apellidosIndex)
                val direccion = cursor.getString(direccionIndex)
                val cp = cursor.getInt(cpIndex)
                val ciudad = cursor.getString(ciudadIndex)
                val provincia = cursor.getString(provinciaIndex)
                val telefono = cursor.getString(telefonoIndex)

                data.append("$nombre, ")
                data.append("$apellidos, ")
                data.append("$direccion, ")
                data.append("$cp, ")
                data.append("$ciudad, ")
                data.append("$provincia, ")
                data.append("$telefono, ")
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