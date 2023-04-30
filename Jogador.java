import java.rmi.StubNotFoundException;

import javax.sound.sampled.SourceDataLine;

public class Jogador {

    //Criação de método construtor:
    public Jogador(String nome, int num){
        System.out.printf("Jogador %s, camisa %d criado.%n",nome, num);

    }
    
}
