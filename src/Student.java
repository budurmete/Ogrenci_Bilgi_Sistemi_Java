//import java.security.PublicKey;

public class Student {
    String name,stuNo;
    int classes;
    Course course1;
    Course course2;
    Course course3;
    double avarge;
    boolean issPass;

   Student (String name ,int classes ,String stuNo, Course course1,Course course2,Course course3) {

       this.name=name;
       this.classes=classes;
       this.stuNo=stuNo;
       this.course1=course1;
       this.course2=course2;
       this.course3=course3;
       this.avarge=0.0;
       this.issPass=false;
   }

    public void addBulkExamNote(int course1, int course2, int course3, int verbalnote1, int verbalnote2 , int verbalnote3) {

        if (course1 >= 0 && course1 <= 100) {
            this.course1.note = course1;
            this.course1.verbalnote=verbalnote1;
        }

        if (course2 >= 0 && course2 <= 100) {
            this.course2.note = course2;
            this.course2.verbalnote = verbalnote2;
        }

        if (course3 >= 0 && course3 <= 100) {
            this.course3.note = course3;
            this.course3.verbalnote = verbalnote3;
        }
    }

    void isPass() {
       this.avarge=((this.course1.note+this.course2.note+this.course3.note)/3.0)*0.80+ ((this.course1.verbalnote+this.course2.verbalnote+this.course3.verbalnote)/3)*0.20;
       if(this.avarge>55) {System.out.println("======================");System.out.println("Sınıfı Başarıyla Geçtiniz");}
       else   {System.out.println("======================");System.out.println("Sınıfı Geçemediniz,Sınıfta kaldınız.");}

       printNote();
    }

    void printNote()
    {
        System.out.println(this.course1.name+" Notu:"+this.course1.note);
        System.out.println(this.course1.name+" Sözlü Notu:"+this.course1.verbalnote);

        System.out.println(this.course2.name+" Notu:"+this.course2.note);
        System.out.println(this.course2.name+" Sözlü Notu:"+this.course2.verbalnote);

        System.out.println(this.course3.name+" Notu:"+this.course3.note);
        System.out.println(this.course3.name+" Sözlü Notu:"+this.course3.verbalnote);

        System.out.println("Ortalamanız: "+this.avarge);
    }
}
