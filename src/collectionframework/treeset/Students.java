package collectionframework.treeset;

import java.util.Objects;

public class Students implements Comparable<Students> {

    private String name;
    private int rollNo;
    private String place;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Students(String name, int rollNo, String place) {
        this.name = name;
        this.rollNo = rollNo;
        this.place = place;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return rollNo == students.rollNo && name.equals(students.name) && place.equals(students.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo, place);
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", place='" + place + '\'' +
                '}';
    }

    @Override
    public int compareTo(Students o) {
        if (this.rollNo > o.rollNo) {
            return 1;
        } else if (this.rollNo < o.rollNo) {
            return -1;
        } else {
            return 0;
        }
    }
}


