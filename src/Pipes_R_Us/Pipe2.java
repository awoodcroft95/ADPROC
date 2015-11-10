/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pipes_R_Us;

/**
 *
 * @author UP730799
 */
public class Pipe2 extends Pipe {

    private double pipeVolume;
    private double cost = 0;
    private double totalCost;
    private double addedCost;
    public int numOfPipes;
    
    public Pipe2(int gradeIn, boolean chemIn, int colourIn, double lengthIn, double diameterIn) {
        super(gradeIn, chemIn, colourIn, lengthIn, diameterIn);
    }
    
    public double pipeCost(){
        super.calculateCost();
        return super.getCost();
    }
    
}
