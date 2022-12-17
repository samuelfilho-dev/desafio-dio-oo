package br.com.dio.desafio.dominio;

/**
 *  <h2><a>Classe Abstrata Conteudo<a/>
 *  <p> Classe Mãe de Curso e Mentoria
 *  <p>Classe que contem: XP_PADRAO, titulo e descricao
 *  <p>Método: calcularXp, getTitulo, setTitulo, getDescricao, setDescricao<p/>
 * */

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    /**
     *  <h3><a>calcularXp<a/><h3/>
     *  <p>Método De cálculo Do XP que será adiconado em classes de herança<p/>
     * */

    public abstract Double calcularXp();

}
