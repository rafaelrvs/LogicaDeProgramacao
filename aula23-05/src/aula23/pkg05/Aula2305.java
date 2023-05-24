/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula23.pkg05;

/**
 *
 * @author alunos
 */
public class Aula2305 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String st,st2;
       float real, real2;
       int int1, int2;
       
       //string para real
       st ="12";
       real = (float) (new Float(st).floatValue());
       System.out.println("String para real " + real);
       
       //Real para String
       real2 = 10;
       st2 = new Float (real2).toString();
       System.out.println("real para string " + st2);
       
       //String para inteiro
       st2 = "13";
       int1 = Integer.parseInt(st2);
       System.out.println("String para inteiro " + int1);
       
       //Inteiro para String
       int2 = 5;
       st2 = Integer.toString(int2);
       System.out.println("Inteiro para String " + st2);
       
    }
        
        
}
