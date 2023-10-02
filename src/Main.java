import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Matematik", "MAT101", "MAT");
        Course course2 = new Course("Fizik", "FZK101", "FZK");
        Course course3 = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        course1.addTeacher(t1);
        course2.addTeacher(t2);
        course3.addTeacher(t3);


        Student s1 = new Student("İnek Şaban", 4, "140144015", course1, course2,course3);
        s1.addBulkExamNote(50,20,40,100, 80,70);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", course1, course2, course3);
        s2.addBulkExamNote(100,50,40,20,80,90);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", course1, course2, course3);
        s3.addBulkExamNote(50,20,40,20,60,40);
        s3.isPass();
    }
}