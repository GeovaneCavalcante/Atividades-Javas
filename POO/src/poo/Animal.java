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
public abstract class Animal {
    private String nome;
    private String raca;
    private String porte;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
      if (nome.length() < 5) {
          System.out.println("Por favor, informe um nome válido.");
      }else
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
    
    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Raça: " + this.raca);
        System.out.println("Porte:" + this.porte);
    }
    
    
    
}
