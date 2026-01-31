class Animal{
    void sound()
    {
        System.out.println("Every animals make different sound");
    }
}
class Dog extends Animal
{
   
    void bark()
    {
        super.sound();
        System.out.println(" Dog bark like bow bow ");
    }
}
class class6
{
    public static  void main(String[]args)
    {
        Dog d = new Dog();

        d.bark();
    }
}
