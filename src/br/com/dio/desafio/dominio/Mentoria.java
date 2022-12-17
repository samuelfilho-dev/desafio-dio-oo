package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/**
 *  <h2><a>Classe Mentoria<a/>
 *  <p> Classe que criam Instancias das Mentorias
 *  <p>Classe que contem: data
 *  <p>Método: getData, setData, toString e calcularXp <p/>
 * */

public class Mentoria extends Conteudo{
    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public Double calcularXp() {
        return XP_PADRAO + 20d;
    }


}
