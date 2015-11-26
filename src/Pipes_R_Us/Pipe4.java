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
public class Pipe4 extends Pipe {

    private double length;
    private double diameter;
    private double radius; //calculated in object
    private int grade;
    private boolean insu;
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
     * @param insuIn
     * @param chemIn
     * @param colourIn
     * @param lengthIn
     * @param diameterIn
     * @param numIn
     */
    public Pipe4(int gradeIn, boolean insuIn, boolean chemIn, int colourIn, double lengthIn, double diameterIn, int numIn) {
        super(gradeIn, insuIn, chemIn, colourIn, lengthIn, diameterIn, numIn);
        this.grade = gradeIn;
        this.insu = insuIn;
        this.chem = chemIn;
        this.colour = colourIn;
        this.length = lengthIn;
        this.diameter = diameterIn;
        this.numOfPipes = numIn;
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