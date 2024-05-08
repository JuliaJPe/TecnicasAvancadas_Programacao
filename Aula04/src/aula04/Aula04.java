/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

import beans.Circulo;
import beans.Esfera;
import beans.Ponto2D;
import beans.Ponto3D;
import beans.Quadrado;
import beans.Retangulo;
import beans.SegReta2D;
import beans.SegReta3D;

/**
 *
 * @author aluno
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Ponto2D ponto01 = new Ponto2D(2, 3);
        Ponto2D ponto02 = new Ponto2D(7, 7);
        System.out.println(ponto01);
        System.out.println(ponto02);
        SegReta2D sr01 = new SegReta2D(ponto01, ponto02);
        sr01.moveX(10);
        
        //System.out.println(sr01);
        Circulo c01 = new Circulo(ponto02, 3);
        c01.moveXY(-2, -2);
        c01.setRaio(2);
        System.out.println(c01);
        
        Quadrado q0 = new Quadrado(ponto01, 2);
        System.out.println(q0.toString());
        
        Retangulo r0 = new Retangulo(ponto01, 2,  4);
        System.out.println(r0);*/
        
        Ponto3D p301 = new Ponto3D(2, 3.5, 5);
        Ponto3D p302 = new Ponto3D(5.5, 7.5, 9);

        /*System.out.println(p301);
        p301.moveXZ(1, 1);
        System.out.println(p301);*/
        SegReta3D sr301 = new SegReta3D(p301, p302);
        System.out.println(sr301);
        Ponto3D p00 = sr301.getP0();
        p00.moveXZ(-5, -5);
        System.out.println(sr301); 
        
        Esfera esf01 = new Esfera(p301, 3);
        System.out.println(esf01);
        esf01.moveYZ(2, 5);
        System.out.println(esf01);
                }
    
}
