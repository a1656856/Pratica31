import java.util.Date;
import java.util.GregorianCalendar;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio
 */
public class Pratica31 {
    private static String meuNome = "Julio Vancini Bernardi";
    private static GregorianCalendar dataNascimento = new GregorianCalendar(1992, 5, 24);
    private static Date inicio, fim;
    
    public static void main(String[] args) {
        inicio = new Date();
        
        String maiusculo;
        maiusculo = meuNome.toUpperCase();
        
        System.out.println(maiusculo);
        
        String nomeFormatado;
        
        nomeFormatado = meuNome.substring(14, 15).toUpperCase() +
                meuNome.substring(15).toLowerCase() + ", "
                + meuNome.substring(0, 1).toUpperCase() + ". "
                + meuNome.substring(6, 7).toUpperCase() + ".";
        
        System.out.println(nomeFormatado + "\n");
        
        long dias;
        
        dias = (inicio.getTime() - dataNascimento.getTimeInMillis())
        /(1000*3600*24);
        
        System.out.println(dias);
        
        fim = new Date();
        
        long ms = fim.getTime() - inicio.getTime();
        
        System.out.println(ms);
        
    }
}



