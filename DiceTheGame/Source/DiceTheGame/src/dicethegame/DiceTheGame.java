/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dicethegame;
import com.sun.source.tree.BreakTree;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author Voldwyce
 */
public class DiceTheGame {


    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner in = new Scanner (System.in);
        
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("");
        System.out.println("DDDD   IIIII   CCC   EEEEE");
        System.out.println("D   D    I    C   C  E");
        System.out.println("D   D    I    C      E");
        System.out.println("D   D    I    C      EEE  ");
        System.out.println("D   D    I    C      E");
        System.out.println("D   D    I    C   C  E");
        System.out.println("DDDD   IIIII   CCC   EEEEE");
        System.out.println("");
        
        System.out.println("+------------------------+"); 
        System.out.println("|                        |");
        System.out.println("|     Menu Principal     |");
        System.out.println("|                        |");
        System.out.println("| (1) Jugar              |");
        System.out.println("| (2) Configuracion      |");
        System.out.println("| (3) Salir              |");
        System.out.println("|                        |");
        System.out.println("+------------------------+"); 
        System.out.println("");
        System.out.print("Seleccionar: ");
        int menuOption = in.nextInt();
        boolean valor = false;
         if (menuOption == 1) {
             System.out.println("Cargando...");
             System.out.println("...");
             System.out.println("");
             System.out.println("");
             valor = true;
        }
         else if (menuOption == 2) {
             System.out.println("Todavia no hay configuracion... :v ");
             System.out.println("Pulsa e para jugar.");
             String volver = in.next();
        }
         else if (menuOption == 3) {
             new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
             System.out.println("Adios!!");
             System.out.println("");
             System.out.println("Pulsa e para salir.");
             int wait = in.nextInt();
              try {
            Runtime.getRuntime().exec("taskkill /f /im cmd.exe") ;
        } catch (Exception e) {
            e.printStackTrace();  
        }
             
        }
         
         int dinero = 10;
         int action = 0;
         boolean end = false;
         while (dinero > 1 && end != true) {
             new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
             System.out.println("Dinero: " + dinero + "$");
             System.out.println("Que quieres hacer?");
             System.out.println("");
             System.out.println("+------------------------+"); 
             System.out.println("|                        |");
             System.out.println("| (1) Jugar              |");
             System.out.println("| (2) Retirarse          |");
             System.out.println("|                        |");
             System.out.println("+------------------------+"); 
             System.out.println("");
             System.out.print("Seleccionar: ");
             action = in.nextInt();
             
             if (action == 1) {
                 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                 System.out.println("Dinero: " + dinero + "$");
                 System.out.print("Selecciona una apuesta: ");
                 int dineroS = in.nextInt();
                 if (dineroS > dinero) {
                     System.out.println("No hay suficiente dinero para apostar.");
                     System.out.print("Selecciona otra apuesta: ");
                     dineroS = in.nextInt();
                 }
                 System.out.println("Selecciona un numero (1-6): ");
                 int num = in.nextInt();
                 if (num > 7 && num > 0) {
                     System.out.println("Debes introducir un numero dentro del valor.");
                     System.out.print("Selecciona otro numero: ");
                     num = in.nextInt();
                 }
                 int max = 6;
                 int min = 1;
                 int random = (int)Math.floor(Math.random()*(max-min+1)+min);
                 
                 System.out.println("");
                 System.out.println("");
                 System.out.println("El numero és: " + random);
                 if (num == random) {
                     int res = dineroS * 2;
                     System.out.println("Has ganado: " + res + "$");
                     System.out.println("");
                     System.out.println("Pulsa e para continuar.");
                     String volver = in.next();
                     dinero += dineroS;
                 }
                 if (num != random){ 
                     System.out.println("Has perdido: " + dineroS + "$");
                     System.out.println("Pulsa e para continuar.");
                     String volver = in.next();
                     dinero -= dineroS;
                     
             }
        
             }
                  if (action == 2) {
                  end = true;
             }
 
    
         
}
         new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
         System.out.println("");
         System.out.println("+------------------------+"); 
         System.out.println("|                        |");
         System.out.println("| Dinero total: " + dinero + "$       |");
         System.out.println("|                        |");
         System.out.println("+------------------------+"); 
         System.out.println("");
         System.out.println("Pulsa e para salir.");
         String exit = in.next();
    }
    
}
