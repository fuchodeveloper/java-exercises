package com.codeisbae;

public class Main {

  public static void main(String[] args) {
    // printMegaBytesAndKiloBytes
    // printMegaBytesAndKiloBytes(-1024);

    // shouldWakeUp
    // System.out.println(shouldWakeUp(false, 2));

    // isLeapYear
    // System.out.println(isLeapYear(-1600));

    // areEqualByThreeDecimalPlaces
    // System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));

    // hasEqualSum
    // System.out.println(hasEqualSum(1,1,2));

    System.out.println(hasTeen(22, 23, 34));

  }

  public static boolean hasTeen(int first, int second, int third) {
    return isTeen(first) || isTeen(second) || isTeen(third);
  }

  public static boolean isTeen(int age) {
    int low = 13;
    int high = 19;
    return (age >= low && age <= high);
  }

  public static boolean hasEqualSum(int first, int second, int third) {
    return (first + second) == third;
  }

  public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
    int intFirst = (int) (first * 1000);
    int intSecond = (int) (second * 1000);
    return intFirst - intSecond == 0;
  }

  public static boolean isLeapYear(int year) {
    if (year >= 1 && year <= 9999) {
      if (year % 4 == 0) {
        if (year % 100 == 0) {
          return year % 400 == 0;
        } else {
          return true;
        }
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
    if (hourOfDay < 0 || hourOfDay > 23) {
      return false;
    } else return barking && (hourOfDay < 8 || hourOfDay > 22);
  }

  public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    if (kiloBytes < 0) {
      System.out.println("Invalid value");
    } else {
      int megabytes = kiloBytes / 1024;
      int remainderKb = kiloBytes % 1024;

      System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainderKb + " KB");
    }
  }
}
