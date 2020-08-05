package com.tarae.practice;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {

      System.out.println("명령>");
      String command = sc.nextLine();
      System.out.println(command);

      if (command.equalsIgnoreCase("quit") || command.equalsIgnoreCase("exit"));
      break;

    }

    sc.close();

    /*


    System.out.println("[회원]");

    final int MAX_LENGTH = 100;
    int[] no = new int[MAX_LENGTH];
    String[] name = new String[MAX_LENGTH];
    String[] email = new String[MAX_LENGTH];
    String[] password = new String[MAX_LENGTH];
    String[] photo = new String[MAX_LENGTH];
    String[] tel = new String[MAX_LENGTH];
    Date[] now = new Date[MAX_LENGTH];

    long currentMillis = 0;
    int count = 0;


    for (int i = 0; i < MAX_LENGTH; i++) {
      System.out.print("번호? ");
      no[i] = sc.nextInt();
      sc.nextLine();

      System.out.print("이름? ");
      name[i] = sc.nextLine();

      System.out.print("이메일? ");
      email[i] = sc.nextLine();

      System.out.print("암호? ");
      password[i] = sc.nextLine();

      System.out.print("사진? ");
      photo[i] = sc.nextLine();

      System.out.print("전화? ");
      tel[i] = sc.nextLine();

      currentMillis = System.currentTimeMillis();
      now[i] = new Date(currentMillis);
      System.out.println();

      count++;

      System.out.println();

      System.out.print("계속 입력하시겠습니까?(y/N) ");
      String response = sc.nextLine();

      if (!response.equalsIgnoreCase("y")) {
        break;
      }

    }

    sc.close();

    System.out.println("---------------------------");
    for (int i = 0; i < count; i++) {
      System.out.printf("%d, %s, %s, %s, %s\n",
          no[i], name[i], email[i], tel[i], now[i].toString());
    }

    */
  }
}




