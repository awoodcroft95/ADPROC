/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pipes_R_Us;

/**
 *
 * @author UP733640 & UP730799
 */
public class Pipe5 extends Pipe {

    
    /**
     * Constructor for the Pipe5 object
     * inherited constructor from Pipe abstract class
     * 
     * 
     * @param gradeIn grade of the plastic
     * @param insuIn whether the pipe has insulation or not
     * @param reinIn whether the pipe has reinforcement or not
     * @param chemIn whether the pipe has chemical resistance or not
     * @param colourIn if the pipe has 0, 1 or 2 colours
     * @param lengthIn length of the pipe
     * @param diameterIn diameter of the pipe
     * @param numIn number of pipes with this spec to be ordered
     */
    public Pipe5(int gradeIn, boolean insuIn, boolean reinIn, boolean chemIn, int colourIn, double lengthIn, double diameterIn, int numIn) {
        super(gradeIn, insuIn, reinIn, chemIn, colourIn, lengthIn, diameterIn, numIn);
        cost = 0;
    }
    
    /**
     * Calculates then returns the cost of the pipe.
     * Uses the inherited methods of calculateCost and getCost from the Pipe
     * abstract class.
     * @return the cost of the pipe
     */
    public double pipeCost(){
        super.calculateCost();
        return super.getCost();
    }
    
}