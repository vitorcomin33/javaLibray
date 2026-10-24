public class Livro {

     String nome;
     String autor;
     int data;
     int numPaginas;


     public Livro(String nome, String autor, int data, int numPaginas){
         this.nome = nome;
         this.autor = autor;
         this.data = data;
         this.numPaginas = numPaginas;

         }


         public String getNome() {
            return nome;
         }

         public String getAutor() {
            return autor;
         }

         public int getData() {
            return data;
         }

         public int getNumPaginas() {
            return numPaginas;
         }


        public void exibirInformacoes() {
            System.out.println("Nome: " + nome);
            System.out.println("Autor: " + autor);
            System.out.println("Data: " + data);
            System.out.println("Páginas: " + numPaginas);
         }
     }

