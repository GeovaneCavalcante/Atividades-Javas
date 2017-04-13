/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author geovane
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cachorro c1 = new Cachorro();
        c1.setNome("Lessi");
        c1.setPorte("Medio");
        c1.setRaca("Vira Lata");
        c1.setIdade(3);
        
        c1.imprimir();
        c1.imprimir("aqui é a forma mais basica de polimorfismo.");
        
        Gato gato = new Gato();
        gato.setNome("calabreza");
        gato.setPorte("atoa");
        gato.setRaca("ciamés");
        gato.setTipo("pelagem");
        gato.miar();
        
        gato.imprimir();
        gato.im
        
      
        
        
    }
    
}
