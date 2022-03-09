import java.util.Scanner;

public class Section11Encapsulation{
    public static void main(String[] args) {
        Cat kucing = new Cat();
        Fish ikan = new Fish();
        Flower bunga = new Flower();
        Car mobil = new Car();
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan data yang ingin anda cari = (Contoh: kucing, ikan, bunga, mobl) ");
        String masukan = input.nextLine();
        input.close();
        if(masukan.equals("kucing")){
            kucing.SetFur("hitam");
            kucing.SetLeg(4);
            System.out.println(kucing.getshow_identity() + "Warna bulu:  " + kucing.fur_color + ", Dengan jumlah kaki: " + kucing.num_of_leg);
        }
        else if(masukan.equals("ikan")){
            ikan.SetType("paus");
            ikan.Setfeed("plankton");
            System.out.println(ikan.getshow_identity() + "Jenis: " + ikan.type + ", Makanan: " + ikan.feed);
        }
        else if(masukan.equals("bunga")){
            bunga.SetNama("bangkai");
            bunga.SetColor("merah");
            bunga.SetPetal(12);
            System.out.println(bunga.getshow_identity() + "Jenis: " + bunga.nama + ", Color: " + bunga.color + ", Num of petal: " + bunga.num_of_petal);
        }
        else if(masukan.equals("mobil")){
            mobil.SetType("sedan");
            mobil.SetColor("merah");
            mobil.SetTire(4);
            System.out.println(mobil.getshow_identity() + "Type: " + mobil.type + ", Color: " + mobil.color + ", Num of tire: " + mobil.num_of_tire);
        }
        else{
            System.out.println("Data yang anda cari tidak ada");
        }
    }
}

class Cat{
    private String show_identity;
    public String fur_color;
    public int num_of_leg;

    public Cat(){
        this.show_identity = "Saya kucing dengan detail, ";
        this.fur_color = "";
        this.num_of_leg = 0;

    }
    //Getter
    public String getshow_identity(){
        return this.show_identity;
    }
    //Setter
    public String SetFur(String value){
        return fur_color = value;
    }
    public int SetLeg(int value){
        return num_of_leg = value;
    }
}

class Fish{
    private String show_identity;
    public String type;
    public String feed;

    public Fish(){
        this.show_identity = "Saya ikan dengan detail, ";
        this.type = "";
        this.feed = "";
    }
    //Getter
    public String getshow_identity(){
        return this.show_identity;
    }
    //Setter
    public String SetType(String value){
        return type = value;
    }
    public String Setfeed(String value){
        return feed = value;
    }
}

class Flower{
    private String show_identity;
    public String nama;
    public String color;
    public int num_of_petal;

    public Flower(){
        this.show_identity = "Saya bunga dengan detail, ";
        this.nama = "";
        this.color = "";
        this.num_of_petal = 0;
    }
    //Getter
    public String getshow_identity(){
        return this.show_identity;
    }
    //Setter
    public String SetNama(String value){
        return nama = value;
    }
    public String SetColor(String value){
        return color = value;
    }
    public int SetPetal(int value){
        return num_of_petal = value;
    }
}

class Car{
    private String show_identity;
    public String type;
    public String color;
    public int num_of_tire;

    public Car(){
        this.show_identity = "Saya mobil dengan detail, ";
        this.type = "";
        this.color = "";
        this.num_of_tire = 0;
    }
    //Getter
    public String getshow_identity(){
        return this.show_identity;
    }
    //Setter
    public String SetType(String value){
        return type = value;
    }
    public String SetColor(String value){
        return color = value;
    }
    public int SetTire(int value){
        return num_of_tire = value;
    }
}