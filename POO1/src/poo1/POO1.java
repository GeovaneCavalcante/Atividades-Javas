/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo1;

/**
 *
 * @author geovane
 */
public class POO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

       
       Professor nonilton = new Professor();       
        
       nonilton.setNome("Nonilton Alves");
       nonilton.setIdade(35);
       nonilton.setSexo("Indefinido");
       nonilton.setEndereco("rua tal");
       nonilton.imprimir(); //executa o metodo da ancestral
       
       Aluno a = new Aluno();
       a.setNome("matheus");
       a.setIdade(24);
       a.setSexo("indefinido");
       a.setMatricula("242424");
       a.imprimir();
       a.imprimir("aluno curso sistema"); //executa o imprimir da descendente
       
       
//       classes abstratas
//       encapsulamento
//       reutilização de codigo
//       sobrescrita de codigo
//       sobrecarga de codigo
//       Herança
       
    }
    
}
