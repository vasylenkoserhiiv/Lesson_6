package task_2;
/*
Створіть перечислювальний тип (enum) Vehicles, що містить конструктор, який повинен набувати цілого числа
(вартість автомобіля), містити метод getColor(), який повертає рядок з кольором автомобіля, і містити
перевантажений метод toString(), який повинен повертати рядок з назвою екземпляра, кольором та вартістю автомобіля.
 */

enum Vehicles{
    CAR1("Audi", 20000, "Black"),
    CAR2("Infinity", 30000, "White"),
    CAR3("Dodge", 25000, "Yellow");

    final String name;
    final int price;
    final String color;
    Vehicles(String name,int price, String color){
        this.price = price;
        this.name = name;
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    @Override
    public String toString(){
        return "Name: " + name + "; Price: " + price + "; Color: " + getColor() + ".";
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicles car1 = Vehicles.CAR1;
        Vehicles car2 = Vehicles.CAR2;
        Vehicles car3 = Vehicles.CAR3;

        System.out.println(car1 + "\n");
        System.out.println(car2 + "\n");
        System.out.println(car3);
    }
}
