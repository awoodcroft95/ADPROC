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
public abstract class Pipe {

    protected double length;
    protected double diameter;
    protected double radius; //calculated in object
    protected int grade;
    protected boolean insu;
    protected boolean rein;
    protected boolean chem;
    protected int colour;
    protected double pipeVolume;
    protected double cost;
    protected double totalCost;
    protected double addedCost;
    protected int numOfPipes;

    /**
     * Empty Constructor
     */
    public Pipe() {
    }

    /**
     *
     * @param gradeIn
     * @param insuIn
     * @param reinIn
     * @param chemIn
     * @param colourIn
     * @param lengthIn
     * @param diameterIn
     * @param numIn
     */
    public Pipe(int gradeIn, boolean insuIn, boolean reinIn, boolean chemIn, int colourIn, double lengthIn, double diameterIn, int numIn) { // general pipes/pipe parent
        this.grade = gradeIn;
        this.insu = insuIn;
        this.rein = reinIn;
        this.chem = chemIn;
        this.colour = colourIn;
        this.length = lengthIn;
        this.diameter = diameterIn;
        this.numOfPipes = numIn;
        cost = 0;
    }

    /**
     *
     * @param gradeIn
     * @param chemIn
     * @param colourIn
     * @param lengthIn
     * @param diameterIn
     * @param numIn
     */
    public Pipe(int gradeIn, boolean chemIn, int colourIn, double lengthIn, double diameterIn, int numIn) {   //pipe 2,3
        this.grade = gradeIn;
        this.chem = chemIn;
        this.colour = colourIn;
        this.length = lengthIn;
        this.diameter = diameterIn;
        this.numOfPipes = numIn;
    }

    /**
     *
     * @param gradeIn
     * @param chemIn
     * @param lengthIn
     * @param diameterIn
     * @param numIn
     */
    public Pipe(int gradeIn, boolean chemIn, double lengthIn, double diameterIn, int numIn) {  //pipe1
        this.grade = gradeIn;
        this.chem = chemIn;
        this.length = lengthIn;
        this.diameter = diameterIn;
        this.numOfPipes = numIn;
    }

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
    public Pipe(int gradeIn, boolean insuIn, boolean chemIn, int colourIn, double lengthIn, double diameterIn, int numIn) { // pipe4
        this.grade = gradeIn;
        this.insu = insuIn;
        this.chem = chemIn;
        this.colour = colourIn;
        this.length = lengthIn;
        this.diameter = diameterIn;
        this.numOfPipes = numIn;
    }

    /**
     * Used in pipe classes to calculate cost.
     */
    public void calculateCost() {
        calcVolume();
        switch (grade) {
            case 1:
                cost = 0.3 * pipeVolume;
                break;
            case 2:
                cost = 0.32 * pipeVolume;
                break;
            case 3:
                cost = 0.35 * pipeVolume;
                break;
            case 4:
                cost = 0.4 * pipeVolume;
                break;
            case 5:
                cost = 0.46 * pipeVolume;
                break;
            default:
                break;
        }
        totalCost = cost;
        addedCost = 0;
        if (colour == 1) {
            addedCost = (cost * 0.12);
            totalCost = addedCost + totalCost;
        } else if (colour == 2) {
            addedCost = (cost * 0.17);
            totalCost = addedCost + totalCost;
        }
        if (insu) {
            addedCost = (cost * 0.14);
            totalCost = addedCost + totalCost;
        }
        if (rein) {
            addedCost = (cost * 0.15);
            totalCost = addedCost + totalCost;
        }
        if (chem) {
            addedCost = (cost * 0.17);
            totalCost = addedCost + totalCost;
        }
        totalCost = totalCost * numOfPipes;
        totalCost = Math.round(totalCost * 100);
        totalCost = totalCost / 100;

    }

    /**
     *
     * @return returns the total cost of the pipe.
     */
    public double getCost() {
        return this.totalCost;
    }

    /**
     * Calculates the volume of the pipe, used in the calculateCost method.
     */
    public void calcVolume() {
        double lengthInch = this.length * 39.37;
        radius = this.diameter / 2;
        double innerRadius = radius * 0.9;
        pipeVolume = (((Math.PI * Math.pow(radius, 2)) * lengthInch) - ((Math.PI * Math.pow(innerRadius, 2)) * lengthInch));
    }

    /**
     *
     * @return returns some information about the pipe as a string to be used in
     * the Pipes_GUI
     */
    public String returnInfo() {
        return "Pipe of Length " + this.length + "m <br> Diameter " + this.diameter + "in <br> Cost = " + this.totalCost;
    }

}
