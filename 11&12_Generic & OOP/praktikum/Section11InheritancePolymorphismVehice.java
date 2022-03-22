/* import java.util.Scanner;


class Vehicle{
    String name = "Gerobak";
    String with_engine = "'No Engine'";
    public void identify_myself(){
        System.out.println("Hi I'm Parent of All Vehicles , My Name is " + name + ", My Engine Status is " + with_engine + "\n");
    }
}

class Bikes extends Vehicle{
    int wheel_count = 2;
    public void identify_myself(){
        System.out.println("Hi I'm Bike , My Name is " + name + ", My Engine Status is " + with_engine + ", I Have " + wheel_count + " Wheels");
    }
}
class Cars extends Vehicle{
    int wheel_count = 4;
    String engine_type;
    public void identify_myself(){
        System.out.println("Hi I'm Cars , My Name is " + name + ", My Engine Status is " + with_engine + ", I Have " + wheel_count + " Wheels" + ", My Engine Type = " + engine_type + "");
    }
}
class Busses extends Vehicle{
    int wheel_count = 4;
    String private_bus;
    public void identify_myself(){
        System.out.println("Hi I'm " + private_bus + " , My Name is " + name + ", My Engine Status is " + with_engine + ", I Have " + wheel_count + " Wheels");
    }
}

public class Section11InheritancePolymorphismVehice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vehicle v = new Vehicle();
        v.identify_myself();

        Bikes b = new Bikes();
        b.name = "Pedal Bikes";
        b.identify_myself();
        b.name = "Motor bikes";
        b.with_engine = "'With Engine'";
        b.identify_myself();
        System.out.println();

        Cars c = new Cars();
        c.name = "Sport Cars";
        c.with_engine = "'With Engine'";
        c.engine_type = "V 8";
        c.identify_myself();
        c.name = "Pickup Cars";
        c.with_engine = "'With Engine'";
        c.engine_type = "solar";
        c.identify_myself();
        System.out.println();
        
        Busses bus = new Busses();
        bus.name = "Trans Jakarta";
        bus.with_engine = "'With Engine'";
        bus.private_bus = "[Public Bus]";
        bus.identify_myself();
        bus.name = "School Bus";
        bus.with_engine = "'With Engine'";
        bus.private_bus = "[Private Engine]";
        bus.identify_myself();
        
        input.close();
    }
}
*/