package com.eomcs.util;

// 1) LinkedList 클래스 정의
// 2) 값을 담을 노드 클래스를 설계한다.
// 3) 첫 번째 노드와 마지막 노드의 주소를 담을 필드를 추가한다.
//    목록 크기를 저장할 필드를 추가한다.
public class MyLinkedList03 {

  // 값을 찾을 때는 첫 번째 노드부터 따라간다.
  Node first;

  // 값을 추가할 때는 마지막 노드에 연결한다.
  Node last;

  // 목록 크기를 보관한다.
  int size;

  // 용도?
  // - Node 클래스는 목록에서 각 항목의 값을 보관하는 객체로 역할을 수행한다.
  // 스태틱 클래스?
  // - 여러 개의 MyLinkedList 객체가 공유하는 클래스이므로
  //   스태틱으로 Node 클래스를 설계한다.
  static class Node {
    Object value;
    Node next;
  }
}