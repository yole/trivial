package com.jetbrains;

/**
 * @author yole
 */
public class Main {
  public static void main(String[] args) {
    for (String c : args) {
      System.out.println(c);
      continue;
    }
  }
}
