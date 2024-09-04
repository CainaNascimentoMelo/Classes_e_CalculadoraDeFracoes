public class Main {
    public static void main(String[] args) {
        int opcao = 1;
        Adicao ad = new Adicao();
        ad.adicao(2,8,16,3);
        Subtracao sub = new Subtracao();
        sub.subtracao(4,7,2,6);
        Multiplicacao mul = new Multiplicacao();
        mul.multiplicacao(4,7,2,6);
        Divisao div = new Divisao();
        div.divisao(4,7,2,6);
    }
}