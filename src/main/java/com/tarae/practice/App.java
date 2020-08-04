package com.tarae.practice;

import java.sql.Date;
import java.util.Scanner;

public class App {

  static long currentMillis;
  static Scanner sc = new Scanner(System.in);
  static int count = 0;
  static final int LENGTH = 100;
  static int i = 0;
  static Member[] members = new Member[LENGTH];


  public static void main(String[] args) {

    class Member {
      int no;
      String name;
      String email;
      String password;
      String photo;
      String tel;
      Date regiDate;
    }

    System.out.println("[회원 등록]");
    addMembers();
    System.out.println("[회원 목록]");
    listMembers();


  }


  static void addMembers() {

    System.out.println("[회원]");

    for (i = 0; i < LENGTH; i++) {
      count++;

    Member m = new Member();


    System.out.print("번호? ");
    m.no = sc.nextInt();
    sc.nextLine();

    System.out.print("이름?");
    m.name = sc.nextLine();

    System.out.print("이메일? ");
    m.email = sc.nextLine();

    System.out.print("패스워드? ");
    m.password = sc.nextLine();

    System.out.print("사진? ");
    m.photo = sc.nextLine();

    System.out.print("전화? ");
    m.tel = sc.nextLine();

    System.out.println("등록일? ");
    m.regiDate = new Date(currentMillis);


    System.out.print("계속 입력하시겠습니까?(y/N) ");
    String response = sc.nextLine();

    if (!response.equalsIgnoreCase("y")) {
      break;
    }

    members[i] = m;
    sc.close();
  }

}

  static void listMembers() {
    for (int i = 0; i < count; i++) {
      Member m = members[i];
      System.out.printf("%d, %s, %s, %s, %s\n",
          m.no, m.name, m.email, m.tel, m.regiDate.toString());
    }
  }
}
