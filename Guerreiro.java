public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 100); 
    }

    @Override
    public void atacar(Personagem p) {
        int dano = new Random().nextInt(20) + 1; 
        p.setVida(p.getVida() - dano);
        System.out.println(getNome() + " atacou " + p.getNome() + " causando " + dano + " de dano.");
    }
}