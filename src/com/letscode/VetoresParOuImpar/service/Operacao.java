package com.letscode.VetoresParOuImpar.service;

import com.letscode.VetoresParOuImpar.utils.Impressora;
import com.letscode.VetoresParOuImpar.utils.Leitor;

public class Operacao {

    private static int tam = 5;
    private static int[] array = new int[tam];
    private static int[] novoArray = new int[tam];

    public static void armazenarArray() {
        for( int i=0; i<tam; i++ ) {
            array[i] = Leitor.escanearEntradaNumeros();
        }
    }
//    public static void arrayNumPares() {
//        for( int i=0; i<tam; i++ ) {
//            if(array[i] % 2 == 0) {
//                novoArray[] =
//            }//
//        }//
//    }
    public static void imprimirImpares() {
        Impressora.setMostrarNumImpares();
        for( int i=0; i<tam; i++ ) {
            if(array[i] % 2 != 0) {
                Impressora.imprimirNumArray(array[i]);
            }
        }
        System.out.printf("%n");
    }

    public static void imprimirPares() {
        Impressora.setMostrarNumPares();
        for( int i=0; i<tam; i++ ) {
            if(array[i] % 2 == 0) {
                Impressora.imprimirNumArray(array[i]);
            }
        }
        System.out.printf("%n");
    }

}
