import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.math.*;

public class returner {
    public int counter;
    public ArrayList<Integer> top;
    public ArrayList<Integer> highCard;

    public returner(int counter, ArrayList<Integer> top, ArrayList<Integer> highCard){
        this.counter = counter;
        this.top =  top;
        this.highCard =  highCard;
    }

    public int getCounter() {
        return this.counter;
     }
  
     public ArrayList<Integer> getTop() {
        return this.top;
     }

     public ArrayList<Integer> getHighCard() {
        return this.highCard;
     }

     public void printout(){
        System.out.println(getCounter());
        for(int i = 0; i < (getTop().size()); i++){
            System.out.print(getTop().get(i));
        }
        System.out.print("\n");
        if(!(getHighCard().isEmpty())){
            for(int i = 0; i < (getHighCard().size()); i++){
                System.out.print(getHighCard().get(i));
            }
        }
        System.out.println("\n");;
     }

     public boolean compare(returner compare){
        if((this.getCounter() == compare.getCounter()) && 
           (this.getTop().equals(compare.getTop())) &&
           (this.getHighCard().equals(compare.getHighCard()))){
            return true;
           } else {
            return false;
           }
    }
}


