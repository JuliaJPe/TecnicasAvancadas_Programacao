/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooaula6;

import beans.Funcionario;
import beans.Horista;
import beans.Mensalista;

/**
 *
 * @author aluno
 */
public class Pooaula6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Funcionario func1 = new Horista(40, 50, "12345", "coordenador", "12.234.456-0", "Jose", "jose@gmail.com");
        System.out.println(func1);
        
        Funcionario func2 = new Mensalista("secretario", "12345", "Secretaria", "12.234.456-0", "Joao", "jose@gmail.com");
        System.out.println(func2);
    }
    
}
