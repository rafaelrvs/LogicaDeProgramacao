/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alunos
 */
public class Mensalista extends Empregado{
    private String cargo;
    
    //Construtor 
    public Mensalista(String n, String e, String c){
        super(n, e);
        cargo = c;
    }
    //Metódos de Acesso

    public void setCargo(String c) {
        cargo = c;
    }
    
     public String getCargo() {
        return (cargo);
    }
     public void calcularSalario(){
        switch (cargo) {
            case "Junior":
                salario = 2500;
                break;
            case "Pleno":
                salario = 3500;
                break;
            default:
                salario = 5500;
                break;
        }
     }

}
