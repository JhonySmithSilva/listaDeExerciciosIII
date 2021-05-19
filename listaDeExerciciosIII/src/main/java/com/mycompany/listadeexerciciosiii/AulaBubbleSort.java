/*
 * Faculdade ELO
 * Disciplina: Algoritmos e Estruturas de Dados
 * Professor: João Ferreira
 */
package com.mycompany.listadeexerciciosiii;
import java.util.Scanner;

/**
 * @author Jonatas Severino Da Silva
 */
public class AulaBubbleSort {    
    
    Scanner input = new Scanner(System.in);
    
    private char variavelAuxiliar;    
    private char[] vetor;    
    private boolean troca;
    
    public AulaBubbleSort() {        
    }
    
    public void bubbleSort() {
        
        do{ 
            this.troca = false;           
            for(int i = 0; i < vetor.length -1; i++){
                if(vetor[i] > vetor[i + 1]){
                   this.variavelAuxiliar = this.vetor[i] ;
                   this.vetor[i] = this.vetor[i + 1];
                   this.vetor[i + 1] = this.variavelAuxiliar;
                   this.troca = true;
                }
            }        
        }while(troca == true);
    } 
    
    public void imprimirVetor(){
        for(int i = 0; i< vetor.length; i++) {
        System.out.print("| "+vetor[i]);
        }
        System.out.println(" |\n");
    }
    
    public void preencherVetor(){
        System.out.println("digite uma palavra");
        String texto = input.next();        
        this.vetor = texto.toCharArray();        
    }    
}
