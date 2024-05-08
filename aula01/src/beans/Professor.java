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
public class Professor extends Pessoa{
    private String matriucla;
    private String tiutlo;
    private String area;

    public Professor(String matriucla, String tiutlo, String area, String RG, String nome, String email) {
        super(RG, nome, email);
        this.matriucla = matriucla;
        this.tiutlo = tiutlo;
        this.area = area;
    }

    public String getMatriucla() {
        return matriucla;
    }

    public void setMatriucla(String matriucla) {
        this.matriucla = matriucla;
    }

    public String getTiutlo() {
        return tiutlo;
    }

    public void setTiutlo(String tiutlo) {
        this.tiutlo = tiutlo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Professor{" + "matriucla=" + matriucla + ", tiutlo=" + tiutlo + ", area=" + area 
                +",RG = " + RG + ", nome = " + nome + ", email = " + email + '}';
    }
    
    
    
    
    
}
