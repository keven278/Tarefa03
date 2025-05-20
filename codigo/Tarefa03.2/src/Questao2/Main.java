package Questao2;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso("Java Básico", 68, "Iniciante", "Curso introdutório de Java.");
        Instrutor instrutor = new Instrutor("Claudio", "Engenharia da Computação", "Claudio@exemplo.com", 5);
        instrutor.ministrarCurso(cursoJava);
        cursoJava.listarInstrutores();
        instrutor.listarCursosMinistrados();
    }
}