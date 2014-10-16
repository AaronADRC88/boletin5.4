
package boletin5.pkg4;

public class Pafeira {

    private int polbo;
    private int patacas;
    public int x;
    public int y;
    public Pafeira (){
        
    }
    public Pafeira (int polbo,int patacas){
        
    }
    public int atenderClientes (int p,int c){
        polbo=p;
        patacas=c;
        int clientes=(polbo+patacas);
        return clientes;
    }
     public void setPolbo(int a){
         polbo=a;
     }
     public void setPatacas(int b){
         patacas=b;
     }
     public void getPolbo(){
         System.out.println("Polbo: " +polbo);
     }
     public void getPatacas(){
         System.out.println("Patacas: "+patacas);
     }
     public void engadirPolbo(int x){
         int polboactual;
         polboactual=x+polbo;
       }
    public void engadirPatacas( int y){
        int patacasactuais;
        patacasactuais=patacas+y;
    }
    public void amosarPolbo(){
        int polboactual = x+polbo;
        System.out.println("Polbo no almacén="+polboactual);
    }
     public void amosarPatacas(){
        int patacasactuais = y+patacas;
        System.out.println("Patacas no almacén="+patacasactuais);
     }
}

/*Na clase creada anteriormente implementa, tamén, os seguintes métodos : 

   public void engadirPolbo(int x ) . Engade x kg de polbo a os xa existentes
   public void engadirPatacas ( int x) . Engade x kg de patacas  ''       ''           
   public void amosarPolbo( ) . Amosa por pantalla os kg de polbo que ten no almacen
   public void amosarPatacas ( ) .  ''        ''       ''              ''   ''    patacas   ''     ''       ''                  
    */