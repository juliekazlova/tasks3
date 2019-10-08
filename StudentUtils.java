package by.epam.j_lab.unit3.avolzak;

public class StudentUtils {
    public String print(Student obj){
        StringBuilder sb=new StringBuilder();
        sb.append(obj.getSurname()).append(", group ").append(obj.getGroup()).append(".");
        return sb.toString();
    }

    public Student[] bestStudents(Student[] mas){
        int[] best=new int[mas.length];
        int bestCount=0;
        for(int i=0; i<mas.length; i++){
            int j=0;
            while(j<5&&(mas[i].getMarks()[j]==9|mas[i].getMarks()[j]==10))j++;
            if(j==5){
                best[bestCount]=i;
                bestCount++;
            }
        }

        Student[] answer=new Student[bestCount];
        for(int i=0; i<bestCount; i++){
            answer[i]=mas[best[i]];
        }
        return answer;
    }
}

