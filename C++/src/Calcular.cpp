#include "Calcular.h"

Calcular::Calcular()
{
    //se le asigna a num el valor de 0, en el constructor
    //de la clase Calcular
    num = 0;
}

Calcular::~Calcular()
{
    //dtor
}

//Implementación del metodo para calcular el numero positivo
int Calcular::positivo()
{
    return -1*num;
}


//Implementacion de los metodos Getters y Setters del atributo
//num (encapsulamiento).
void Calcular::setNum(int val)
{
    //al atributo num se le asigna la variable val
    num = val;
}

int Calcular::getNum()
{
    //se retorna el atributo num;
    return num;
}
