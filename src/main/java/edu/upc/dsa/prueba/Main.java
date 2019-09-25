package edu.upc.dsa.prueba;

import org.w3c.dom.css.Rect;

public class Main {

    public static void main(String[] args)
    {
        Figura cercle = new Cercle (4);
        Figura square = new Square (3);
        Figura rectangle = new Rectangle(5,3);
        Figura triangle = new Triangle(3,6);

        Figura [] l = {triangle, cercle, rectangle, cercle, square, cercle};
        System.out.println(GestorFiguras.sum(l));

    }
}
