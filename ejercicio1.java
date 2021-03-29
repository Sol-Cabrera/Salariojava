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
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
    int costo_horas;
    int horas_trabajadas;
        System.out.println("Ingrese el costo por hora");
        costo_horas=teclado.nextInt();
        System.out.println("Ingrese cantidada de horas trabajadas por mes");
        horas_trabajadas=teclado.nextInt();
        int salario=costo_horas*horas_trabajadas;
        System.out.println("El salario mensual es "+salario+" pesos");
    
    
    }
    
}
