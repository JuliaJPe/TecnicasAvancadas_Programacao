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
public abstract class Funcionario extends pessoa implements Empregado{
    protected String matricula;
    protected String departamento;

    public Funcionario(String matricula, String departamento, String nome, String email, String RG) {
        super(nome, email, RG);
        this.matricula = matricula;
        this.departamento = departamento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double IRRF() {
        return 100;
    }

    @Override
    public double INSS() {
        return 100;
    }


    @Override
    public double salarioLiquido() {
        return salarioBruto() - INSS() - IRRF();
    }

    @Override
    public String toString() {
        return "Funcionario{" + "matricula=" + matricula + ", departamento=" + departamento + "nome=" + nome + ", email=" + email + ", RG=" + RG + ", salarioBruto=" + salarioBruto() + ", salarioLiquido = " + salarioLiquido() + '}';
    }

 
    
    
}
