/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pipes_R_Us;

/**
 *
 * @author UP730799 & UP733640
 */
public class Pipe2 extends Pipe {

    private double length;
    private double diameter;
    private double radius; //calculated in object
    private int grade;
    private boolean chem;
    private int colour;
    private double pipeVolume;
    private double cost;
    private double totalCost;
    private double addedCost;
    private int numOfPipes;
    
    /**
     *
     * @param gradeIn
     * @param chemIn
     * @param colourIn
     * @param lengthIn
     * @param diameterIn
     * @param numIn
     */
    public Pipe2(int gradeIn, boolean chemIn, int colourIn, double lengthIn, double diameterIn, int numIn) {
        super(gradeIn, chemIn, colourIn, lengthIn, diameterIn, numIn);
        cost = 0;
    }
    
    /**
     *
     * @return
     */
    public double pipeCost(){
        super.calculateCost();
        return super.getCost();
    }
    
}
