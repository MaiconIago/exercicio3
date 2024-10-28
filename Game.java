public class Game implements jogador {
    private final Personagem jogador;
    private final Personagem computador;

    public Game(Personagem jogador, Personagem computador) {
        this.jogador = jogador;
        this.computador = computador;
    }

    /**
     *
     */
    @Override
    public void jogar() {
        Random random = new Random();
        while (jogador.getVida() > 0 && computador.getVida() > 0) {
            jogador.atacar(computador);
            if (computador.getVida() <= 0) {
                System.out.println(computador.getNome() + "aniquilado");
                break;
            }

            
            if (random.nextBoolean()) { 
                computador.atacar(jogador);
                if (jogador.getVida() <= 0) {
                    System.out.println(jogador.getNome() + "vc foi morto");
                    break;
                }
            }

            if (random.nextBoolean()) { 
                jogador.curar();
            }
        }
    }

    /**
     * @param <Jogo>
     * @param args
     */
    @SuppressWarnings("hiding")
    public static <Jogo> void main(String[] args) {
        Personagem jogador = new Guerreiro("Jogador");
        Personagem computador = new Mago("Computador");

        @SuppressWarnings("unchecked")
        final Jogo jogo = (Jogo) new Game(jogador, computador);
        ((Game) jogo).jogar();
    }
}