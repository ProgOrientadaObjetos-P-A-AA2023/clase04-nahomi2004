/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        
        FacturaTelefonica fac = new FacturaTelefonica();
        
        fac.calcularValorFactura(); 
        
        System.out.printf("%s\n", fac);
        
        fac.establecerNumeroTelefono("0968467693");
        
        System.out.printf("%s\n", fac);
    }
}
