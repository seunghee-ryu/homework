package com.tarae.practice;

import java.sql.Date;
import java.util.Scanner;

public class App3 {

  static Scanner sc = new Scanner(System.in);
  static long currentMillis;
  static int i = 0;
  static int count = 0;
  static final int TLENGTH = 100;
  static Task[] tasks = new Task[TLENGTH];
  static String stateTitle;

  public static void main(String[] args) {

    System.out.println("[작업 등록]");
    addTask();
    System.out.println("[작업 목록]");
    listTask();
  }

  static class Task {

    int no;
    String content;
    Date completedDate;
    String state;
    String worker;

  }

  static void addTask() {

    System.out.printf("프로젝트: %s\n", "미니 프로젝트 관리 시스템 개발");

    for (int i = 0; i < TLENGTH; i++) {

      Task t = new Task();

      System.out.print("번호? ");
      t.no = sc.nextInt();
      sc.nextLine();

      System.out.print("내용? ");
      t.content = sc.nextLine();

      System.out.print("완료일? ");
      t.completedDate = new Date(currentMillis);

      System.out.println("상태? ");
      System.out.println("0: 신규");
      System.out.println("1: 진행중");
      System.out.println("2: 완료");
      System.out.println("> ");
      t.state = sc.nextLine();

      System.out.print("담당자? ");
      t.worker = sc.nextLine();

      tasks[i] = t;

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = sc.nextLine();

      if (!response.equalsIgnoreCase("y"))
        break;

      }
    sc.close();


    for (int i = 0; i < count; i++) {
      Task t = tasks[i];
      String stateTitle;
      switch (t.state) {
        case "0":
          stateTitle = "신규";
          break;
        case "1":
          stateTitle = "진행중";
          break;
          default:
            stateTitle = "완료";
      }
    }
  }

  static void listTask() {

    Task t = new Task();

    System.out.printf("%d, %s, %s, %s, %s\n",
        t.no, t.content, t.completedDate.toString(), stateTitle, t.worker);

  }
}
