package edu.upc.dsa.prueba;

public class Square extends Rectangle
{
    private double l;

    public void setL(double l)
    {
        this.l=l;
    }

    public double getL()
    {
        return l;
    }

    public Square(double l)
    {
        super(l,l);
        this.l = l;
    }

    public double area()
    {
        return l*l;
    }




}
