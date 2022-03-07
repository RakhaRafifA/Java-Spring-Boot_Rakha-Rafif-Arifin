import java.util.Scanner;


class Vehicle{
    String name = "Gerobak";
    String with_engine = "'No Engine'";
}

class Bikes extends Vehicle{
    int wheel_count = 2;
}
class Cars extends Vehicle{
    int wheel_count = 4;
    String engine_type = "V8";
}
class Busses extends Vehicle{
    int wheel_count = 4;
    String private_bus = "[Public Bus]";
}

public class Section11InheritancePolymorphismVehice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vehicle v = new Vehicle();
        System.out.println("Hi I'm Parent of All Vehicles , My Name is " + v.name + ", My Engine Status is " + v.with_engine + "\n");

        Bikes b = new Bikes();
        b.name = "Pedal Bikes";
        System.out.println("Hi I'm Bike , My Name is " + b.name + ", My Engine Status is " + b.with_engine + ", I Have " + b.wheel_count + " Wheels");
        b.name = "Motor bikes";
        b.with_engine = "'With Engine'";
        System.out.println("Hi I'm Bike , My Name is " + b.name + ", My Engine Status is " + b.with_engine + ", I Have " + b.wheel_count + " Wheels\n");

        Cars c = new Cars();
        c.name = "Sport Cars";
        c.with_engine = "'With Engine'";
        System.out.println("Hi I'm Cars , My Name is " + c.name + ", My Engine Status is " + c.with_engine + ", I Have " + c.wheel_count + " Wheels" + ", My Engine Type = " + c.engine_type + "");
        c.name = "Pickup Cars";
        c.with_engine = "'With Engine'";
        c.engine_type = "solar";
        System.out.println("Hi I'm Cars , My Name is " + c.name + ", My Engine Status is " + c.with_engine + ", I Have " + c.wheel_count + " Wheels" + ", My Engine Type = " + c.engine_type + "\n");
        
        Busses bus = new Busses();
        bus.name = "Trans Jakarta";
        bus.with_engine = "'With Engine'";
        System.out.println("Hi I'm " + bus.private_bus + " , My Name is " + bus.name + ", My Engine Status is " + bus.with_engine + ", I Have " + bus.wheel_count + " Wheels");
        bus.name = "School Bus";
        bus.with_engine = "'With Engine'";
        bus.private_bus = "[Private Engine]";
        System.out.println("Hi I'm " + bus.private_bus + " , My Name is " + bus.name + ", My Engine Status is " + bus.with_engine + ", I Have " + bus.wheel_count + " Wheels");
        
        input.close();
    }
}
