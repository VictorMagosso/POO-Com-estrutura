package com.victor.poomonitoria.data.model

data class Escola(
    val turmas: List<Turma>,
    val professorList: List<Professor>,
    val alunos: List<Aluno>,
) {
    val listaMutavel: MutableList<Aluno>
        get() = alunos.toMutableList()

    companion object {
        fun criarEscola() = Escola(
            turmas = criarTurmas(),
            professorList = registrarProfessor(),
            alunos = matricularAlunos(),
        )

        private fun matricularAlunos(): List<Aluno> = listOf(
            Aluno("Eduardo", listOf()),
            Aluno("Joao Vitor", listOf()),
            Aluno("Raiara", listOf()),
            Aluno("Marcos", listOf()),
            Aluno("Victor", listOf()),
        )

        private fun criarTurmas(): List<Turma> = listOf(
            Turma(
                1, Professor(
                    "Guilherme",
                    1000.00,
                    "25/12/2012"
                ),
                listOf(
                    Aluno("Aluno 1", listOf())
                )
            ),
            Turma(
                2, Professor(
                    "Victor",
                    1000.00,
                    "25/12/2012"
                ),
                listOf(
                    Aluno("Aluno do Victor 1", listOf()),
                    Aluno("Aluno do Victor 2", listOf()),
                    Aluno("Aluno do Victor 2", listOf()),
                    Aluno("Aluno do Victor 2", listOf()),
                    Aluno("Aluno do Victor 2", listOf()),
                    Aluno("Aluno do Victor 2", listOf()),
                    Aluno("Aluno do Victor 2", listOf()),
                    Aluno("Aluno do Victor 2", listOf()),
                    Aluno("Aluno do Victor 2", listOf()),
                )
            )
        )

        private fun registrarProfessor(): List<Professor> = listOf(
            Professor("Victor", 1000.00, "xx/xx/xxxx"),
            Professor("Guilherme", 1000.00, "xx/xx/xxxx"),
        )
    }
}
