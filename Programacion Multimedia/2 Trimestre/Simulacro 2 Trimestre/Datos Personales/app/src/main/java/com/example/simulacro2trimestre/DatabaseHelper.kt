package com.example.simulacro2trimestre

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {


    companion object {
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "empresa.db"
        const val TABLE_NAME = "datos_personales"
        const val COLUMN_NOMBRE = "nombre"
        const val COLUMN_APELLIDOS = "apellidos"
        const val COLUMN_DIRECCION = "direccion"
        const val COLUMN_CP = "cp"
        const val COLUMN_CIUDAD = "ciudad"
        const val COLUMN_PROVINCIA = "provincia"
        const val COLUMN_TELEFONO = "telefono"
    }

    override fun onCreate(db: SQLiteDatabase) {
        val CREATE_TABLE = "CREATE TABLE $TABLE_NAME ($COLUMN_NOMBRE TEXT, " +
                "$COLUMN_APELLIDOS TEXT, $COLUMN_DIRECCION TEXT, $COLUMN_CP INTEGER," +
                "$COLUMN_CIUDAD TEXT, $COLUMN_PROVINCIA TEXT, $COLUMN_TELEFONO TEXT )"
        db.execSQL(CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

}
