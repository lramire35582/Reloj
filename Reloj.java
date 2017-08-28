import java.util.Scanner;
import java.io.*;

public class Reloj
{
    private int hora;
    private int minutos;
    private int segundos;
    
       
    public Reloj(int h, int m, int s)
    {
        hora = h;
        minutos = m;
        segundos = s;
    }
    
    public int getHora(){
        return hora;
    }
        public int getMinutos(){
        return minutos;
    }
        public int getSegundos(){
        return segundos;
    }
          
    public void cambiarHora(int nuevaHora){
        hora = nuevaHora;
    }
        public void cambiarMinutos(int nuevoMinutos){
        minutos = nuevoMinutos;
    }
        public void cambiarSegundos(int nuevoSegundos){
       segundos = nuevoSegundos;
    }
    
    public String Fail(){
       if (hora > 23 || minutos > 59 || segundos > 59){
         return "la hora NO es valida"; 
       }
       return "La hora es valida";
    }
    
    public void avanzarSegundo(){
        if(segundos <= 58){
         segundos = segundos + 1;
         }
        else{
        if(minutos <=58){
        minutos = minutos + 1;
        segundos = 00;
        }
        else{
        if(hora < 23){
        hora = hora + 1;
        minutos = 00;
        segundos = 00;
        }else{
        hora = 00;
        minutos = 00;
        segundos = 00;
        }
        }
        }
    }
        
    public void retrocederSegundo(){
        if(segundos >= 1){
         segundos = segundos - 1;
         }
        else{
        if(minutos >= 1){
        minutos = minutos - 1;
        segundos = 59;
        }
        else{
        if(hora > 1){
        hora = hora - 1;
        minutos = 59;
        segundos = 59;
        }else{
        hora = 23;
        minutos = 59;
        segundos = 59;
        }
        }
        } 
    }
    
    public String toString(){
        return hora+":"+minutos+":"+segundos;
    }
    
    public static void main(String[] args ){
        int hor, min, seg;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese Hora"); 
        hor = teclado.nextInt();
        System.out.println("Ingrese Minuto"); 
        min = teclado.nextInt();
        System.out.println("Ingrese Segundo"); 
        seg = teclado.nextInt();
        
        Reloj clock = new Reloj(hor, min, seg);
        Reloj relojant = new Reloj(hor, min, seg);
        Reloj relojdes = new Reloj(hor, min, seg);
        
        System.out.println(clock.Fail());
        
        System.out.println("La hora es ="+ clock);
        relojdes.avanzarSegundo();
        System.out.println("el reloj un segundo despues ="+ relojdes);
        relojant.retrocederSegundo();
        System.out.println("el reloj un segundo antes ="+ relojant);
        
        
    }
}
