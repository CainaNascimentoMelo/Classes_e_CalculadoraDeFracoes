public class Multiplicacao {

    private int numerador;
    private int denominador;

    public void setDenominador(int d) {
        this.denominador = d;
    }

    public void setNumerador(int n) {
        this.numerador = n;
    }

    public void multiplicacao(int numerador1, int numerador2, int denominador1, int denominador2) {
        int denominadorFinal = numerador1 * numerador2;
        int numeradorFinal = denominador1 * denominador2;

        for (int i = 2; i <= Math.min(Math.abs(numeradorFinal), denominadorFinal); i++) {
            while (numeradorFinal % i == 0 && denominadorFinal % i == 0) {
                numeradorFinal /= i;
                denominadorFinal /= i;

            }
        }

        System.out.println("A multiplicação da fração calculada é: " + numeradorFinal + "/" + denominadorFinal);

    }
}
