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
public class Horista extends Funcionario{
    protected double numHoras;
    protected double valorHora;

    public Horista(double numHoras, double valorHora, String matricula, String departamento, String nome, String email, String RG) {
        super(matricula, departamento, nome, email, RG);
        this.numHoras = numHoras;
        this.valorHora = valorHora;
    }

    public double getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(double numHoras) {
        this.numHoras = numHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double salarioBruto() {
        return valorHora*numHoras*4;
    }
    
    
}
