/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alunos
 */
public class Horista extends Empregado {
    private double horas;
    //Construtor
   public Horista(String n, String e, double h){
       super(n, e);
       horas = h;
   }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double h) {
        horas = h;
    }
   public void calcularSalario(){
       salario = horas * 50;
   }
   
   
   
}
