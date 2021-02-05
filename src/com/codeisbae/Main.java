package com.codeisbae;

public class Main {

  public static void main(String[] args) {
    // printMegaBytesAndKiloBytes
    // printMegaBytesAndKiloBytes(-1024);

    // shouldWakeUp
    // System.out.println(shouldWakeUp(false, 2));

    // isLeapYear
     System.out.println(isLeapYear(-1600));

    // areEqualByThreeDecimalPlaces
    // System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));

    // hasEqualSum
    // System.out.println(hasEqualSum(1,1,2));

    // hasTeen
    // System.out.println(hasTeen(22, 23, 34));

    // area
    // System.out.println(area(5.0));

    // isCatPlaying
    // System.out.println(isCatPlaying(true, 10));

    // printDayOfWeek
    // printDayOfWeek(1);
  }

  private static final String INVALID = "Invalid value";

  // 5.2.21

  public static void printNumberInWord(int number) {
    switch (number) {
      case 0:
        System.out.println("ZERO");
        break;
      case 1:
        System.out.println("ONE");
        break;
      case 2:
        System.out.println("TWO");
        break;
      case 3:
        System.out.println("THREE");
        break;
      case 4:
        System.out.println("FOUR");
        break;
      case 5:
        System.out.println("FIVE");
        break;
      case 6:
        System.out.println("SIX");
        break;
      case 7:
        System.out.println("SEVEN");
        break;
      case 8:
        System.out.println("EIGHT");
        break;
      case 9:
        System.out.println("NINE");
        break;
      default:
        System.out.println("OTHER");
        break;
    }
  }

  public static void printDayOfWeek(int day) {
    String sunday = "Sunday";
    String monday = "Monday";
    String tuesday = "Tuesday";

    switch (day) {
      case 0:
        System.out.println(sunday);
        break;
      case 1:
        System.out.println(monday);
        break;
      default:
        System.out.println(INVALID);
    }
  }

  public static boolean isCatPlaying(boolean summer, int temperature) {
    if (!summer && (temperature >= 25 && temperature <= 35)) {
      return true;
    } else return summer && (temperature >= 25 && temperature <= 45);
  }

  public static double area(double radius) {
    if (radius < 1) {
      return -1;
    } else {
      return radius * radius * Math.PI;
    }
  }

  public static double area(double x, double y) {
    if (x < 1 || y < 1) {
      return -1;
    } else {
      return x * y;
    }
  }
  //

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
