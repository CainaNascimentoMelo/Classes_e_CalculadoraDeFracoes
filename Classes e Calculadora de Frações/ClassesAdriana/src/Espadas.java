public class Espadas {

    private int anoDeCriacao;
    private String paisDeOrigem;
    private String nome;

    public Espadas(int anoDeCriacao, String paisDeOrigem, String nome) {
        this.anoDeCriacao = anoDeCriacao;
        this.paisDeOrigem = paisDeOrigem;
        this.nome = nome;
    }

    public void setAnoDeCriacao(int a) {
        this.anoDeCriacao = a;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setPaisDeOrigem(String p) {
        this.paisDeOrigem = p;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void exibirAnoDeCriacao() {
        System.out.println("A Tentetsutou foi forjada no ano de " + anoDeCriacao);
    }

    public void exibirPaisDeOrigem() {
        System.out.println("A Tentetsutou surgiu no " + paisDeOrigem);
    }

    public void exibirNome() {
        System.out.println("O nome da espada é " + nome);
 }
}