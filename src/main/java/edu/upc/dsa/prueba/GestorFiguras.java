package edu.upc.dsa.prueba;

public class GestorFiguras
{
    public static double sum (Figura[] l)
    {
        double ret = 0;

        for (Figura f:l)
        {
            ret+=f.area();
        }
        return ret;
    }
}
