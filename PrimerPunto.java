import javax.swing.*;

public class PrimerPunto {
    public static void main(String[]args){
    int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desea:  \n 1-Ver el numero mayor \n 2-Ver el numero menor \n 3-Calcular raiz cuadrada \n 4-Elevar una potencia"));
    switch (a){
        case 1->{
            int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            numeroMayor(b,c);
        }
        case 2 ->{
            int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            numeroMenor(b,c);
        }
        case 3->{
            double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero al cual le quiere sacar raiz cuadrada"));
            raizCuadrada(b);
        }
        case 4->{
            double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base"));
            double c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero por el cual quiere elevar la base"));
            potencia(b,c);
        }
    }
    }
    public static void numeroMayor(int b,int c){
        if (b>c){
            JOptionPane.showMessageDialog(null, "El numero mayor es: " + b);
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero mayor es: " + c);
        }
    }
    public static void numeroMenor(int b, int c){
        if (b<c){
            JOptionPane.showMessageDialog(null, "El numero menor es: " + b);
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero menor es: " + c);
        }
    }
    public static void raizCuadrada(double b){
         double c =Math.sqrt(b);
        JOptionPane.showMessageDialog(null,"La raiz cuadrada de: " + b + " es igual a " + c);
    }
    public static void potencia(double b, double c){
        double h = Math.pow(b,c);
        JOptionPane.showMessageDialog(null, "El numero " + b+ "elevado en "+ c + "es igual a: " + h);
    }

}
