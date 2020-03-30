/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
    private int backLogCount;
    private String studentName;

    public Student(int backLogCount, String studentName) {
        this.backLogCount = backLogCount;
        this.studentName = studentName;
    }
    public int getBackLogCount() {
        return backLogCount;
    }

    public void setBackLogCount(int backLogCount) {
        this.backLogCount = backLogCount;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
