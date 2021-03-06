package com.codeisbae;

public class Main {

  public static void main(String[] args) {
    // printMegaBytesAndKiloBytes
    // printMegaBytesAndKiloBytes(-1024);

    // shouldWakeUp
    // System.out.println(shouldWakeUp(false, 2));

    // isLeapYear
     //System.out.println(isLeapYear(-1600));

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

    // for statement
    //for (int i = 8; i >= 2; i--) {
    //  System.out.println(String.format("%.2f", calculateInterest(10000.0, i)));
    //}

    // dynamic prime number check
    /*int prime = 0;
    for (int i = 3; i < 35; i++) {
      if (isPrime(i)) {
        prime++;
        System.out.println(i);
        if (prime == 3) break;
      }
    }*/

    // sum of 3 and 5 challenge
    // sumThreeAndFive();

    System.out.println(sumOdd(1,100));
    System.out.println(sumOdd(10,5));
  }

  private static final String INVALID = "Invalid value";
  private static final int NEGATIVE_ONE = -1;

  // 8.2.2021

  public static void whileAndDoWhile() {
    // while loop
    int count = 1;
    while (count != 6) {
      System.out.println("count: " + count);
      count++;
    }

    // do..while loop
    int counter = 1;
    do {
      System.out.println("counter: " + counter);
      counter++;
    } while(counter != 6);
  }

  public static boolean isOdd(int number) {
    if (number < 0) return false;

    return (number % 2 != 0);
  }

  public static int sumOdd(int start, int end) {
    int sum = 0;

    if (end < start || start < 0) {
      return -1;
    }

    for (int i = start; i <= end; i++) {
        if (isOdd(i)) {
          sum += i;
        }
    }
    return sum;
  }

  public static void sumThreeAndFive() {
    int sum = 0;
    int count = 0;
    for (int i = 1; i <= 1000; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        sum += i;
        count++;
        System.out.println("Can be divided by both 3 & 5 = " + i);
      }
      if (count == 5) {
        System.out.println("Total sum = " + sum);
        break;
      }
    }
  }

  public static boolean isPrime(int number) {
    if (number == 1) return false;

    for (int i = 2; i <= number/2; i++) {
      if (number % i == 0) return false;
    }
    return true;
  }

  public static double calculateInterest(double amount, double interestRate) {
    return amount * (interestRate / 100);
  }

  // 6.2.21
  public static int getDaysInMonth(int month, int year) {
    if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))) {
      return NEGATIVE_ONE;
    }
    if (isLeapYear(year) && month == 2) {
      return 29;
    }

    switch (month) {
      case 11:
      case 4:
      case 6:
      case 9:
        return 30;
      case 2:
        return 28;
      default:
        return 31;
    }
  }

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
