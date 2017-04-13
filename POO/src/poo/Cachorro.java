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
public class Cachorro extends Animal {
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
        
    public void latir(){
        System.out.println("cachorro latindo");
    }
    
    @Override
    public void imprimir(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Raça: " + this.getRaca());
        System.out.println("Porte:" + this.getPorte());
        System.out.println("Idade: " + this.idade);        
    }
    
    public void imprimir(String polimorfo){
        imprimir();
        System.out.println(polimorfo);
    }
    
    
}
