
package coche;


public class Coche {
   
    private int velocidade,valor,menos;
    public Coche(){
         velocidade=0;
    }
    
    public void setVelocidade(int velocidade){
        this.velocidade=velocidade;
    }
    
    public int getVelocidade(){
       
        return velocidade;
    }
    
    public void acelerar (int valor){
           velocidade=this.velocidade+valor;
    }
    
    public void frenar(int menos){
          velocidade=this.velocidade+menos;
    } 

}
    
        
    
    

