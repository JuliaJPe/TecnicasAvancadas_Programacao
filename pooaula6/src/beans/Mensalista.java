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
public class Mensalista extends Funcionario{
    protected String cargo;

    public Mensalista(String cargo, String matricula, String departamento, String nome, String email, String RG) {
        super(matricula, departamento, nome, email, RG);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public double salarioBruto() {
        if (cargo.equalsIgnoreCase("auxiliarEnsino"))
            return 1500;
        else if(cargo.equalsIgnoreCase("auxiliarAdministrativo"))
            return 1800;
        else if (cargo.equalsIgnoreCase("secretario"))
            return 2500;
        else if (cargo.equalsIgnoreCase("coordenador"))
            return 4500;
        else if (cargo.equalsIgnoreCase("diretor"))
            return 5500;
        else return 0;
    }
    
    

    
    
}
