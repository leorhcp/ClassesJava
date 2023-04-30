public class CursoJava{
    public static void main(String[] args){

        Jogador j1 = new Jogador("Leonel", 10);
        Jogador j2 = new Jogador("Silvio", 13);
        Jogador j3 = new Jogador("Ronaldo", 9);

        j1.addVidas();
        j1.addVidas();
        j1.addVidas();
        j1.addVidas();
        System.out.println("Vidas do jogador "+j1.getNome()+":"+ j1.getVidas());
    }
}