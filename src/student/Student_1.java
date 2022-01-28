/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author ivy20
 */
public class Student_1 {
    private String studentId;
    private String studentName;

    public Student_1(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return "Student_1{" + "studentId=" + studentId + ", studentName=" + studentName + '}';
    }
    
    
}
