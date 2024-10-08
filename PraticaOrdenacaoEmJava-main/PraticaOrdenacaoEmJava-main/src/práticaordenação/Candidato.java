/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package práticaordenação;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Candidato implements Comparable<Candidato> {
    private int identificador;
    private String nome;
    private LocalDate dataNascimento;
    private int nota;

    public Candidato(int identificador, String nome, String dataNascimento, int nota) {
        this.identificador = identificador;
        this.nome = nome;
        this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public int compareTo(Candidato outro) {
        
        if (this.nota != outro.nota) {
            return Integer.compare(outro.nota, this.nota);
        }
        
        return this.dataNascimento.compareTo(outro.dataNascimento);
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Nome: %s, Data Nasc: %s, Nota: %d", 
                identificador, nome, dataNascimento, nota);
    }
}