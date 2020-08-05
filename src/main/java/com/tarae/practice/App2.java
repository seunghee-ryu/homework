package com.tarae.practice;

import java.sql.Date;
import java.util.Scanner;


public class App2 {

  public static void main(String[] args) {
    System.out.println("[프로젝트]");

    Scanner sc = new Scanner(System.in);

    final int LENGTH = 100;

    int[] no = new int[LENGTH];
    String[] title = new String[LENGTH];
    String[] content = new String[LENGTH];
    Date[] startDate = new Date[LENGTH];
    Date[] endDate = new Date[LENGTH];
    String[] owner = new String[LENGTH];
    String[] member = new String[LENGTH];

    int count = 0;

    for (int i = 0; i < LENGTH; i++) {

      System.out.print("번호? ");
      no[i] = Integer.valueOf(sc.nextLine());

      System.out.print("프로젝트명? ");
      title[i] = sc.nextLine();

      System.out.print("시작일? ");
      startDate[i] = Date.valueOf(sc.nextLine());

      System.out.print("종료일? ");
      endDate[i] = Date.valueOf(sc.nextLine());

      System.out.print("만든이? ");
      owner[i] = sc.nextLine();

      System.out.print("멤버? ");
      member[i] = sc.nextLine();

      count++;
      System.out.println();

      System.out.println("계속 입력하시겠습니까?(y/N) ");
      String response = sc.nextLine();
      if (!response.equalsIgnoreCase("y")) {
        break;
      }
    }
    sc.close();

    System.out.println("---------------------------");

    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          no[i], title[i], startDate[i], endDate[i], owner[i]);
    }
  }
}


