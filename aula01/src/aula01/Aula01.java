/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

import beans.Aluno;
import beans.Pessoa;
import beans.Professor;

/**
 *
 * @author aluno
 */
public class Aula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa pessoa01 = new Pessoa("12.345.678","José Peixoto","josepeixoto@fatec.sp.gov.br");
        Pessoa aluno01 = new Aluno("12345","ADS","fatecTaubaté",
                "12.345.678","José Peixoto","josepeixoto@fatec.sp.gov.br");
        Professor professor01 = new Professor("21213","Doutor","Backend",
                "12.345.678","José Peixoto","josepeixoto@fatec.sp.gov.br");
        System.out.println(professor01.toString());
        System.out.println(aluno01.toString());
        String RG = pessoa01.getRG();
        System.out.println("RG: "+RG);
        pessoa01.setNome("D.Manuel I");
        System.out.println("Pessoa:"+pessoa01.toString());
    }
    
}
