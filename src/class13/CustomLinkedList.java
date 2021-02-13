package class13;

import sun.lwawt.macosx.CSystemTray;

import java.util.LinkedList;

public class CustomLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList();
        for(int i=0;i<10;i++) {
            linkedList.add(i+1);
        }
        for(Integer a : linkedList) {
            System.out.println(a);
        }
        System.out.println("################################ functions #############");
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.remove());
        System.out.println(linkedList.remove(3));
        linkedList.addFirst(22);
        System.out.println("############ reprint #########################");
        for(Integer a : linkedList) {
            System.out.println(a);
        }
    }
}

//ArrayList
//LinkedList
//Stack