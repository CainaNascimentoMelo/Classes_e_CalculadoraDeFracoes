import java.util.*;
public class Main {
    public static void main(String[] args) {
        int opcao = 1;
        Scanner sc = new Scanner(System.in);

        Espadas esp = new Espadas(1053, "Japão", "Tentetsutou");
        Pessoas pes = new Pessoas("branco", 1992, "Arthur Cervero");
        Animais ani = new Animais("Corvus Corax", "necrófaga", "corvo");
        Carros car = new Carros("RIO2A18", "vermelho fosco", "Argo");
        Livros liv = new Livros("20.000 Léguas Submarinas", "Romance", "Jules Verne");
        Jogos jog = new Jogos("Nintendo Switch", 2017, "Super Mario Odyssey");
        Pokemons pok = new Pokemons("Fogo","Pokémon Lagarto", "Charmander");
        Videogames vid = new Videogames("Nintendo 3DS",699,2011);
        Instrumentos ins = new Instrumentos("cordas", 1930,"Baixo Elétrico");
        Cadernos cad = new Cadernos("azul", 299,"A4");

        while (opcao != 0) {
                    System.out.println("__________________________________________________________________");
                    System.out.println("| Escolha o número do método que deseja executar:                |" +
                            "\n| 1 - Exibir ano de criação da Tentetsutou.                      |" +
                            "\n| 2 - Exibir país de surgimento da Tentetsutou.                  |" +
                            "\n| 3 - Exibir etnia de Arthur.                                    |" +
                            "\n| 4 - Exibir ano de nascimento de Arthur.                        |" +
                            "\n| 5 - Exibir qual espécie os corvos pertencem.                   |" +
                            "\n| 6 - Exibir dieta alimentar dos corvos.                         |" +
                            "\n| 7 - Exibir a placa do carro.                                   |" +
                            "\n| 8 - Exibir a cor atual do carro.                               |" +
                            "\n| 9 - Exibir título do livro.                                    |" +
                            "\n| 10 - Exibir gênero literário do livro.                         |" +
                            "\n| 11 - Exibir em qual plataforma pode jogar Super Mario Odyssey. |" +
                            "\n| 12 - Exibir em que ano foi lançado Super Mario Odyssey.        |" +
                            "\n| 13 - Exibir de qual tipo o Charmander é.                       |" +
                            "\n| 14 - Exibir de que espécie é o Charmander.                     |" +
                            "\n| 15 - Exibir o nome do videogame.                               |" +
                            "\n| 16 - Exibir a qual preço está o videogame, atualmente.         |" +
                            "\n| 17 - Exibir qual o tipo de instrumento do Baixo Elétrico.      |" +
                            "\n| 18 - Exibir quando foi criado o Baixo Elétrico.                |" +
                            "\n| 19 - Exibir a cor da capa do caderno.                          |" +
                            "\n| 20 - Exibir a quantidade de páginas que o caderno possui.      |"

                    );
                    opcao = sc.nextInt();
                    switch (opcao) {
                        case 0:
                            System.exit(0);
                            break;
                        case 1:
                            esp.exibirAnoDeCriacao();
                            break;
                        case 2:
                            esp.exibirPaisDeOrigem();
                            break;
                        case 3:
                            pes.exibirEtnia();
                            break;
                        case 4:
                            pes.exibirAnoDeNascimento();
                            break;
                        case 5:
                            ani.exibirEspecie();
                            break;
                        case 6:
                            ani.exibirDietaAlimentar();
                            break;
                        case 7:
                            car.exibirPlaca();
                            break;
                        case 8:
                            car.exibirCor();
                            break;
                        case 9:
                            liv.exibirTitulo();
                            break;
                        case 10:
                            liv.exibirGenero();
                            break;
                        case 11:
                            jog.exibirPlataforma();
                            break;
                        case 12:
                            jog.exibirAnoDeLancamento();
                            break;
                        case 13:
                            pok.exibirTipo();
                            break;
                        case 14:
                            pok.exibirEspecie();
                            break;
                        case 15:
                            vid.exibirNome();
                            break;
                        case 16:
                            vid.exibirPreco();
                            break;
                        case 17:
                            ins.exibirTipoDeInstrumento();
                            break;
                        case 18:
                            ins.exibirAnoDeCriacao();
                            break;
                        case 19:
                            cad.exibirCorDaCapa();
                            break;
                        case 20:
                            cad.exibirQuantidadeDePaginas();
                            break;

                            default:
                            System.out.println("Esta opção não existe. Por favor, insira um novo número:");
                    }
                }
            }
        }

