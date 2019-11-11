package com.hillel.IhorProkhorov.HomeTaskEleven;

import java.util.HashMap;
import java.util.Map;

public class TaskThree {

    private double aArgument;
    private double bArgument;
    private double cArgument;
    private double discriminant;

    public TaskThree(double aArgument, double bArgument, double cArgument) {
        this.aArgument = aArgument;
        this.bArgument = bArgument;
        this.cArgument = cArgument;
    }

    public boolean isAQuadratic(){
        return this.aArgument != 0;
    }

    public double findingDiscriminant(){
        if (isAQuadratic()) {
            this.discriminant = this.bArgument * this.bArgument - 4 * this.aArgument * this.cArgument;
            return discriminant;
        }
        return -1;
    }

    public Map calculateRoots(){
        double d = findingDiscriminant();
        double root1;
        double root2;
        Map<String,Double> map = new HashMap();
        if (d > 0){
            root1 = (-this.bArgument + Math.sqrt(d)) / (2 * this.aArgument);
            root2 = (-this.bArgument - Math.sqrt(d)) / (2 * this.aArgument);
            map.put("root1", root1);
            map.put("root2", root2);
        }
        else if (d == 0){
            root1 = root2 = - this.bArgument / (2 * this.aArgument);
            map.put("root1", root1);
            map.put("root2", root2);
        }
        else if (d < 0 && d != -1){
            double imaginary = Math.sqrt(-d) / (2 * this.aArgument);
            root1 = root2 = - this.bArgument / (2 * this.aArgument);
            map.put("root1", root1 + imaginary);
            map.put("root2", root2 - imaginary);
        }
        else if (d == -1){
            root1 = - this.cArgument / this.bArgument;
            map.put("root1", root1);
        }
        return map;
    }
}
