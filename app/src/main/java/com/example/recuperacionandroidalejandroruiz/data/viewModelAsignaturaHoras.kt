package com.example.recuperacionandroidalejandroruiz.data

data class viewModelAsignaturaHoras  (
    val asignaturas: List<Asignatura> = DataSource.asignaturas,
    val ultimaAccion: String,
    val resumen: String
)