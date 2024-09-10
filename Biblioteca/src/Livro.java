public class Livro {
    // Titulos e Autores do Livro
    private String titulo;
    private String autor;

    //Construtor da classe Livro
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Método para obter o título do livro
    public String getTitulo() {
        return titulo;
    }

    // Método para definir o titulo do livro
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Método para obter o Autor do Livro
    public String getAutor() {
        return autor;
    }

    // Método para definir o autor do livro
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Método para retornar uma apresentação em string do livro
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor;
    }
}
