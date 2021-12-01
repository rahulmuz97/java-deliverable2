package com.scuba.arraylist;

import java.util.*;  

class ArrayListExample
{  
   public static void main(String args[]){  
      ArrayList<String> alist=new ArrayList<String>();  
      alist.add("Lion");//displaying elements
      alist.add("Cat");
      alist.add("Tiger");
      alist.add("Leopard");
      alist.add("Tom");
      alist.add("Jerry");
      System.out.println(alist);

      alist.add(3, "Lion"); //Adding "Steve" at the fourth position
  
      System.out.println(alist);   //displaying elements
   }  
}
