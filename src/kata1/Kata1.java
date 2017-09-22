package kata1;

import java.util.Date;


public class Kata1 {

    public static void main(String[] args) {
        Person miperson=new Person("Juanma ", new Date(96,10,22));
        System.out.println(miperson.getName() + "tiene "+ miperson.getAge());
    }
    
}
