package com.victor.poomonitoria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.victor.poomonitoria.data.model.Escola
import com.victor.poomonitoria.ui.theme.POOMonitoriaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            POOMonitoriaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val escolaOficial = Escola.criarEscola()

                    LazyColumn {
                        items(escolaOficial.turmas) { turma ->
                            Box(
                                modifier = Modifier
                                    .padding(16.dp)
                            ) {
                                Text(
                                    modifier = Modifier.background(color = Color.DarkGray),
                                    text = "Turma: ${turma.numeroDaTurma} - total de alunos: ${turma.alunos.size}"
                                )
                            }
                            LazyRow {
                                items(turma.alunos) { aluno ->
                                    Column(modifier = Modifier.padding(10.dp)) {
                                        Text(
                                            modifier = Modifier
                                                .background(color = Color.DarkGray)
                                                .width(200.dp)
                                                .height(200.dp)
                                                .padding(10.dp),
                                            text = aluno.nomeDoAluno
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
