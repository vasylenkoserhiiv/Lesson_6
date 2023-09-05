package task_1;
/*
творіть перерахунковий тип (enum) Animals, що містить конструктор, який повинен набувати цілого числа (вік тварини),
і містити перевантажений метод toString(), який повинен повертати назву екземпляра та вік тварини.
 */
enum Animals{
    DOG(11, "Dog"),
    CAT(2, "Cat"),
    MOUSE(1, "Mouse"),
    RABBIT(3, "Rabbit");

    final int age;
    final String name;
    Animals(int age, String name){
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return name + " (Age: " + age + ")";
    }
}
public class Main {
    public static void main(String[] args) {
        Animals myDog = Animals.DOG;
        Animals myCat = Animals.CAT;
        Animals myMouse = Animals.MOUSE;
        Animals myRabbit = Animals.RABBIT;

        System.out.println(myDog);
        System.out.println(myCat);
        System.out.println(myMouse);
        System.out.println(myRabbit);
    }
}
