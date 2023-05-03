public class CursoJava{
    public static void main(String[] args){

        Jogador j1 = new Jogador("Leonel", 10);
        Jogador j2 = new Jogador("Silvio", 13);
        Jogador j3 = new Jogador("Ronaldo", 9);
        Jogador j4 = new Jogador("Welington", 11);

        //Jogador.qtdJogadores=3;

        j1.addVidas();
        j1.addVidas();
        j2.addVidas();
        j1.addVidas();
        System.out.println("Quantidade de jogadores: " + Jogador.qtdJogadores);
        System.out.println("Vidas do jogador "+j1.getNome()+":"+ j1.getVidas());
        System.out.println("Vidas do jogador "+j2.getNome()+":"+ j2.getVidas());
        System.out.println("Vidas do jogador "+j3.getNome()+":"+ j3.getVidas());
    }
}