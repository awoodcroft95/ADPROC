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
public class Pipe3 extends Pipe {

    
    /**
     *
     * @param gradeIn
     * @param chemIn
     * @param colourIn
     * @param lengthIn
     * @param diameterIn
     * @param numIn
     */
    public Pipe3(int gradeIn, boolean chemIn, int colourIn, double lengthIn, double diameterIn, int numIn) {
        super(gradeIn, chemIn, colourIn, lengthIn, diameterIn, numIn);
        cost = 0;
    }
    
    /**
     * Uses the inherited methods, calculateCost and getCost from the Pipe
     * abstract class.
     *
     * @return calculates and returns the cost of the pipe order.
     */
    public double pipeCost(){
        super.calculateCost();
        return super.getCost();
    }
    
}