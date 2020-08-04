package com.tarae.practice;

import java.sql.Date;
import java.util.Scanner;

public class App2 {

  static long currentMillis;
  static int i = 0;
  static final int PLENGTH = 100;
  static int count = 0;
  static Scanner sc = new Scanner(System.in);
  static Project[] projects = new Project[PLENGTH];


  public static void main(String[] args) {

    System.out.println("[프로젝트 등록]");
    addProject();

    System.out.println("[프로젝트 목록]");
    listProject();

  }

  static class Project {

    int no;
    String name;
    String content;
    Date startDate;
    Date endDate;
    String owner;
    String member;
  }


  static void addProject() {

    Project p = new Project();

    for (i = 0; i < PLENGTH; i++) {
      count++;
      System.out.print("번호? ");
      p.no = sc.nextInt();
      sc.nextLine();

      System.out.print("내용? ");
      p.content = sc.nextLine();

      System.out.print("시작일? ");
      p.startDate = new Date(currentMillis);

      System.out.print("종료일? ");
      p.endDate = new Date(currentMillis);

      System.out.print("만든이? ");
      p.owner = sc.nextLine();

      System.out.print("팀원? ");
      p.member = sc.nextLine();

      projects[i] = p;

      System.out.println();

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = sc.nextLine();

      if (!response.equalsIgnoreCase("y")) {
        break;
      }

      sc.close();
    }

  }

  static void listProject() {

    Project p = new Project();

    for (i = 0; i <count; i++) {
      System.out.printf("%d, %s, %s, %s, %s",
          p.no, p.content, p.startDate.toString(), p.endDate.toString(), p.owner);
    }

  }
}
