import java.util.Scanner;

class person{
    public String name, born_date;

    public person(String name, String born_date){
        this.name=name;
        this.born_date=born_date;
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void display (){
        System.out.printf("Name: %s\nBorn date: %s\nThis is a 'person' class\n",name,born_date);
    }

} 

class mahasiswa extends person{
    public String student_id;
    public int point;

    public mahasiswa(String name,String born_date,String student_id, int point){
        super(name,born_date);
        this.student_id = student_id;
        this.point=point;
    }

    public void helpingDosen(){
        point+=10;
    }

    public void display (){
        System.out.printf("Name: %s\nBorn date: %s\nStudent ID: %s\nPoints: %d\nThis is a 'mahasiswa' class\n",name,born_date,student_id,point);
    }

}

class dosen extends person{
    String code_dosen;
    int point;

    public dosen(String name,String born_date, String code_dosen, int point){
        super(name,born_date);
        this.code_dosen=code_dosen;
        this.point=point;
    }

    public void selfDev(){
        point+=10;
    }

    public void teach(){
        point+=10;
    }

    public void p2m(){
        point+=10;
    }

    public void research(){
        point+=10;
    }

    public void otherWorks(){
        point+=10;
    }

    public void display (){
        System.out.printf("Name: %s\nBorn date: %s\nCode dosen: %s\nPoints: %d\nThis is a 'dosen' class\n",name,born_date,code_dosen,point);
    }
}


public class Inheritance {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Person");
        System.out.println("2.Mahasiswa");
        System.out.println("3.Dosen");
        System.out.print("> ");
        int choice = input.nextInt();
        if(choice==1){
            person manusia = new person("Adam", "?");
            manusia.display();
            manusia.sleep();
        }else if(choice==2){
            mahasiswa student = new mahasiswa("Juan Arnold", "15/6/2003", "2540110760", 0);
            student.helpingDosen();
            student.display();
        }else if(choice==3){
            dosen lecturer = new dosen("Mr. John", "1/1/1975", "US89", 0);
            lecturer.selfDev();
            lecturer.teach();
            lecturer.p2m();
            lecturer.research();
            lecturer.otherWorks();
            lecturer.display();
        }else{
            System.out.println("Error, no such option");
        }
        input.close();
    }
}
