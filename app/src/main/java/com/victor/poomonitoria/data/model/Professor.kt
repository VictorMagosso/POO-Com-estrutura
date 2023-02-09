package com.victor.poomonitoria.data.model

data class Professor(
    val nomeProfessor: String,
    val salario: Double,
    val dataDeAdmissao: String
) : Pessoa(nomeProfessor)