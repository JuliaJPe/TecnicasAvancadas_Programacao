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
public class pessoa {
    protected String nome;
    protected String email;
    protected String RG;

    public pessoa(String nome, String email, String RG) {
        this.nome = nome;
        this.email = email;
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    @Override
    public String toString() {
        return "pessoa{" + "nome=" + nome + ", email=" + email + ", RG=" + RG + '}';
    }

   
    
    
}
