import java.util.Scanner;
     class Person {
        String name;
        int age;
        
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
}
public class Reference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person1 =new Person("Urvas",21);
        Person person2 =new Person("Vishal",22);

        System.out.println("person1:Name:"+person1.name+"Age:"+person1.age);
        System.out.println("person2:Name:"+person2.name+"Age:"+person2.age);
    
}
}
