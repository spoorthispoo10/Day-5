class Animal{
    void Sound(){
        System.out.println("my frnd ______?");
    }
}
class mammals extends Animal{
    void Bark(){
        System.out.println("_______ frnd mine!!!!");
}

    }
 class human extends mammals{
    void feature(){
        System.out.println("i am _______ frnd!!!!");
    }
}
   
    class class2{
        public static void main(String[]args){
            human dg=new human();
            dg.Sound();
            dg.Bark();
            dg.feature();
        }
    }
