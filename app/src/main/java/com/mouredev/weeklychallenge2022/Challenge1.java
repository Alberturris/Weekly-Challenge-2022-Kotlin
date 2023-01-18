package com.mouredev.weeklychallenge2022;

import java.util.Arrays;

public class Challenge1 {
    /*
     * Reto #1
     * ¿ES UN ANAGRAMA?
     * Fecha publicación enunciado: 03/01/22
     * Fecha publicación resolución: 10/01/22
     * Dificultad: MEDIA
     *
     * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
     * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
     * NO hace falta comprobar que ambas palabras existan.
     * Dos palabras exactamente iguales no son anagrama.
     */

    public static void main(String[] args){
        System.out.println(esAnagrama("romawqe", "awmqoer"));
    }

    public static boolean esAnagrama(String uno, String dos){

        if (uno.equals(dos)){
            return false;
        }

        char[] cUno = uno.toLowerCase().toCharArray();
        char[] cDos = dos.toLowerCase().toCharArray();
        Arrays.sort(cUno);
        Arrays.sort(cDos);

        String n1 = String.valueOf(cUno);
        String n2 = String.valueOf(cDos);

        return n1.equals(n2);
    }
}
