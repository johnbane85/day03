package myapp.core;

import java.util.*;

public class PrintStars {
    public static void main(String[] args) {
       int rows = 5;
       int height = 3;
       
      for (int h=0; h < height; h++) {
       for (int r=0; r< rows; r++) {
         String s = "";
         for (int c =0; c< r +1; c++){
           System.out.print("*");
         }
         System.out.println();
       }
    }
  }
}