package br.com.dio.desafio.dominio;

/**
 *
 *  <h2><a>Classe Curso<a/>
 *  <p>Classe que contem cargaHoraria
 *  <p>Método: calcularXp,Getter, Setter e to String<p/>
 * */

public class Curso extends Conteudo {

    private Integer cargaHoraria;

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


    @Override
    public Double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
