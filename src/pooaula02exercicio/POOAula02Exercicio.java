/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooaula02exercicio;

/**
 *
 * @author Mari (48) 99618-5728
 */
public class POOAula02Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Celular c1 = new Celular();
        c1.cor = "preto";
        c1.marca = "Iphone";
        c1.sistemaOperacional = "IOS";
        c1.modelo = "X";
        c1.memoria = 32;
        
        c1.status();
        
        System.out.println("");
        Celular c2 = new Celular();
        c2.cor = "branco";
        c2.marca = "Sansung";
        c2.memoria = 64;
        c2.modelo = "Galaxy M";
        c2.sistemaOperacional = "Android";
        
        c2.status();
       
         
    }
    
}
