public class Divisao {

    private int numerador;
    private int denominador;

    public void setDenominador(int d) {
        this.denominador = d;
    }

    public void setNumerador(int n) {
        this.numerador = n;
    }

    public void divisao(int numerador1, int numerador2, int denominador1, int denominador2) {
        int denominadorFinal = numerador1 * denominador2;
        int numeradorFinal = denominador1 * numerador2;

        for (int i = 2; i <= Math.min(Math.abs(numeradorFinal), denominadorFinal); i++) {
            while (numeradorFinal % i == 0 && denominadorFinal % i == 0) {
                numeradorFinal /= i;
                denominadorFinal /= i;

            }
        }

        System.out.println("A divisão da fração calculada é: " + numeradorFinal + "/" + denominadorFinal);

    }
}

