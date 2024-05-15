/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooaula6;

import beans.DevMensalista;
import beans.Funcionario;
import beans.Horista;
import beans.Mensalista;
import beans.professorHorista;

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
        
        Funcionario funcionarios[] = new Funcionario[4];
        Funcionario func1 = new Horista(40, 50, "12345", "coordenador", "Benjamin", "12.234.456-0", "jose@gmail.com");
        //System.out.println(func1);
        funcionarios[0] = func1;
        
        Funcionario func2 = new Mensalista("secretario", "12345", "Secretaria", "Dom", "12.234.456-0", "jose@gmail.com");
        //System.out.println(func2);
        funcionarios[1] = func2;
        
        Funcionario func3 = new DevMensalista("Junior", "12345", "escritorio","Santiago", "12.234.456-0", "jose@gmail.com");
        //System.out.println(func3);
        funcionarios[2] = func3;
        
        Funcionario func4 = new professorHorista("Mestre", "C", 40, 50, "12345", "Academico", "Alvaro", "12.234.456-0", "jose@gmail.com");
        //System.out.println(func4);
        funcionarios[3] = func4;
        
        double totalINSS = 0;
        double totalIRRF = 0;
        double totalBruto = 0;
        double totalLiquido = 0;
        
        for(int i = 0; i< funcionarios.length; i++){
            System.out.println(funcionarios[i].getNome());
            totalINSS+=funcionarios[i].INSS();
             totalIRRF+=funcionarios[i].IRRF();
              totalBruto+=funcionarios[i].salarioBruto();
               totalLiquido+=funcionarios[i].salarioLiquido();
        }
        System.out.println("Total salario liquido="+totalLiquido);
        System.out.println("Total INSS="+totalINSS);
        System.out.println("Total IRRF="+totalIRRF);
        System.out.println("=Total salario bruto="+totalBruto);
    }
    
}
