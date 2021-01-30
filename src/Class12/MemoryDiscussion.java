package Class12;

import java.lang.reflect.Constructor;

class Student{

    int rollNo;
    String name;
    String favSubject;
    int[] marks;

    // when student will be created i want to keep his name and roll number
    //constructor
    public Student(String studentName,int studentRollNo){
        this.rollNo = studentRollNo;
        this.name = studentName;
    }

    public void setFavSubject(String favSubject){
        this.favSubject = favSubject;
    }

    public void setMarks(int[] arr){
        this.marks = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            this.marks[i] = arr[i];
        }

    }

}




public class MemoryDiscussion {

    public static void main(String[] args) {
        Student bittoo = new Student("Bittoo",1);
        bittoo.setFavSubject("Maths");
        int[] arr = new int[3];
            arr[0] = 0;
            arr[1] = 1;
            arr[2] = 2;

            bittoo.setMarks(arr);
        for (int i = 0;i<arr.length;i++){
            System.out.println(bittoo.marks[i]+ " ");
        }

        arr[2] = 100;

        for (int i = 0;i<arr.length;i++){
            System.out.println(bittoo.marks[i]+ " ");
        }



    }

}

// homework
/*
make a class car
car will have its property
make constructor to initialise it
make function to set few properties
*/