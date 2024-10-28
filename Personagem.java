import java.util.Random;

public abstract class Personagem {
    private final String nome;
    private int vida;
    private final Random random;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
        this.random = new Random();
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public abstract void atacar(Personagem p);
    
    public void curar() {
        int cura = random.nextInt(10) + 1; // Cura aleatória entre 1 e 10
        this.vida += cura;
        System.out.println(nome + " curou " + cura + " pontos de vida.");
    }
}