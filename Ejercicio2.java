/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner (System.in);
    int costo_horas;
    int horas_trabajadas;
    int meses_trabajados;
        System.out.println("Ingresar costo por horas");
        costo_horas= teclado.nextInt();
        System.out.println("Ingrese cantidad de horas trabajadas en un mes");
        horas_trabajadas=teclado.nextInt();
        System.out.println("Ingrese cuantos mese trabaja en un año");
        meses_trabajados=teclado.nextInt();
        int salario=(costo_horas*horas_trabajadas)*meses_trabajados;
        System.out.println("El salario por año es de "+salario+" pesos");
        
    
    
    }
    
}
