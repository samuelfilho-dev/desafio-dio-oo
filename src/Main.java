import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Criação do Objeto Curso
        Curso curso = new Curso();
        curso.setTitulo("Curso Java Básico");
        curso.setDescricao("Curso Java Para Inciantes");
        curso.setCargaHoraria(8);

        // Impressão do Objeto Curso
        System.out.println(curso);

        // Criação do Objeto Curso Javascript
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript Básico");
        curso2.setDescricao("Curso Javascript para Inciantes");
        curso2.setCargaHoraria(4);

        // Impressão do Objeto Curso Javascript
        System.out.println(curso2);

        // Criação Do Objeto Mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria Java para Progamação Orientada a Objeto");
        mentoria.setData(LocalDate.now());

        // Impressão do Objeto Curso Mentoria
        System.out.println(mentoria);


    }
}