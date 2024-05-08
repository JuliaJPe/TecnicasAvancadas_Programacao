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
public class Retangulo implements Figura2D {
    private Ponto2D p0;
    private double base;
    private double altura;

    public Retangulo(Ponto2D p0, double base, double altura) {
        this.p0 = new Ponto2D(p0.getX(), p0.getY());
        this.base = base;
        this.altura = altura;
    }

    public Ponto2D getP0() {
        return new Ponto2D(p0.getX(), p0.getY());
    }
    
    public Ponto2D calcP1() {
        return new Ponto2D(p0.getX()+base, p0.getY());
    }
    
    public Ponto2D calcP2() {
        return new Ponto2D(p0.getX(), p0.getY()+altura);
    }
    
    public Ponto2D calcP3() {
        return new Ponto2D(p0.getX()+base, p0.getY()+altura);
    }


    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double area() {
        return base*altura;
    }

    @Override
    public double perimetro() {
        return base*2+altura*2;
    }

    @Override
    public void moveX(double dX) {
        p0.moveX(dX);
    }

    @Override
    public void moveY(double dY) {
        p0.moveY(dY);
    }

    @Override
    public void moveXY(double dX, double dY) {
        p0.moveXY(dX, dY);
    }

    @Override
    public String toString() {
        return "Retangulo{" + "p0=" + p0 + ","
                +  ", p1=" + calcP1()+
                 ", p2=" + calcP2() +
                 ", p3=" + calcP3() +
                ", Area=" + area() +
                ", Perimetro=" + perimetro() +
                ", base=" + base + 
                ", altura=" + altura + '}';
    }
    
    
        
    
}
