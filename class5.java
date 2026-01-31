class Animal{
     Animal() 
    {
        System.out.println("Every animals make different sound");
    }
}
class Dog extends Animal
{   
    Dog()
    {
      super();
    }
     void sound()
    {
         
        System.out.println(" Dog bark like bow bow ");
    }
}
class class5
{
    public static  void main(String[]args)
    {
        Dog d = new Dog();
        d.sound();
    }
}