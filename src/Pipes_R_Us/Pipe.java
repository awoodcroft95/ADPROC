/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pipes_R_Us;

/**
 *
 * @author UP730799 &
 */
public abstract class Pipe {
    private double length;
    private double diameter;
    private double radius; //calculated in object
    private int grade;
    private boolean insu;
    private boolean rein;
    private boolean chem;
    private int colour;
    private double pipeVolume;
    private double cost;
    private double totalCost;
    private double addedCost;
    private int numOfPipes;

    public Pipe() {
    }

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

    public Pipe(int gradeIn, boolean chemIn, int colourIn, double lengthIn, double diameterIn, int numIn) {   //pipe 2,3
        this.grade = gradeIn;
        this.chem = chemIn;
        this.colour = colourIn;
        this.length = lengthIn;
        this.diameter = diameterIn;
        this.numOfPipes = numIn;
    }

    public Pipe(int gradeIn, boolean chemIn, double lengthIn, double diameterIn, int numIn) {  //pipe1
        this.grade = gradeIn;
        this.chem = chemIn;
        this.length = lengthIn;
        this.diameter = diameterIn;
        this.numOfPipes = numIn;
    }

    public Pipe(int gradeIn, boolean insuIn, boolean chemIn, int colourIn, double lengthIn, double diameterIn, int numIn) { // pipe4
        this.grade = gradeIn;
        this.insu = insuIn;
        this.chem = chemIn;
        this.colour = colourIn;
        this.length = lengthIn;
        this.diameter = diameterIn;
        this.numOfPipes = numIn;
    }

// inherited in indiviual pipe classes
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
        System.out.println(cost);
        totalCost = cost;
        System.out.println(totalCost);
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

    public double getCost() {
        return this.totalCost;
    }
    
    public void calcVolume() {
        double lengthInch = this.length * 39.37;
        radius = this.diameter / 2;
        double innerRadius = radius * 0.9;
        pipeVolume = (((Math.PI * Math.pow(radius, 2)) * lengthInch) - ((Math.PI * Math.pow(innerRadius, 2)) * lengthInch));
    }
    
    
    public String returnInfo(){
        return "Pipe of Length " + this.length + "m <br> Diameter " + this.diameter + "in <br> Cost = " + this.totalCost;
    }

}
