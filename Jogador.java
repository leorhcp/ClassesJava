public class Jogador {

    private final int maxVidas=3; 
    private String nome;
    private int num = 0;
    private int vidas = 0;
    static int qtdJogadores = 0;
      
    //Criação de método construtor:
    public Jogador(String nome, int num){
        
        this.nome=nome;
        this.num=num;
        this.vidas=0;     
        System.out.printf("Jogador %s, camisa %d criado.%n",nome, num);

    }
    //Getters and Setters:
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getNum(){
        return this.num;
    }
    public void setNum(int num){
        this.num = num;
    }

    public int getVidas(){
        return this.vidas;
    }
    public void setVidas(int vidas){
        if(vidas > maxVidas){
            this.vidas = maxVidas;
        } else if(vidas < 0){
            this.vidas = 0;
        } else{
            this.vidas=vidas;
        }      
    }

    public void addVidas(){
        if(this.vidas < maxVidas){
            this.vidas ++;
        }

    }
    
}
