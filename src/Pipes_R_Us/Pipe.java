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

    protected double length; //user input for the length of pipe
    protected double diameter; //user input for the diameter of pipe
    protected double radius; // radius of the pipe, calculated in calcVolume method
    protected int grade; //user input for the grade of plasic for the pipe
    protected boolean insu; //whether or not the user has selected for the pipe to have insulation
    protected boolean rein; //whether or not the user has selected for the pipe to have reinforcement
    protected boolean chem; //whether or not the user has selected for the pipe to have chemical resistance
    protected int colour; //how many colours the pipe has
    protected double pipeVolume; //volume of the pipe, calculated in the calcVolume method
    protected double cost; //base cost fo the pipe without additions, calculated in calculateCost method
    protected double totalCost; //total cost of the pipe with additions, calculated in calculateCost method
    protected double addedCost; //the added costs which are added to the base cost of the piep 
    protected int numOfPipes; //number of pipes of this spec in this order, used to calculate the total cost
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
