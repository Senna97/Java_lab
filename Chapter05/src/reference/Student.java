package reference;

public class Student {
    int studentID;
    String studentName;

    Subject kor;
    Subject math;
    Subject eng;

    public Student() {
        kor = new Subject();
        math = new Subject();
    }

    public Student(int id, String name) {
        studentID = id;
        studentName = name;
        kor = new Subject();
        math = new Subject();
    }

    public void setKor(String name, int score) {
        kor.setSubjectName(name);
        kor.setScore(score);
    }

    public void setMath(String name, int score) {
        math.setSubjectName(name);
        math.setScore(score);
    }

    public void showStudentInfo() {
        int total = kor.getScore() + math.getScore();
        System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
    }
}
