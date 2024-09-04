public class Instrumentos {

    private String tipoDeInstrumento;
    private int anoDeCriacao;
    private String nome;

    public Instrumentos(String tipoDeInstrumento, int anoDeCriacao, String nome) {
        this.tipoDeInstrumento = tipoDeInstrumento;
        this.anoDeCriacao = anoDeCriacao;
        this.nome = nome;
    }

    public void setTipoDeInstrumento(String t) {
        this.tipoDeInstrumento = t;
    }

    public String getTipoDeInstrumento() {
        return tipoDeInstrumento;
    }

    public void setAnoDeCriacao(int a) {
        this.anoDeCriacao = a;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void exibirTipoDeInstrumento() {
        System.out.println("O Baixo Elétrico se trata de um instrumento de " + tipoDeInstrumento);
    }

    public void exibirAnoDeCriacao() {
        System.out.println("O Baixo Elétrico foi criado em " + anoDeCriacao);
    }

    public void exibirNome() {
        System.out.println("O instrumento se chama " + nome);
    }
}
