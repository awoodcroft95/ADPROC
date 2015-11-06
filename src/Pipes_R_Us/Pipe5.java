/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pipes_R_Us;

/**
 *
 * @author up733640
 */
public class Pipe5 extends Pipe {

    private double pipeVolume;
    private double cost;
    private double totalCost;
    private double addedCost;
    public int numOfPipes;
    
    public Pipe5(int gradeIn, boolean insuIn, boolean reinIn, boolean chemIn, int colourIn, double lengthIn, double diameterIn) {
        super(gradeIn, insuIn, reinIn, chemIn, colourIn, lengthIn, diameterIn);
    }
    
    public double pipe5Cost(){
        super.claculateCost();
        return super.getCost();
    }
    
}