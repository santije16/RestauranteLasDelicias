/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Santiago Jimenez Escobar - Kevin Andres Zapata Nuñez
 * 3. En el restaurante las Delicias se sirven 5 platos diferentes. 
 * Cada plato se reconoce por un código. Diariamente se atienden a numerosos clientes, 
 * por lo que es necesario generar facturas con este formato.

Factura número: 1

CLAVE    CANTIDAD   PRECIO UNITARIO    PRECIO TOTAL

1        1              15.000             15.000

3        4              20.000             80.000

5        2              30.000             60.000
* 
* TOTAL A PAGAR:      $ 155.000
* 
* Realizar un programa que realice lo siguiente:
a. Registre el precio de los 5 platos
b. Registre los datos de cada cliente y entregue una factura como la presentada 
   anteriormente. Las facturas se enumeran de 1 hasta N, desde el comienzo del día.
c. Calcule el plato que más fue vendido al final del día.
d. Calcule lo que ha vendido el restaurante las Delicias al final del día.
 */
public class RestauranteLasDelicias {
    public static void main (String[] args){
        int clave, cantidad1=0, cantidad2=0, cantidad3=0, cantidad4=0, cantidad5=0, numeroFactura = 0, 
                contarBandeja = 0, contarAjiaco = 0, contarSancocho = 0, contarArroz = 0, 
                contarCalCosti = 0, numeroDocCliente, claveaux1 = 0, claveaux2 = 0, claveaux3 = 0, claveaux4 = 0, claveaux5 = 0;
        float precioUnitario1=0, precioUnitario2=0, precioUnitario3=0, precioUnitario4=0, precioUnitario5=0,
                PrecioTotal1 = 0, PrecioTotal2 = 0, PrecioTotal3 = 0, PrecioTotal4 = 0, PrecioTotal5 = 0, totalAPagar, totalFinDia = 0;
        char c, i;
        String nombre;
        Scanner sc = new Scanner (System.in);
        
        c = 's';
        while (c == 's' || c == 'S') 
        {
            numeroFactura++;
            
            System.out.println("Ingrese el nombre del cliente N°"+numeroFactura+":");
            nombre = sc.nextLine();
            System.out.println("Ingrese el numero de documento del cliente: ");
            numeroDocCliente = sc.nextInt();
            
            i = 's';
            totalAPagar = 0;
            claveaux1=0; 
            claveaux2=0; 
            claveaux3=0; 
            claveaux4=0; 
            claveaux5=0;
            PrecioTotal1=0; 
            PrecioTotal2=0; 
            PrecioTotal3=0; 
            PrecioTotal4=0; 
            PrecioTotal5=0;
            while (i == 's' || i == 'S') 
            {
                System.out.println("CENTRO DE REGISTROS RESTAURANTE LAS DELICIAS");
                System.out.println("---------Ingrese la clave del plato---------");
                System.out.println();
                System.out.println("1. Bandeja Paisa: ");
                System.out.println("2. Ajiaco: ");
                System.out.println("3. Sancocho: ");
                System.out.println("4. Arroz chino: ");
                System.out.println("5. Caldo de costilla: ");
                clave = sc.nextInt();
                
                switch (clave) 
                {
                    case 1:
                        System.out.println("Ingrese la cantidad vendida de platos de bandeja paisa: ");
                        cantidad1 = sc.nextInt();
                        System.out.println("Ingrese el precio unitario de la bandeja paisa: ");
                        precioUnitario1 = sc.nextFloat();
                        PrecioTotal1 = precioUnitario1 * cantidad1;
                        contarBandeja+=cantidad1;
                        claveaux1 = 1;
                        break;
                    case 2:
                        System.out.println("Ingrese la cantidad vendida de platos de ajiaco: ");
                        cantidad2 = sc.nextInt();
                        System.out.println("Ingrese el precio unitario del ajiaco: ");
                        precioUnitario2 = sc.nextFloat();
                        PrecioTotal2 = precioUnitario2 * cantidad2;
                        contarAjiaco+=cantidad2;
                        claveaux2 = 2;
                        break;
                    case 3:
                        System.out.println("Ingrese la cantidad vendida de platos de Sancocho: ");
                        cantidad3 = sc.nextInt();
                        System.out.println("Ingrese el precio unitario del Sancocho: ");
                        precioUnitario3 = sc.nextFloat();
                        PrecioTotal3 = precioUnitario3 * cantidad3;
                        contarSancocho+=cantidad3;
                        claveaux3 = 3;
                        break;
                    case 4:
                        System.out.println("Ingrese la cantidad vendida de platos de arroz chino: ");
                        cantidad4 = sc.nextInt();
                        System.out.println("Ingrese el precio unitario del arroz chino: ");
                        precioUnitario4 = sc.nextFloat();
                        PrecioTotal4 = precioUnitario4 * cantidad4;
                        contarArroz+=cantidad4;
                        claveaux4 = 4;
                        break;
                    case 5: 
                        System.out.println("Ingrese la cantidad vendida de platos de caldo de costilla: ");
                        cantidad5 = sc.nextInt();
                        System.out.println("Ingrese el precio unitario del caldo de costilla: ");
                        precioUnitario5 = sc.nextFloat();
                        PrecioTotal5 = precioUnitario5 * cantidad5;
                        contarCalCosti+=cantidad5;
                        claveaux5 = 5;
                        break;
                    default:
                        System.out.println("El codigo ingresado no es correcto");
                }
                System.out.println("Desea Ingresar otro plato, 's' para Si ó 'n' para No: ");
                i = sc.next().charAt(0);
            }
            totalAPagar = PrecioTotal1+PrecioTotal2+PrecioTotal3+PrecioTotal4+PrecioTotal5; 
            totalFinDia += totalAPagar;
            
            System.out.println("Cliente: "+ nombre + "  |  Documento numero: "+numeroDocCliente);
            System.out.println("Factura número"+numeroFactura);
            System.out.println("CLAVE   CANTIDAD     PRECIO UNITARIO    PRECIO TOTAL");
            if (claveaux1 != 0) {
                System.out.println(claveaux1 +"       "+cantidad1+"            "+precioUnitario1+"            "+PrecioTotal1);
            }
            if (claveaux2 != 0) {
                System.out.println(claveaux2 +"       "+cantidad2+"            "+precioUnitario2+"            "+PrecioTotal2);
            }
            if (claveaux3 != 0) {
                System.out.println(claveaux3 +"       "+cantidad3+"            "+precioUnitario3+"            "+PrecioTotal3);
            }
            if (claveaux4 != 0) {
                System.out.println(claveaux4 +"       "+cantidad4+"            "+precioUnitario4+"            "+PrecioTotal4);
            }
            if (claveaux5 != 0) {
                System.out.println(claveaux5 +"       "+cantidad5+"            "+precioUnitario5+"            "+PrecioTotal5);
            }
            System.out.println();
            System.out.println("TOTAL A PAGAR: $ "+totalAPagar);
            
            System.out.println();
            System.out.println("Desea ingresar otra factura, 's' para Si ó 'n' para No: ");
            c = sc.next().charAt(0);
            sc.nextLine();
        }
        System.out.println();
        System.out.println("FIN DEL DIA LABORAL");
        if (contarBandeja> contarAjiaco && contarBandeja>contarSancocho) {
            if (contarBandeja>contarArroz && contarBandeja>contarCalCosti) {
                System.out.println("El plato mas vendido fue Bandeja Paisa con "+contarBandeja+" platos vendido");
            }
        }
        if (contarAjiaco>contarBandeja && contarAjiaco>contarSancocho) {
            if (contarAjiaco>contarArroz && contarAjiaco>contarCalCosti) {
                System.out.println("El plato mas vendido fue Ajiaco con "+contarAjiaco+" platos vendido");
            }
        }
        if (contarSancocho>contarBandeja && contarSancocho>contarAjiaco) {
            if (contarSancocho>contarArroz && contarSancocho>contarCalCosti) {
                System.out.println("El plato mas vendido fue Sancocho con "+contarSancocho+" platos vendido");
            }
        }
        if (contarArroz>contarBandeja && contarArroz>contarAjiaco) {
            if (contarArroz>contarSancocho && contarArroz>contarCalCosti) {
                System.out.println("El plato mas vendido fue Arroz chino con "+contarArroz+" platos vendido");
            }
        }
        if (contarCalCosti>contarBandeja && contarCalCosti>contarAjiaco) {
            if (contarCalCosti>contarSancocho && contarCalCosti>contarArroz) {
                System.out.println("El plato mas vendido fue caldo de costilla con "+contarCalCosti+" platos vendido");
            }
        }
        System.out.println("El total vendido al final del dia fue: $ "+totalFinDia);
    }
}
