package com.epam.mjc;


import java.util.Arrays;

public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) throws StudentNotFoundException{
    if(Arrays.asList(IDs).contains(studentID)){
      return Student.getValueOf(studentID);
    }
    else{
      throw new StudentNotFoundException("Could not find student with ID "+ Long.toString(studentID));
    }


  }

  public static void main(String[] args) {
    StudentManager manager = new StudentManager();

    for (int i = 0; i < IDs.length; i++) {
      try {
        Student student = manager.find(IDs[i]);
        System.out.println("Student name " + student.getName());
      }
      catch (StudentNotFoundException ex){
        System.out.println(ex);
      }
    }

  }
}