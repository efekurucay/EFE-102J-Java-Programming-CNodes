public class Book {
    


    private String name,author,publisher;
    private int numberOfPage;

    Book(String name,int numberOfPage,String author,String publisher){
        this.name=name;
       
        this.author=author;
        this.publisher=publisher;
        if(numberOfPage<1){ this.numberOfPage=10;}
        else { this.numberOfPage=numberOfPage;}

    }

    // public void pageSize(){

    //     System.out.println(numberOfPage);
    // }

    public int getNumberOfPage() {
        return this.numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {

        if(numberOfPage<1){System.out.println("Negatif Olamaz");}
        else{this.numberOfPage = numberOfPage;}
        
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


}
