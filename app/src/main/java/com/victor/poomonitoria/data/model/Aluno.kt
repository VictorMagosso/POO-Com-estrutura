package com.victor.poomonitoria.data.model

data class Aluno(val nomeDoAluno: String, val notas: List<Nota>) : Pessoa(nomeDoAluno)
