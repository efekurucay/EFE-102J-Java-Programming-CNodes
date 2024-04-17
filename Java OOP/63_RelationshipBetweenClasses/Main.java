








public class Main {

    public static void main(String[] args) {
        //Sınıflar arası ilişkiler
        //-Bağımlılık (Dependency) "uses a"
        //-Birleştirme (Composition) "has a"
        //-Kalıtım(Inheritance) "is a"


        A a =new A();

        B b =new B();

        a.b=b;
        a.run(b);






    }




}
