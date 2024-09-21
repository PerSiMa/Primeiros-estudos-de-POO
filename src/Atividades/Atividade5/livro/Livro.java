package Atividades.Atividade5.livro;

public class Livro {

    private String autor, titulo;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibirDetalhes() {
        System.out.println("O título do livro é " + titulo);
        System.out.println("O autor do livro é " + autor);
    }
}
