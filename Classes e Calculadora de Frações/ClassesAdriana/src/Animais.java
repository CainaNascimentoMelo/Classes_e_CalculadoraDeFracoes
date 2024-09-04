public class Animais {

    private String especie;
    private String dietaAlimentar;
    private String nome;


    public Animais(String especie, String dietaAlimentar, String nome) {
        this.especie = especie;
        this.dietaAlimentar = dietaAlimentar;
        this.nome = nome;
    }

    public void setEspecie(String e) {
        this.especie = e;
    }

    public String getEspecie() {
        return especie;
    }

    public void setDietaAlimentar(String d) {
        this.dietaAlimentar = d;
    }

    public String getDietaAlimentar() {
        return dietaAlimentar;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void exibirEspecie() {
        System.out.println("Corvos pertencem a espécie " + especie);
    }

    public void exibirDietaAlimentar() {
        System.out.println("Os corvos possuem uma dieta alimentar " + dietaAlimentar);
    }

    public void exibirNome() {
        System.out.println("O nome do animal é " + nome);
    }
}
