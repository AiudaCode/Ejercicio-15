#ifndef CALCULAR_H
#define CALCULAR_H


class Calcular
{
    public:
        Calcular();//metodo constructor
        virtual ~Calcular();//metodo destructor

        //Se definen los metodos publicos:
        int positivo();//el metodo "positivo" de tipo entero

        //se definen los metodos para encapsular el atributo "num"
        void setNum(int val);
        int getNum();
    protected:

    private:
        //se definen el atributo privado "num" de tipo entero
        int num;
};

#endif // CALCULAR_H
