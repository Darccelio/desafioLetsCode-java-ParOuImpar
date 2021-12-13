package com.letscode.VetoresParOuImpar.utils;

import java.util.Scanner;

public class Leitor {
    
    private static Scanner sc = new Scanner(System.in);

    public static int escanearEntradaNumeros() {
        Impressora.imprimirSolicitacaoNumero();
        return sc.nextInt();
    }
}
