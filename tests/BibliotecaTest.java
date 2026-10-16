public class BibliotecaTest {

    public static void main(String[] args) {

        // 1. Criamos uma biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // 2. Criamos dois livros usando a classe Livro
        Livro livro1 = new Livro(
                "Diário de um Banana",
                "Jeff Kinney",
                2007,
                224
        );

        Livro livro2 = new Livro(
                "O admirável mundo novo",
                "Aldous Huxley",
                1932,
                312
        );

        // 3. Entregamos os livros para a biblioteca guardar
        biblioteca.guardarLivro(livro1);
        biblioteca.guardarLivro(livro2);
    }
}