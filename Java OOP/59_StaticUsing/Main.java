public class Main {
    

    public static void main(String[] args) {
        
        Student s1= new Student("Ali", 220,90);
        Student s2=new Student("Ayşe",330,100);
        Student s3=new Student("Mehmet", 200,80);


        
        System.out.println(Student.howStudent());
        
        int [] notlar = new int[3];

        notlar[0]=s1.point;
        notlar[1]=s2.point;
        notlar[2]=s3.point;

        System.out.println(Student.calcOverall(notlar));
    }
}
