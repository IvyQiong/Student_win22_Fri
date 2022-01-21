/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author ivy20
 */
public class StudentList {
    public static void main(String[] args){
        Student_1[] studentList = new Student_1[3];
        studentList[0] = new Student_1("s1", "Ronak Sheth");
        studentList[1] = new Student_1("s2", "John Deo");
        studentList[2] = new Student_1("s3", "Rabh");
        for(int i =0 ; i < studentList.length; i++){
         System.out.println(studentList[i].getStudentName());
     }
    }
}
