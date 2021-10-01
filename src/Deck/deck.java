package Deck;
import java.util.Random;
public class deck {
    public static void main(String[] args) {

     Random card = new Random();   
     String[] palo = {"Treboles","Corazones","Picas","Diamantes"};
     String[] color = {"Negro","Rojo"};
     String[] valor = {"2","3","4","5","6","7","8","9","10","A","J","Q","K"};
     int p = card.nextInt(palo.length);
     int c = card.nextInt(color.length);
     int v = card.nextInt(valor.length);
     System.out.println("Una carta con palo: " + palo[p]+ " " + "De color: "+color[c] + " " + "De valor: " + valor[v] );
   }
 }

#Prueba



