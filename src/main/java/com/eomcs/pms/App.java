package com.eomcs.pms;

import java.sql.Date;
import java.util.Scanner;

public class App {

  static Scanner keyboardScan = new Scanner(System.in);

  // 회원 데이터
  static class Member {
    int no;
    String name;
    String email;
    String password;
    String photo;
    String tel;
    Date registeredDate;
  }
  static final int LENGTH = 100;
  static Member[] members = new Member[LENGTH];
  static int size = 0;


  // 프로젝트 데이터
  static class Project {
    int pno;
    String ptitle;
    String pcontent;
    Date pstartDate;
    Date pendDate;
    String powner;
    String pmembers;
  }
  static final int PLENGTH = 100;
  static Project[] projects = new Project[PLENGTH];
  static int psize = 0;

  // 작업 데이터
  static class Task {
    int tno;
    String tcontent;
    Date tdeadline;
    String towner;
    int tstatus;

  }
  static final int TLENGTH = 100;
  static Task[] tasks = new Task[TLENGTH];
  static int tsize = 0;

  public static void main(String[] args) {



    loop:
      while (true) {
        String command = promptString("명령> ");

        switch (command) {
          case "/member/add":
            addmember();
            break;

          case "/member/list":
            listmember();
            break;

          case "/project/add":
            addproject();
            break;

          case "/project/list":
            listproject();
            break;

          case "/task/add":
            addtask();
            break;

          case "/task/list":
            listtask();
            break;

          case "quit":
          case "exit":
            System.out.println("안녕!");
            break loop;

          default:
            System.out.println("실행할 수 없는 명령입니다.");
        }
        System.out.println(); // 이전 명령의 실행을 구분하기 위해 빈 줄 출력
      }

    keyboardScan.close();
  }

  static void addmember() {

    System.out.println("[회원 등록]");

    Member m = new Member();

    System.out.print("번호? ");
    m.no = Integer.parseInt(keyboardScan.nextLine());

    System.out.print("이름? ");
    m.name = keyboardScan.nextLine();

    System.out.print("이메일? ");
    m.email = keyboardScan.nextLine();

    System.out.print("암호? ");
    m.password = keyboardScan.nextLine();

    System.out.print("사진? ");
    m.photo = keyboardScan.nextLine();

    System.out.print("전화? ");
    m.tel = keyboardScan.nextLine();

    m.registeredDate = new java.sql.Date(System.currentTimeMillis());

    members[size++] = m;

  }

  static void listmember() {

    System.out.println("[회원 목록]");
    for (int i = 0; i < size; i++) {
      Member m = members[i];
      System.out.printf("%d, %s, %s, %s, %s\n",
          m.no[i], m.name[i], m.email[i], m.tel[i], m.registeredDate[i]);
    }

  }

  static void addproject() {

    Project[] p = new Project[PLENGTH];

    System.out.println("[프로젝트 등록]");

    System.out.print("번호? ");
    p.pno[psize] = Integer.valueOf(keyboardScan.nextLine());

    System.out.print("프로젝트명? ");
    ptitle[psize] = keyboardScan.nextLine();

    System.out.print("내용? ");
    pcontent[psize] = keyboardScan.nextLine();

    System.out.print("시작일? ");
    pstartDate[psize] = Date.valueOf(keyboardScan.nextLine());

    System.out.print("종료일? ");
    pendDate[psize] = Date.valueOf(keyboardScan.nextLine());

    System.out.print("만든이? ");
    powner[psize] = keyboardScan.nextLine();

    System.out.print("팀원? ");
    pmembers[psize] = keyboardScan.nextLine();

    psize++;

  }

  static void listproject() {

    System.out.println("[프로젝트 목록]");

    for (int i = 0; i < psize; i++) {
      Project p = projects[i];
      // 번호, 프로젝트명, 시작일, 종료일, 만든이
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          pno[i], ptitle[i], pstartDate[i], pendDate[i], powner[i]);
    }

  }

  static void addtask() {

    System.out.println("[작업 등록]");

    System.out.print("번호? ");
    tno[tsize] = Integer.parseInt(keyboardScan.nextLine());

    System.out.print("내용? ");
    tcontent[tsize] = keyboardScan.nextLine();

    System.out.print("마감일? ");
    tdeadline[tsize] = Date.valueOf(keyboardScan.nextLine());

    System.out.println("상태?");
    System.out.println("0: 신규");
    System.out.println("1: 진행중");
    System.out.println("2: 완료");
    System.out.print("> ");
    tstatus[tsize] = Integer.valueOf(keyboardScan.nextLine());

    System.out.print("담당자? ");
    towner[tsize] = keyboardScan.nextLine();

    tsize++;

  }

  static void listtask() {
    Task t = tasks[i];

    System.out.println("[작업 목록]");

    for (int i = 0; i < tsize; i++) {
      String stateLabel = null;
      switch (t.tstatus[i]) {
        case 1:
          stateLabel = "진행중";
          break;
        case 2:
          stateLabel = "완료";
          break;
        default:
          stateLabel = "신규";
      }
      // 번호, 작업명, 마감일, 프로젝트, 상태, 담당자
      System.out.printf("%d, %s, %s, %s, %s\n", // 출력 형식 지정
          tno[i], tcontent[i], tdeadline[i], stateLabel, towner[i]);
    }

  }

  static String promptString(String title) {
    System.out.print(title);
    return keyboardScan.nextLine();
  }

  static int promptInt(String title) {
    return Integer.parseInt(promptString(title));
  }

  static Date promptDate(String title) {
    return Date.valueOf(promptString(title));

  }
}
