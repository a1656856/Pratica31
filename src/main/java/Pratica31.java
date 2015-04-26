import static java.lang.Character.toUpperCase;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio
 */
public class Pratica31 {
    
        private static Date inicio;
        private static String meuNome;
        private static GregorianCalendar dataNascimento;
    public static void main(String[] args) {
        meuNome = "Julio Vancini Bernardi";
        
        inicio = new Date();
        
        String Sobrenome;
        
        char InicialSobrenome, nome1, nome2;
        
        
        meuNome = meuNome.toUpperCase();
        
        System.out.println(meuNome);
        
        
        Sobrenome = meuNome.substring(15);
        Sobrenome = Sobrenome.toLowerCase();
        InicialSobrenome = meuNome.charAt(14);
        InicialSobrenome = toUpperCase(InicialSobrenome);
        nome1 = toUpperCase(meuNome.charAt(0));
        nome2 = toUpperCase(meuNome.charAt(6));
        
     
      
        System.out.println(InicialSobrenome + Sobrenome + ", "+nome1+". "+ nome2+ "." );
        
        Calendar dataAtual = Calendar.getInstance();
        dataNascimento = new GregorianCalendar(1992, 5, 24);
        long dif = dataAtual.getTimeInMillis() - dataNascimento.getTimeInMillis();
        dif = dif / 1000 / 60 / 60 / 24;

        System.out.println("Tempo em dias: " + dif);
        Date fim = new Date();
        long tempo = fim.getTime() - inicio.getTime();
        System.out.println(tempo + "ms");
    }

  
}



