import java.util.ArrayList;

// Classe para gerenciar uma coleção de livros
public class Biblioteca {
    // Lista de livros na biblioteca
    private ArrayList<Livro> livros;

    // Construtor da classe Biblioteca
    public Biblioteca() {
        this.livros = new ArrayList<>(); // Inicializando a lista de livros
    }

    // Método para adcionar um livro a biblioteca
    public void adcionaLivro(Livro livro) {
        this.livros.add(livro); // Adiciona o livro a lista
    }

    // Método para remover o livro da biblioteca pelo titulo
    public void removeLivro(String titulo) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().equals(titulo)) {
                livros.remove(i); // Remove o livro da lista
                return;
            }
        }
        System.out.println("Livro não encntrado."); // Se o livro não for encontrado, aparece essa mensagem
    }

    // Método para atualizar o autor de um livro pelo titulo
    public void atualizaLivro(String titulo, String novoAutor) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livro.setAutor(novoAutor); // Atualiza o autor do livro
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    // Método para listar todos os livros da bibliote
    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro); // Imprime a representação (criada em Livro) em string de cada livro
        }
    }

    public void listarLivroAutor(String autor) {
        boolean encontrar = false;
        for (Livro livro : livros) {
            if (livro.getAutor().equals(autor)) {
                System.out.println(livro.getTitulo());
                encontrar = true;
            }
        }
        if (!encontrar) {
            System.out.println("Nenhum livro do/a " + autor + " encontrado");
        }
    }

    // Método para listar pelo o autor

}
