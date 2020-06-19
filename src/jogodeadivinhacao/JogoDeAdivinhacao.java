package jogodeadivinhacao;
public class JogoDeAdivinhacao{
    Jogador j1;
    Jogador j2;
    Jogador j3;
    
    public void IniciaJogo(){
    j1 = new Jogador();
    j2 = new Jogador();
    j3 = new Jogador();
    
    int Adivinhaj1 = 0;
    int Adivinhaj2 = 0;
    int Adivinhaj3 = 0;
    
    boolean j1EstaCerto = false;
    boolean j2EstaCerto = false;
    boolean j3EstaCerto = false;
    
    int NumeroAlvo = (int)(Math.random()*10);
    System.out.println("Estou pensando em um número entre 0 e 9... ");
    
    while(true){
    System.out.println("O número a adivinhar é: " + NumeroAlvo);
    j1.adivinhar();
    j2.adivinhar();
    j3.adivinhar();
    
    Adivinhaj1 = j1.Numero;
    System.out.println("O  primeiro jogador forneceu o palpite: " + Adivinhaj1);
    Adivinhaj2 = j2.Numero;
    System.out.println("o segundo jogador forneceu o palpite: " + Adivinhaj2);
    Adivinhaj3 = j3.Numero;
    
    if (Adivinhaj1 == NumeroAlvo){
        j1EstaCerto = true;
    }//fecha if 
    if (Adivinhaj2 == NumeroAlvo){
        j2EstaCerto = true;
    }//fecha if
    if (Adivinhaj3 == NumeroAlvo){
        j3EstaCerto = true;
    }//fecha if
    if (j1EstaCerto || j2EstaCerto || j3EstaCerto){
        System.out.println("Temos um vencedor! ");
        System.out.println("O primeiro jogador acertou? "+ j1EstaCerto);
        System.out.println("O segundo jogador  acertou? "+ j2EstaCerto);
        System.out.println("O terceriro jogador acertou? "+ j3EstaCerto);
        break;
    }else{
        //em caso de empate o jogo continua
        System.out.println("Os jogadores terão que tentar novamente. ");
      }//fecha else
    }//fecha while
  }//fecha IniciaJogo
}//fecha class