package com.tarae.practice;

import java.util.Scanner;

public class Exam012301 {
  public static void main(String[] args) {

    /*

    // if 문

    int num1 = 10;
    int num2 = 2;
    char operator = '+';

    int result = 0;

    if (operator == '+') {
      result = num1 + num2;
    } else if (operator == '-') {
      result = num1 - num2;
    } else if (operator == '*') {
      result = num1 * num2;
    } else if (operator == '/' ) {
      result = num1 / num2;
    } else {
      System.out.println("연산자 오류입니다.");
    }
    System.out.println("결과값은" + result + "입니다");




    // switch 문

    int num1 = 10;
    int num2 = 2;
    char operator = '*';

    int result = 0;

    switch (operator) {
      case '+':
        result = num1 + num2;
        break;
      case '-':
        result = num1 - num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/':
        result = num1 / num2;
        break;
        default:
          System.out.println("연산자 오류입니다.");
    }
        System.out.println("결과값은" + result + "입니다.");

        */

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    char result = 0;
    sc.close();

    switch (a / 10) {
        case 9: case 10:
            result = 'A';
            break;
        case 8:
            result = 'B';
            break;
        case 7:
            result = 'C';
            break;
        case 6:
            result = 'D';
            break;
        default:
            result = 'F';
    }

  }

}
