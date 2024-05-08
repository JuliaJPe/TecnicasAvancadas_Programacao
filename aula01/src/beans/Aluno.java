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
public class Aluno extends Pessoa{
    private String RA;
    private String curso;
    private String faculdade;

    public Aluno(String RA, String curso, String faculdade, String RG, String nome, String email) {
        super(RG, nome, email);
        this.RA = RA;
        this.curso = curso;
        this.faculdade = faculdade;
        
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    @Override
    public String toString() {
        return "Aluno{" + "RA=" + RA + ", curso=" + curso + ", faculdade=" + faculdade 
                + ",RG = " + RG + ", nome = " + nome + ", email = " + email + '}';
    }
    
}
