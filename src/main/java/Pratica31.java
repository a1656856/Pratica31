import static java.lang.Math.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio
 */
public class Pratica32 {
    public static void main(String[] args) {
        /* Dentro do método main faça uma chamada para a função densidade, 
        passando valores para x, media e desvio de -1, 67 e 3 respectivamente. 
        Exiba o valor calculado. Verifique se o valor calculado está correto.*/
        System.out.println(densidade(-1, 67, 3));
    }
    
    public static double densidade(double x, double media, 
            double desvio) {
        double d = (exp(-0.5*(pow((x - media)/desvio, 2))))/(sqrt(2*PI)*desvio);
        return d;
    }
}


