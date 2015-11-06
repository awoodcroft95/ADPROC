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
public class Pipe {

    private double length;
    private double diameter;
    private double radius; //calculated in object
    private int grade;
    private int type; //calculated in object
    private boolean insu;
    private boolean rein;
    private boolean chem;
    private int colour;
    private String pipecol;
    private double pipeVolume;
    private double cost;
    private double totalCost;
    private double addedCost;
    public int numOfPipes;

    public Pipe() {
    }

    public Pipe(int gradeIn, boolean insuIn, boolean reinIn, boolean chemIn, int colourIn, double lengthIn, double diameterIn) { // general pipes/pipe parent
        this.grade = gradeIn;
        this.insu = insuIn;
        this.rein = reinIn;
        this.chem = chemIn;
        this.colour = colourIn;
        this.length = lengthIn;
        this.diameter = diameterIn;
        cost = 0;
    }
    
    public Pipe(int gradeIn, boolean chemIn, int colourIn, double lengthIn, double diameterIn){   //pipe 2,3
        this.grade = gradeIn;
        this.chem = chemIn;
        this.colour = colourIn;
        this.length = lengthIn;
        this.diameter = diameterIn;
    }
    
    public Pipe(int gradeIn, boolean chemIn, double lengthIn, double diameterIn){  //pipe1
        this.grade = gradeIn;
        this.chem = chemIn;
        this.length = lengthIn;
        this.diameter = diameterIn;
    }
    
    public Pipe(int gradeIn, boolean insuIn, boolean chemIn, int colourIn, double lengthIn, double diameterIn){ // pipe4
        this.grade = gradeIn;
        this.insu = insuIn;
        this.chem = chemIn;
        this.colour = colourIn;
        this.length = lengthIn;
        this.diameter = diameterIn;
    }
    
// inherited in indiviual pipe classes
    public void claculateCost() {
        double lengthInch = length * 39.37;
        radius = diameter / 2;
        double innerRadius = radius * 0.9;
        pipeVolume = (((Math.PI * Math.pow(radius, 2)) * lengthInch) - ((Math.PI * Math.pow(innerRadius, 2)) * lengthInch));

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

    }
    
    public double getCost(){
        return this.totalCost;
    }
    
    //needs to be moved to main and used to validate user input
    public void calcType(){
        if((grade <= 3 & grade > 0) & (colour == 0) & (!insu) & (!rein)){
            this.type = 1;
        }else if((grade <=4 & grade > 1) & (colour <= 1) & (!insu) & (!rein)){
            this.type = 2;
        }else if((grade <=5 & grade > 1) & (colour <= 2) & (!insu) & (!rein)){
            this.type = 3;
        }else if((grade <=5 & grade > 1) & (colour <= 2) & (!rein)){
            this.type = 4;
        }else if((grade <=5 & grade > 2) & (colour <= 2)){
            this.type = 5;
        }else{
            System.out.println("Not a valid pipe type.");
        }
            
    }
    
}
