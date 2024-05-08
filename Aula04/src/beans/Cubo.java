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
public class Cubo {
    private Ponto3D p0;
    private double lado;

    public Cubo(Ponto3D p0, double lado) {
        this.p0 = new Ponto3D(p0.getX(), p0.getY(), p0.getZ());
        this.lado = lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Ponto3D getP0() {
        return new Ponto3D(p0.getX(), p0.getY(), p0.getZ());
    }

    public double getLado() {
        return lado;
    }
    public Ponto3D calcP1() {
        return new Ponto3D(p0.getX()+lado, p0.getY(), p0.getZ());
    }
    public Ponto3D calcP2() {
        return new Ponto3D(p0.getX(), p0.getY()+lado, p0.getZ());
    }
    public Ponto3D calcP3() {
        return new Ponto3D(p0.getX()+lado, p0.getY()+lado, p0.getZ());
    }
    public Ponto3D calcP4() {
        return new Ponto3D(p0.getX(), p0.getY(), p0.getZ()+lado);
    }
    public Ponto3D calcP5() {
        return new Ponto3D(p0.getX()+lado, p0.getY(), p0.getZ()+lado);
    }
    public Ponto3D calcP6() {
        return new Ponto3D(p0.getX(), p0.getY()+lado, p0.getZ()+lado);
    }
    public Ponto3D calcP7() {
        return new Ponto3D(p0.getX()+lado, p0.getY()+lado, p0.getZ()+lado);
    }
    
    
}
