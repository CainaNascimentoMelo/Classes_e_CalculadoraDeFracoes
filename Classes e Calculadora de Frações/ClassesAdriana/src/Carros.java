public class Carros {

    private String placa;
    private String cor;
    private String modelo;

    public Carros(String placa, String cor, String modelo) {
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
    }

    public void setPlaca(String p) {
        this.placa = p;
    }

    public String getPlaca() {
        return placa;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public String getCor() {
        return cor;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getModelo() {
        return modelo;
    }

    public void exibirPlaca() {
        System.out.println("A placa do carro é " + placa);
    }

    public void exibirCor() {
        System.out.println("A cor do carro se trata de um " + cor);
    }

    public void exibirModelo() {
        System.out.println("O modelo do carro se trata de um " + modelo);
    }
}
