public class Livros {

    private String titulo;
    private String genero;
    private String autor;

    public Livros(String titulo, String genero, String autor) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setGenero(String g) {
        this.genero = g;
    }

    public String getGenero() {
        return genero;
    }

    public void setAutor(String a) {
        this.autor = a;
    }

    public String getAutor() {
        return autor;
    }

    public void exibirTitulo() {
        System.out.println("O título do livro é " + titulo);
    }

    public void exibirGenero() {
        System.out.println("20.000 Léguas Submarinas é um " + genero);
    }

    public void exibirAutor() {
        System.out.println("O autor do livro é " + autor);
    }
}
