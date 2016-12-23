public class Calcular
{
    //Se define el atributo privado "num" de tipo entero 
    private int num;
    
    //Se define e implementa el metodo para calcular el numero positivo
    int positivo()
    {
        return -1*num;
    }

    //Implementacion de los metodos Getters y Setters del atributo
    //num (encapsulamiento).
    void setNum(int val)
    {
        //al atributo num se le asigna la variable val
        num = val;
    }
    
    int getNum()
    {
        //se retorna el atributo num;
        return num;
    }
}