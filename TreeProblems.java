/*
 * *** Connor Hendren 002 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
    //
    // This can be done numerous ways, but once such will only that
    // *several* lines of code. Hint: create two temporary TreeSets and utilize the
    // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.

    //Make a new set
    //Start with all of A
    Set<Integer> result = new TreeSet<>(setA);
    //Add all of B
    result.addAll(setB);
    //Make another set to find the intersection
    Set<Integer> intersection = new TreeSet<>(setA);
    //Keep all of the common elements
    intersection.retainAll(setB);
    //Remove the common elements to find the difference
    result.removeAll(intersection);
    return result;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    // INSERT CODE HERE.

    //Make an iterator
    Iterator<Integer> it = treeMap.keySet().iterator();
    //Iterate through the treeMap, use a while loop (?)
    while (it.hasNext()) {
      //Store key
      int key = it.next();
      //Check to see if it's even
      //If it is, remove it
      if (key % 2 == 0) {
        it.remove();
      }
    }
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    // INSERT CODE HERE

    return false;

  }

} // end treeProblems class
