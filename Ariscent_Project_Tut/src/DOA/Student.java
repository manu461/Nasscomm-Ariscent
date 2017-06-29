package DOA;

import java.io.Serializable;

/**
 * Created by staLker on 23-06-2017.
 */
public class Student implements Serializable {
    String name;
    long rollNo;
    String address;
    String course;

    public Student() {
    }

    public Student(String name, long rollNo, String address, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRollNo() {
        return rollNo;
    }

    public void setRollNo(long rollNo) {
        this.rollNo = rollNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
