package com;

public class MainClass {

  public static void main(String[] args) {

    try {
      Args arg = new Args("l,p#,d*", args);

      System.out.print("passed argument boolean value is: ");
      System.out.println(arg.getBoolean('l'));

      System.out.print("passed argument string value is: ");
      System.out.println(arg.getString('d'));

      System.out.println("cardinality is: " + arg.cardinality());

      // int port = arg.getInt('p');
      // String directory = arg.getString('d');
      // executeApplication(logging, port, directory);
    } catch (Exception e) {
      System.out.printf("Argument error: %s\n", e.getMessage());
    }

  }

}

/*
 * note: arguments format is like
 * -l false -p 123 -d qwerty
 */