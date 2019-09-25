package edu.upc.dsa.prueba;

public interface GestorFiguras
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
