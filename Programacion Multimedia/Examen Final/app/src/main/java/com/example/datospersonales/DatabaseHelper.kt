package com.example.datospersonales

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {


    companion object {
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "biblioteca.db"
        const val TABLE_NAME = "libros"
        const val COLUMN_ID = "id"
        const val COLUMN_TITULO = "titulo"
        const val COLUMN_AUTOR = "autor"
        const val COLUMN_GENERO = "genero"
        const val COLUMN_EDITORIAL = "editorial"
        const val COLUMN_ANIO = "anio"
    }

    override fun onCreate(db: SQLiteDatabase) {
        val CREATE_TABLE = "CREATE TABLE $TABLE_NAME ($COLUMN_ID INTEGER, " +
                "$COLUMN_TITULO TEXT, $COLUMN_AUTOR TEXT, $COLUMN_GENERO TEXT," +
                "$COLUMN_EDITORIAL TEXT, $COLUMN_ANIO INTEGER)"
        db.execSQL(CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

}