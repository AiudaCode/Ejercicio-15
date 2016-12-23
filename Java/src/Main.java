
import javax.swing.JOptionPane;

public class Main
{
    public static void main(String[] args)
    {
        //Se crea un objeto de la clase Calcular (Instanciaciación)
        Calcular obj = new Calcular();
        
        //Se define una variable llamada "n" de tipo entero
        int n;

        //utilizaremos el ciclo do-while en este ejercicio
        //el ciclo do-while se utiliza mucho cuando necesitamos pedir
        //cierta información y despues la tenemos que comprobar
        //si la expresion booleana es verdadera de lo contrario volvera
        //a repetir sus instrucciones.

        //en este caso se pedira el numero negativo, si el usuario escribe
        //un numero positivo, entonces volvera a repetir que digite un numero
        //negativo, hasta que no se digite el numero negativo no dejara de
        //repetir sus instrucciones.
        do
        {
            //se convierte la variable n a Entero porque como vamos a utilizar el showInputDialog, este
            //metodo convertira la varible a String, es por eso que necesitamos convertirla a entero (int)
            n = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero negativo: "));
        }
        while(n >= 0);//si el numero es mayor o igual que 0 repetira las instrucciones.

        //encapsulamos el numero negativo
        obj.setNum(n);

        //ahora mostraremos el numero negativo y positivo del mismo:
        JOptionPane.showMessageDialog(null,"El numero negativo es: " + obj.getNum());
        JOptionPane.showMessageDialog(null,"El numero positivo es: " + obj.positivo());
    }
}