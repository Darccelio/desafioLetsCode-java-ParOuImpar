package com.letscode.VetoresParOuImpar.utils;

public class Impressora {

    private final static String MENSAGEM_INSERCAO_NUMBEROS = "Por favor, insira um número .....: ";
    private final static String MOSTRAR_NUM_IMPARES = "Os números impares do array são .....: ";
    private final static String MOSTRAR_NUM_PARES = "Os números pares do array são .....: ";

    public static void setMostrarNumImpares() {
        System.out.print(MOSTRAR_NUM_IMPARES);
    }

    public static void setMostrarNumPares() {
        System.out.print(MOSTRAR_NUM_PARES);
    }

    public static void imprimirSolicitacaoNumero() {
        System.out.print(MENSAGEM_INSERCAO_NUMBEROS);
    }

    public static void imprimirNumArray(int num) {
        System.out.print(num + ", ");
    }


}
