package by.epam.j_lab.unit3.avolzak;

public class Student {
    private String surname;
    private String initials;
    private int group;
    private int[] marks;

    public Student(String surname, String initials, int group, int[] marks) {
        this.surname = surname;
        this.initials = initials;
        setGroup(group);
        setMarks(marks);
    }

    public Student(){
        surname="NO_SURNAME";
        initials="NO_INITIALS";
        group=-1;
        marks=new int[5];
    }

    public String getSurname() {
        return surname;
    }

    public String getInitials() {
        return initials;
    }

    public int getGroup() {
        return group;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public void setGroup(int group) {
        if(group>0){
        this.group = group;
        }
        else {
            group=-1;
        }
    }

    public void setMarks(int[] marks) {
        if(marks.length!=5){
            this.marks=new int[5];
            return;
        }
        boolean correctMarks=true;
        for(int i=0; i<5; i++){
            if(marks[i]<0|marks[i]>10){
                correctMarks=false;
            }
        }
        if(correct marks){
        this.marks = marks;
        }
        else{this.marks=new int[5];
    }
}
