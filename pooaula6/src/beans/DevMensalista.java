/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author aluno
 */
public class DevMensalista extends Mensalista{
    private String classe;

    public DevMensalista(String classe, String matricula, String departamento, String nome, String email, String RG) {
        super(classe, matricula, departamento, nome, email, RG);
        this.classe = classe;
    }


    
    
     @Override
    public double salarioBruto() {
        if (classe.equalsIgnoreCase("Junior"))
            return 3500;
        else if(classe.equalsIgnoreCase("Pleno"))
            return 5500;
        else if (classe.equalsIgnoreCase("Senior"))
            return 8500;
        
        else return 0;
    }
}
