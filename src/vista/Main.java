/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {

    //MÉTODO QUE LLAMA AL INTÉRPRETE DE JAVA
    public static void main(String[] args) {
        //1.-DECLARAR VARIABLES A TRAVÉS
        //DE DATOS PRIMITIVOS
        //números enteros
        int nombreInt = 0;
        //números decimales
        double nombreDouble = 0.00;
        //caracteres
        char nombreChar = 'A';
        //boleanos true/false
        boolean nombreBoolean = false;
        //OBJETOS
        //Cadenas 
        String nombreString = "hoy es viernes y mañana hay clases";

        //Imprimir en consola
//        System.out.println("El valor del entero es:"+nombreInt);
//        System.out.println("El valor del decimal es:"+nombreDouble);
//        System.out.println("El valor del caracter es:"+nombreChar);
//        System.out.println("El valor del boleano es:"+nombreBoolean);
//        nombreInt=15;
//        System.out.println("El valor del entero es:"+nombreInt);
//        System.out.println("El contenido de la cadena es:"+nombreString);
        //EJERCICIO POBLACIONAL , VAMOS A SIMULAR LA POBLACIÓN DE 
        //CONEJOS , POR LO QUE NECESITO CONOCER LOS SIGUIENTES DATOS:
        //1.- EL NÚMERO DE PAREJAS DE CONEJOS POR AÑO
        //2.- EL NÚMERO DE CRÍAS POR PAREJA POR AÑO TOMANDO EN CUENTA QUE 
        //ESTE DATO SE EJECUTARÁ DESPUÉS DEL PRIMER AÑO
        //3.- EL PORCENTAJE DE TASA DE MORTALIDAD ANUAL
        //4.- SIMULAR ESTO DURANTE UN PERIODO DE TIEMPO
        //5.- MOSTRAR LA POBLACIÓN ANUAL ,EL NÚMERO DE CONEJOS 
        //QUE MORIRÁ, Y LA POBLACIÓN RESTANTE
        Scanner s = new Scanner(System.in);
        //Imprime en consola un mensaje
        System.out.println("Ingrese el número de parejas de conejos:");
        //capturar el mensaje
        int parejas = s.nextInt();
        //Imprimo mensaje
        System.out.println("Ingrese el número de crias por pareja:");
        //capturo la entrada realizada por el usuario mediante teclado
        int nCrias = s.nextInt();
        int c = 0;
        double tMortalidad = 0;
//        while (c == 0) {
//            System.out.println("Ingrese el % de mortalidad");
//            tMortalidad = s.nextDouble();
//
//            if (tMortalidad > 100) {
//                System.out.println("Ingrese un número menor a 100");
//            } else {
//                c = 1;
//                s.next();
//            }
//        }
        int j = 0;
        do {
            System.out.println("Ingrese el % de mortalidad");
            tMortalidad = s.nextDouble();
            if (tMortalidad > 100) {
                System.out.println("Ingrese un número menor a 100");
            } else {
                j = 1;
                s.next();
            }

        } while (j == 0);

    

    System.out.println (
    "Ingrese el periodo a simular:");
        int periodo = s.nextInt();

    int pAnual = 0;
    int pTotal = 0, pMorir = 0, crias = 0;

    for (int i = 0;
    i <= periodo ;
    i

    
        ++) {
            if (i == 0) {
            pAnual = parejas * 2;
            pMorir = (int) (pAnual * (tMortalidad) / 100);
            pTotal = pAnual - pMorir;
        } else {
            crias = parejas * nCrias;
            pAnual += crias;
            pMorir = (int) (pAnual * (tMortalidad) / 100);
            pTotal = pAnual - pMorir;
            parejas = pTotal / 2;

        }
        System.out.println("Año:" + i + "\n"
                + "Población Actual es:" + pAnual);
        System.out.println("Población Morir es:" + pMorir);
        System.out.println("Población Total es:" + pTotal);
        System.out.println("El Número de parejas es:" + parejas);
        System.out.println("Número de Crias anuales:" + crias);
    }

}

}
