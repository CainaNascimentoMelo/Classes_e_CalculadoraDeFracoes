public class Cadernos {

    private String corDaCapa;
    private int quantidadeDePaginas;
    private String tamanhoDasFolhas;

    public Cadernos(String corDaCapa, int quantidadeDePaginas, String tamanhoDasFolhas) {
        this.corDaCapa = corDaCapa;
        this.quantidadeDePaginas = quantidadeDePaginas;
        this.tamanhoDasFolhas = tamanhoDasFolhas;
    }

    public void setCorDaCapa(String c) {
        this.corDaCapa = c;
    }

    public String getCorDaCapa() {
        return corDaCapa;
    }

    public void setQuantidadeDePaginas(int q) {
        this.quantidadeDePaginas = q;
    }

    public int getQuantidadeDePaginas() {
        return quantidadeDePaginas;
    }

    public void setTamanhoDasFolhas(String f) {
        this.tamanhoDasFolhas = f;
    }

    public String getTamanhoDasFolhas() {
        return tamanhoDasFolhas;
    }

    public void exibirCorDaCapa() {
        System.out.println("A cor da capa do caderno é " + corDaCapa);
    }

    public void exibirQuantidadeDePaginas() {
        System.out.println("O caderno possui " + quantidadeDePaginas + " páginas");
    }

    public void exibirTamanhoDasFolhas() {
        System.out.println("As folhas do caderno são do tamanho " + tamanhoDasFolhas);
    }
}