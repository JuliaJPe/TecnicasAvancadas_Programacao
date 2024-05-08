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
public class Paralelepipido {
    private Ponto3D p0;
    private double base;
    private double altura;
    private double profundidade;

    public Paralelepipido(Ponto3D p0, double base, double altura, double profundidade) {
        this.p0 = new Ponto3D(p0.getX(), p0.getY(), p0.getZ());
        this.base = base;
        this.altura = altura;
        this.profundidade = profundidade;
    }
    
    
}
