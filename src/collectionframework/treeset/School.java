package collectionframework.treeset;

import java.util.TreeSet;

public class School {

    public static void students (){
        TreeSet<Students> studentsList=new TreeSet<>();
        Students s1 =new Students("Akash",12,"Gadag");
        Students s2 =new Students("Roy",100,"Banglore");
        Students s3 =new Students("Suraj",8,"Hubli");
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);
        System.out.println(studentsList);

   }

    public static void main(String[] args) {
        School.students();

    }
}
