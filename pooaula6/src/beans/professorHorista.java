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
public class professorHorista extends Horista{
    private String titulo;
    private String nivel;

    public professorHorista(String titulo, String nivel, double numHoras, double valorHora, String matricula, String departamento, String nome, String email, String RG) {
        super(numHoras, valorHora, matricula, departamento, nome, email, RG);
        this.titulo = titulo;
        this.nivel = nivel;
        calcValorHora();
    }

   

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    
     private void calcValorHora() {
        
        valorHora = 30;
        if(titulo.equalsIgnoreCase("especialista"))
            valorHora+=10;
        else if(titulo.equalsIgnoreCase("mestre"))
            valorHora +=20;
        else if(titulo.equalsIgnoreCase("Doutor"))
            valorHora += 30;
        
        if(nivel.equalsIgnoreCase("A"))
            valorHora+= valorHora*0.1;
        else if(nivel.equalsIgnoreCase("B"))
            valorHora+= valorHora*0.2;
        else if(nivel.equalsIgnoreCase("C"))
            valorHora+= valorHora*0.3;
        
      
    }
    
}
