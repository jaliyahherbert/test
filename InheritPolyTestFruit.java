//Jaliyah Herbert CSCI-2302-002
/*
 *
You will use the fruit, apple, and GoldenDelicious objects/classes.

Input:  Hard coded in
Output:	to the screen

 */
import java.io.*;
import java.util.*;

public class InheritPolyTestFruit  {
  public static void main (String [] args) {
   //a.	Instantiate a Fruit object, with “fruit” for the name field/state value
      Fruit fruit = new Fruit("Fruit");
   //b.	Instantiate an Apple object, with “apple” for the name field/state value
      Apple apple = new Apple("Apple");
   //c.	Instantiate a GoldenDelicious object, with “Golden Delicious” for the name field/state value
      GoldenDelicious gd1 = new GoldenDelicious("Golden Delicious");
   //d.	Instantiate a Fruit object that refers to an Apple, with “apple” for the name field/state value
      Fruit fruitThatIsApple = new Apple("Apple");
   //e.	Instantiate an Apple  object that refers to a GoldenDelicious, with “Golden Delicious” for the name field/state value
      Apple appleThatIsGD = new GoldenDelicious("Golden Delicious");
   //f.	Instantiate an Object object
      Object obj = new Object();
   //g.	Define the printFruit method which prints the toString method
      
   //h.	Invoke the printFruit method using all the variables from a – f 
            printFruit(fruit);
            printFruit(apple);
            printFruit(gd1);
            printFruit(fruitThatIsApple);
            printFruit(appleThatIsGD);
            printFruit(obj);

  //i.	Define the printName method which prints the name field/state
   
  //j.	Invoke the printName method using all the variables from a – f 
            printName(fruit);
            printName(apple);
            printName(gd1);
            printName(fruitThatIsApple);
            printName(appleThatIsGD);
            printName(obj);
  }// end main
   public static void printFruit(Object s7){
               System.out.println(s7.toString());
          }//end 
   
   public static void printName(Object s7){
      if (s7 instanceof Fruit){
               System.out.println(((Fruit) s7).getName());
          }
      else{
            System.out.println("Not a fruit");
            }
     }
}// end InheritPolyTest
