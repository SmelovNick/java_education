package ru.stqa.pft.sandbox;

public class Equation {
    private final double a;
    private final double b;
    private final double c;

    private int i;

    public Equation(double a, double b, double c){

        this.a = a;
        this.b = b;
        this.c = c;
        double d = b*b - 4*a*c;
        if (d>0) {
            i = 2;
        }
        else if (d==0){
            i=1;
        }
        else {
            i=0;
        }
    }

    public int getRootNumber() {
        return i;
    }
}
