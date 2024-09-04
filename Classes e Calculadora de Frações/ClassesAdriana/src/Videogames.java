public class Videogames {

    private String nome;
    private int preco;
    private int anoDeLancamento;

    public Videogames(String nome, int preco, int anoDeLancamento) {
        this.nome = nome;
        this.preco = preco;
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(int p) {
        this.preco = p;
    }

    public int getPreco() {
        return preco;
    }

    public void setAnoDeLancamento(int a) {
        this.anoDeLancamento = a;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void exibirNome() {
        System.out.println("O nome do videogame é " + nome);
    }

    public void exibirPreco() {
        System.out.println("O preço do videogame é de R$" + preco );
    }

    public void exibirAnoDeLancamento() {
        System.out.println("o videogame foi lançando em " + anoDeLancamento);
    }
}
