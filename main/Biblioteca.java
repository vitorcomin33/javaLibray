import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros = new ArrayList<>();

    public void guardarLivro(Livro livro) {

        // 1. Adicione o parâmetro livro à lista.

        livros.add(livro);


        // 2. Mostre uma mensagem confirmando que foi guardado.

        System.out.println("Livro guardado com sucesso");

    }

}