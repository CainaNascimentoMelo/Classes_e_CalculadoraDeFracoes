public class Pokemons {

    private String tipo;
    private String especie;
    private String nome;

    public Pokemons(String tipo, String especie, String nome) {
        this.tipo = tipo;
        this.especie = especie;
        this.nome = nome;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getTipo() {
        return tipo;
    }

    public void setEspecie(String e) {
        this.especie = e;
    }

    public String getEspecie() {
        return especie;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void exibirTipo() {
        System.out.println("o Charmander é do tipo " + tipo);
    }

    public void exibirEspecie() {
        System.out.println("O Charmander é denominado como " + especie);
    }

    public void exibirNome() {
        System.out.println("O nome do Pokémon é " + nome);
    }
}
