package ru.skypro;

public class Main {

    public static void main(String[] args) {
	String example = "I love Java";
    String str [] = example.split("\\s");
      for (int i =0; i< str.length; i++) {
          System.out.println( str[i]);
      }
    }
}
