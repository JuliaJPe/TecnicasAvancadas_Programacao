/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooaula04;

import beans.Ponto2D;
import beans.SegmentoReta2D;

/**
 *
 * @author aluno
 */
public class Pooaula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Ponto2D ponto01 = new Ponto2D(2, 2);
       Ponto2D ponto02 = new Ponto2D(7, 7);
       System.out.println(ponto01);
       System.out.println(ponto02);
       SegmentoReta2D segReta = new SegmentoReta2D(ponto01, ponto02);
       System.out.println(segReta);
       ponto02.moveX(3);
       ponto01.moveY(3);
       System.out.println(segReta);
    }
    
}
