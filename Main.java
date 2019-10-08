import by.epam.j_lab.unit3.avolzak.Student;
import by.epam.j_lab.unit3.avolzak.StudentUtils;

public class Main {

    public static void main(String[] args){
        //task 1
        Student[] test1=new Student[10];
        for(int i=0; i<10; i++){
            String sur="Student"+i;
            int[]marks=new int[]{9, 10, 9, i, i};
            test1[i]=new Student(sur, "initials", i%5, marks);
        }
        StudentUtils test1SU=new StudentUtils();
        Student[] result=test1SU.bestStudents(test1);
        for(int i=0; i<result.length; i++){
            System.out.println(test1SU.print(result[i]));
        }
    }
}
