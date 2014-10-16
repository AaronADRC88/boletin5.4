
package boletin5.pkg4;

public class Boletin54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pafeira pcncachelos=new Pafeira();
        System.out.println("Clientes: "+pcncachelos.atenderClientes(10, 20));
        pcncachelos.getPatacas();
        pcncachelos.getPolbo();
    }
    
}
/*Na clase creada anteriormente implementa, tamén, os seguintes métodos : 

   public void engadirPolbo(int x ) . Engade x kg de polbo a os xa existentes
   public void engadirPatacas ( int x) . Engade x kg de patacas  ''       ''           
   public void amosarPolbo( ) . Amosa por pantalla os kg de polbo que ten no almacen
   public void amosarPatacas ( ) .  ''        ''       ''              ''   ''    patacas   ''     ''       ''                  
    */