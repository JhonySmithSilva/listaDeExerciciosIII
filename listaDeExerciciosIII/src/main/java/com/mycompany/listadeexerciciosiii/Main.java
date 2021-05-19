/*
 * Faculdade ELO
 * Disciplina: Algoritmos e Estruturas de Dados
 * Professor: João Ferreira
 */
package com.mycompany.listadeexerciciosiii;

/**
 * @author Jonatas Severino Da Silva
 */
public class Main {
    
    public static void main(String[] args) {         
        AulaBubbleSort bs = new AulaBubbleSort();

        bs.preencherVetor();
        bs.imprimirVetor();
        System.out.println("aplicando bubbleSort aos elementos do vetor...");
        bs.bubbleSort();
        System.out.println("\n depois do bubbleSort");
        bs.imprimirVetor();
    }
}
