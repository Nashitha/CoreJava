package javaCollections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1 {
	public static void main(String[] args) {
		
	
   ArrayList<Integer> numbers = new ArrayList<>();
   numbers.add(12);
   numbers.add(45);
   numbers.add(7);
   numbers.add(89);
   numbers.add(23);
   int max = numbers.get(0);
   for (int i = 1; i < numbers.size(); i++) {
	   if(max < numbers.get(i)) {
		   max = numbers.get(i);
	   }
   }
   System.out.println("Max: " + max);
   
   for (int i = 0; i < numbers.size(); i++) {
	   if (numbers.get(i) % 2 == 0) {
		   System.out.println(numbers.get(i));
	   }
   }
   System.out.println("=====================================");
  ArrayList<Character> c = new ArrayList<>();
  c.add('a');
  c.add('b');
  c.add('c');
  c.add('d');
  for(int i = c.size() - 1; i >= 0; i--) {
	  System.out.println(c.get(i));
  }
  
  ArrayList<String> names = new ArrayList<>();
  names.add("Ravi");
  names.add("Anna");
  names.add("Ravi");
  names.add("John");
  names.add("Ravi");
  int count = 0;
  for (int i = 0; i < names.size(); i++) {
	  if (names.get(i).equals("Ravi")){
		  count++;
	  }
  }
  System.out.println("Count: " + count);
  
  ArrayList<Integer> squares = new ArrayList<>();
  squares.add(1);
  squares.add(2);
  squares.add(3);
  squares.add(4);
  for (int i = 0; i < squares.size(); i++) {
	  int value = squares.get(i);
	  squares.set(i, value * value);
  }
  System.out.println(squares);
  squares.add(2, 5);
  System.out.println(squares);
  squares.add(9);
  ArrayList<Integer> list = new ArrayList<>();
  list.addAll(squares);
  System.out.println(list);
  list.clear();
  System.out.println(list);
  
  System.out.println(squares.indexOf(3));
  System.out.println(squares.indexOf(9));
  System.out.println(squares.lastIndexOf(9));
  Collections.sort(squares);
  System.out.println(squares);
  Collections.reverse(squares);
  System.out.println(squares);
  
}
}
