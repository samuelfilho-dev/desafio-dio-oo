import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

/**
 *  <h2><a>Classe Main<a/>
 *  <p>Classe Que execultará a aplicação<p/>
 * */


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

        // Instanciamento por Polimofismo

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();


        System.out.println("\n" + "\n" + "\n");

        // =====================================//
        // Inscrição de Dev para o Bootcamp

        // Criação Do BootCamp
        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("BootCamp de Java Para Developers");
        bootCamp.getConteudos().add(curso);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        // Criação do BootCamp do Dev Samuel
        Dev devSamuel = new Dev();
        devSamuel.setNome("Samuel");
        devSamuel.inscreverBootCamp(bootCamp); // Inscrição Do BootCamp
        System.out.println("Conteudos Inscritos de Samuel: " + devSamuel.getConteudosInscritos());
        devSamuel.progredir(); // Progressão Do BootCamp
        devSamuel.progredir();
        System.out.println("========");
        System.out.println("Conteudos Inscritos de Samuel: " + devSamuel.getConteudosInscritos()); // Impressão Dos Conteudos Inscritos
        System.out.println("Conteudos Concluidos de Samuel: " + devSamuel.getConteudosConcluidos()); // Impressão Dos Conteudo Concluidos
        System.out.println("XP: " + devSamuel.calcularTotalXp()); // Impressão Do XP


        System.out.println("-------------");

        // Criação e Insrição do BootCamp do Dev Higor
        Dev devHigor = new Dev();
        devHigor.setNome("Higor");
        devHigor.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos de Higor" + devHigor.getConteudosInscritos());
        devHigor.progredir();
        devHigor.progredir();
        devHigor.progredir();
        System.out.println("========");
        System.out.println("Conteudos Inscritos de Higor" + devHigor.getConteudosInscritos()); // Impressão Dos Conteudos Inscritos
        System.out.println("Conteudos Concluidos de Higor" + devHigor.getConteudosConcluidos());// Impressão Dos Conteudo Concluidos
        System.out.println("XP: " + devHigor.calcularTotalXp()); // Impressão Do XP
    }
}