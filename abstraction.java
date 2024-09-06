abstract class Animal
{
    public abstract void sound();

    public void sleep()
    {
        System.out.println("The Animal is sleeping");
    }
}

class Dog extends Animal
{
    public void sound()
    {
        System.out.println("The Dog is Barks");
    }
}

class Cat extends Animal
{
    public void sound()
    {
        System.out.println("The Cat is Meows");
    }
}

class Main
{
    public static void main(String[] args) 
    {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();
        myCat.sound();

        myDog.sleep();
        myCat.sleep();
    }
}