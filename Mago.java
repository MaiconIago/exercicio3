public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, 80); // Mago começa com 80 de vida
    }

    @Override
    public void atacar(Personagem p) {
        int dano = new Random().nextInt(15) + 1; // Dano aleatório entre 1 e 15
        p.setVida(p.getVida() - dano);
        System.out.println(getNome() + " lançou um feitiço em " + p.getNome() + " causando " + dano + " de dano.");
    }
}
