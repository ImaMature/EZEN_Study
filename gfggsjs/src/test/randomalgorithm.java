package test;

import java.util.ArrayList;
import java.util.Random;
public class randomalgorithm {



	   public static void main(String[] args) {
	      useMethod();
	   }
	   
	   public static void useMethod() {
	      Random ran = new Random();
	      ArrayList<Integer> arr = new ArrayList<>();
	      int saveBefore;
	      int saveAfter = 0;
	      int i = 0;
	      
	      while(true) {
	         saveBefore = ran.nextInt(1000000) + 1;
	         if(saveAfter == 0) {
	            saveAfter = saveBefore;
	            System.out.println("After : " + saveAfter);
	         } else {
	            if(saveBefore < (saveAfter + 10000) && saveBefore > (saveAfter - 10000)) {
	               saveAfter = saveBefore;
	               arr.add(saveAfter);
	               System.out.println(arr.get(i));
	               i++;
	               if(saveAfter <= 0) {
	                  System.out.println("코인상장폐지");
	                  break;
	               }
	               try {
	                  Thread.sleep(1000);
	               } catch (InterruptedException e) {
	                  System.out.println(e.getMessage());
	               }
	            }
	         }
	      }
	   }
	}

