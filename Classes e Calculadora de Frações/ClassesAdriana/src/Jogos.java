public class Jogos {

        private String plataforma;
        private int anoDeLancamento;
        private String nome;

        public Jogos(String plataforma, int anoDeLancamento, String nome) {
            this.plataforma = plataforma;
            this.anoDeLancamento = anoDeLancamento;
            this.nome = nome;
        }

        public void setPlataforma(String p) {
            this.plataforma = p;
        }

        public String getPlataforma() {
            return plataforma;
        }

        public void setAnoDeLancamento(int a) {
            this.anoDeLancamento = a;
        }

        public int getAnoDeLancamento() {
            return anoDeLancamento;
        }

        public void setNome(String n) {
            this.nome = n;
        }

        public String getNome() {
            return nome;
        }

        public void exibirPlataforma() {
            System.out.println("Super Mario Odyssey é exclusivo de " + plataforma);
        }

        public void exibirAnoDeLancamento() {
            System.out.println("Super Mario Odyssey foi lançado em " + anoDeLancamento);
        }

        public void exibirNome() {
            System.out.println("O nome do jogo é " + nome);
        }
    }
