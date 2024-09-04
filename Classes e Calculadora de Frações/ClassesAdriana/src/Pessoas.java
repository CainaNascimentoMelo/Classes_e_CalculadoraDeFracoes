public class Pessoas {

    private String etnia;
    private int anoDeNascimento;
    private String nome;

    public Pessoas(String etnia, int anoDeNascimento, String nome) {
        this.etnia = etnia;
        this.anoDeNascimento = anoDeNascimento;
        this.nome = nome;
    }

    public void setEtnia(String e) {
        this.etnia = e;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setAnoDeNascimento(int a) {
        this.anoDeNascimento = a;
    }

    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void exibirEtnia() {
        System.out.println("Arthur Cervero se identifica como " + etnia);
    }

    public void exibirAnoDeNascimento() {
        System.out.println("Arthur Cervero nasceu em " + anoDeNascimento);
    }

    public void exibirNome() {
        System.out.println("O nome da pessoa é " + nome);
    }
}