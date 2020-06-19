package jogodeadivinhacao;
public class Jogador{
    int Numero = 0; //aqui entra o palpite
    
    public void adivinhar(){
        Numero = (int)(Math.random()*10);
        System.out.println("Estou pensando em " + Numero);
    }//fecha metodo
}//fecha class