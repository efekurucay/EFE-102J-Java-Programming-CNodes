
/**
 * Main
 */
public class Main {

    
    //Encapsulation (Kapsülleme,Sarmalama)
    //Inheritance (Kalıtım)
    //Polymorphism (Çok Biçimlilik)
    //Abstraction (Soyutlama)

public static void main(String[] args) {
    Book b1 =new Book("Harry Potter", 400, "Rowling", "Kodlama Vakti");
    
    
/*çalıştı. ama kitabın sayfası -400 olamaz.??
o halde buradan erişememem gerekiyor. Akla ilk gelen private tanımlama da işime
yaramadı. Çünkü aşağıda bunu yazdırmam gerekiyor.
Constructor un içinde bunu sağlayabiliriz. If else ile.
fakat hala değiştirebiliyorum buradan.

private yaptım korudum. Buradan ulaşmak için farklı bir metod yazdım.
şuan değiştirmek istersem değiştiremiyorum. O halde değiştirmek için farklı bir 
metod daha yazalım.Getter Setterlar da encapsulation amaçlı yapılardır.
Sarmalama ilkesi, bir sınıfa ait değişkenlerin ancak o sınıfın içine
kodlanmış metodlar vasıtasıyla değiştirebilirliktir ve kullanabilinirliktir.
*/
b1.setNumberOfPage(522);

System.out.println(b1.getNumberOfPage());

}

    
}