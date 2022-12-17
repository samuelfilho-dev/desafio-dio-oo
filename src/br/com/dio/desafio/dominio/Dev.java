package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

/**
 *  <h2><a>Classe Dev<a/>
 *  <p> Nela conterá os Devs que serão inscritos no Bootcamp
 *  <p>Possui como atributos: nome, conteudosInscritos e conteudosConcluidos
 *  <p>Possui Métodos: inscreverBootCamp, progredir, calcularTotalXp, Getter, Setter, HashCode, equals e to String<p/>
 * */


public class Dev {

    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return nome.equals(dev.nome) && conteudosInscritos.equals(dev.conteudosInscritos) && conteudosConcluidos.equals(dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", conteudosInscritos=" + conteudosInscritos +
                ", conteudosConcluidos=" + conteudosConcluidos +
                '}';
    }

    /**
     *  <h3><a>inscreverBootCamp<a/><h3/>
     *  <p>Método Para a inscrição do Dev no BootCamp cadastrado<p/>
     * @param bootCamp
     * */


    public void inscreverBootCamp(BootCamp bootCamp){
        this.conteudosInscritos.addAll(bootCamp.getConteudos());
        bootCamp.getDevsInscritos().add(this);
    }

    /**
     *  <h3><a>progredir<a/><h3/>
     *  <p> Método de progressão do Dev pelo bootCamp,
     *   atraves dele é feito medição do progresso do usuario<p/>
     * */


    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }else{
            System.err.println("Você não está Maticulado em Nenhum Conteúdo!");
        }
    }

    /**
     *  <h3><a>calcularTotalXp<a/><h3/>
     *  <p> Método de Calculo de XP do Dev pelo bootCamp,
     *   atraves dele é feito medição da XP do usuario<p/>
     * */

    public Double calcularTotalXp(){
       return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }


}
