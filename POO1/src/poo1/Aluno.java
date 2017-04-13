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
public class Aluno extends Pessoa {
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public void imprimir(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("Matricula: " + this.matricula);
      
    }
    
    public void imprimir(String informacao){
        this.imprimir();
        System.out.println("Informação: " + informacao);
    }
    
}


