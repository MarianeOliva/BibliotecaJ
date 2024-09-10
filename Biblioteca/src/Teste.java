import java.util.Scanner;

public class Teste {
    // Testando a aplicação
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        int continuar;

        Biblioteca biblioteca = new Biblioteca(); // Cria uma nova biblioteca

        while (true) {
            System.out.printf("\nEscolha uma opção:" +
                    "\n\n1. Adicionar livro" +
                    "\n2. Remover livro" +
                    "\n3. Atualizar autor" +
                    "\n4. Atualizar título" +
                    "\n5. Listar livros" +
                    "\n6. Listar livros pelo autor" +
                    "\n0. Sair" +
                    "\n\n");
            int opcao = dados.nextInt();
            dados.nextLine();

            switch (opcao) {
                case 1:
                    String titulo, autor;
                    do {
                        System.out.println("\nTitulo do livro: ");
                        titulo = dados.nextLine();

                        System.out.println("Autor do livro: ");
                        autor = dados.nextLine();

                        Livro livro = new Livro(titulo, autor);
                        biblioteca.adcionaLivro(livro);

                        System.out.println("\nDeseja adiconar mais? 1. Sim ou 0. Sair ");
                        continuar = dados.nextInt();
                        dados.nextLine();

                    } while (continuar != 0);
                    break;

                case 2:
                    do {
                        System.out.println("\nTitulo do livro a Remover: ");
                        titulo = dados.nextLine();
                        biblioteca.removeLivro(titulo);

                        System.out.println("\nDeseja remover mais um? 1. Sim ou 0. Sair ");
                        continuar = dados.nextInt();
                        dados.nextLine();
                    } while (continuar != 0);
                    break;

                case 3:
                    do {
                        System.out.println("\nTitulo do livro: ");
                        titulo = dados.nextLine();
                        System.out.println("Novo autor do livro: ");
                        autor = dados.nextLine();

                        biblioteca.atualizaLivro(titulo, autor);

                        System.out.println("\nDeseja atualizar mais? 1. Sim ou 0. Sair ");
                        continuar = dados.nextInt();
                        dados.nextLine();
                    } while (continuar != 0);
                    break;

                case 4:
                    biblioteca.listarLivros();
                    break;

                case 5:
                    System.out.println("\nNome do autor/a: ");
                    autor = dados.nextLine();
                    biblioteca.listarLivroAutor(autor);
                    break;

                case 0:
                    System.out.println("\nSaindo...");
                    dados.close();
                    return;

                default:
                    System.out.println("\nOpção Inválida");
            }
        }
    }
}
