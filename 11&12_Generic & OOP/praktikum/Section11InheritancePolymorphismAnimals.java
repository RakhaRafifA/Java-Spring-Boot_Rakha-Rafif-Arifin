/* class Animals{
    String nama = "Binatang";
    String makanan;
    String gigi;
    public void identify_myself(){
        System.out.println("Hi I'm Parent of All Animals, My name is " + nama + "" + makanan + "" + gigi);
    }
}
class Herbivore extends Animals{
    String makanan = "Tumbuhan";
    String gigi = "Tumpul";
    public void identify_myself(){
        System.out.println("Hi I'm Herbivore, My name is " + nama + ", My Food is " + makanan + ", I Have " + gigi + " Teeth");
    }
}
class Carnivore extends Animals{
    String makanan = "Daging";
    String gigi = "Tajam";
    public void identify_myself(){
        System.out.println("Hi I'm Carnivore, My name is " + nama + ", My Food is " + makanan + ", I Have " + gigi + " Teeth");
    }
}
class Omnivore extends Animals{
    String makanan = "Semua";
    String gigi = "Tajam dan Tumpul";
    public void identify_myself(){
        System.out.println("Hi I'm Omnivore, My name is " + nama + ", My Food is " + makanan + ", I Don't Have " + gigi + " Teeth");
    }
}

public class Section11InheritancePolymorphismAnimals {
    public static void main(String[] args) {
        Animals anim = new Animals();
        anim.identify_myself();
        System.out.println();

        Herbivore hb = new Herbivore();
        hb.nama = "Kambing";
        hb.identify_myself();
        hb.nama = "Kuda";
        hb.identify_myself();
        System.out.println();

        Carnivore cn = new Carnivore();
        cn.nama = "Harimau";
        cn.identify_myself();
        cn.nama = "Singa";
        cn.identify_myself();
        System.out.println();

        Omnivore om = new Omnivore();
        om.nama = "Ayam";
        om.identify_myself();
        om.nama = "Bebek";
        om.identify_myself();
    }
}
*/