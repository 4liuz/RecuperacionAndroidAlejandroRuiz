package com.example.recuperacionandroidalejandroruiz

import com.example.recuperacionandroidalejandroruiz.data.Asignatura
import com.example.recuperacionandroidalejandroruiz.data.DataSource

class AsignaturasFuncionalidad {
    val asignaturas: List<Asignatura> = DataSource.asignaturas
    var ultimaAccion: String = ""
    var resumen: String = ""

    fun SumarHoras(nombre: String) {

    }
}