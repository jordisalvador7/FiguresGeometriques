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
        System.out.println("Area Círculo:" + cercle.area());
        System.out.println("Area Cuadrado:" + square.area());
        System.out.println("Area Rectangulo:" + rectangle.area());
        System.out.println("Area Triángulo:" + triangle.area());
        System.out.println("Suma de áreas del vector:" + GestorFiguras.sum(l));

    }
}
