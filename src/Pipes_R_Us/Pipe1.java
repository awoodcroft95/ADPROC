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
public class Pipe1 extends Pipe {

    private double pipeVolume;
    private double cost;
    private double totalCost;
    private double addedCost;
    public int numOfPipes;
    
    public Pipe1(int gradeIn, boolean chemIn, double lengthIn, double diameterIn) {
        super(gradeIn, chemIn, lengthIn, diameterIn);
    }
    
    public double pipe1Cost(){
        super.claculateCost();
        return super.getCost();
    }
}
