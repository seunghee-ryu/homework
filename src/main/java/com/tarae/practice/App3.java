package com.tarae.practice;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

  public static void main(String[] args) {
    System.out.println("[작업]");

    Scanner sc = new Scanner(System.in);

    final int LENGTH = 100;

    int[] no = new int[LENGTH];
    String[] content = new String[LENGTH];
    Date[] deadLine = new Date[LENGTH];
    int[] status = new int[LENGTH];
    String[] owner = new String[LENGTH];

    int count = 0;


    for (int i = 0; i <LENGTH; i++) {
      System.out.print("프로젝트? ");
      String project = sc.nextLine();

      System.out.print("번호? ");
      no[i] = sc.nextInt();
      sc.nextLine();

      System.out.print("내용? ");
      content[i] = sc.nextLine();

      System.out.print("완료일? ");
      deadLine[i] = Date.valueOf(sc.nextLine());

      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.print(">");
      status[i] = Integer.valueOf(sc.nextInt());
      sc.nextLine();

      System.out.print("담당자? ");
      owner[i] = sc.nextLine();

      count++;
      System.out.println();

      System.out.print("계속 진행하시겠습니까?(y/N) ");
      String respons = sc.nextLine();
      if (!respons.equalsIgnoreCase("y")) {
        break;
      }
    }
    sc.close();

    System.out.println("--------------------");
    for (int i = 0; i <count; i++) {
      String statusLabel;
      switch (status[i]) {
        case 1:
          statusLabel = "진행중";
          break;
        case 2:
          statusLabel = "완료";
          break;
          default:
            statusLabel = "신규";
      }


    System.out.printf("%d, %s, %s, %s, %s\n",
        no[i], content[i], deadLine[i], statusLabel, owner[i]);

    }

  }
}
