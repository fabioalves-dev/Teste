package io;

import java.util.Scanner;

/*
 * Entrada e Saída (I/O) de dados no Java.
 * 
 * Entrada de dados: Ler dados digitados pelo usuário.
 * Saída de dados: Escrever dados para o usuário.
 */
public class ioNotasEstudos {
    // Leitura de daods de entrada
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int valorDigitado = scanner.nextInt();
       System.out.println(valorDigitado);
       scanner.close();


    }
}
