package com.iq.ArrayList;

import java.util.*;
  
class ConvertingArrayListToLinkedList {
  
    // Generic function to convert an ArrayList to LinkedList
    public static <T> List<T> convertALtoLL(List<T> aL)
    {
  
        // Create the LinkedList by passing the ArrayList
        // as parameter in the constructor
        List<T> lL = new LinkedList<>(aL);
  
        // Return the converted LinkedList
        return lL;
    }
    public static void main(String args[])
    {
        // Create an ArrayList
        List<String> aL = Arrays.asList("Geeks",
                                    "forGeeks",
                                    "A computer Portal");
  
        // Print the ArrayList
        System.out.println("ArrayList: " + aL);
  
        // convert the ArrayList to LinkedList
        List<String>
            lL = convertALtoLL(aL);
  
        // Print the LinkedList
        System.out.println("LinkedList: " + lL);
    }
}


    