public class Subtracao {

    private int numerador;
    private int denominador;

    public void setDenominador(int d) {
        this.denominador = d;
    }

    public void setNumerador(int n) {
        this.numerador = n;
    }

    public void subtracao(int numerador1, int numerador2, int denominador1, int denominador2) {
        int denominadorComum = denominador1 * denominador2;
        int numeradorFinal = (numerador1 * denominador2) - (numerador2 * denominador1);

        for (int i = 2; i <= Math.min(Math.abs(numeradorFinal), denominadorComum); i++) {
            while (numeradorFinal % i == 0 && denominadorComum % i == 0) {
                numeradorFinal /= i;
                denominadorComum /= i;

            }
        }

        System.out.println("A subtração da fração calculada é: " + numeradorFinal + "/" + denominadorComum);

    }
}
