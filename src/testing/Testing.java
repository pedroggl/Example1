package testing;

import java.util.Scanner;

public class Testing {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int precio[] = new int[5];
        for (int i = 0; i < precio.length; i++) {
            System.out.println("Introduzca un numero");
            precio[i] = in.nextInt();
            System.out.println("Precio con descuento es: " + precioConIVA(precio[i]));
            System.out.println("Actualizando .java para subir a github");
        }
    }

    public static double precioConIVA(double precio) {
        double IVA = precio * 21 / 100;
        double precioConIVA = precio + IVA;
        return precioConIVA;
    }

}
