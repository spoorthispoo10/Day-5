class Parent1{
    void appa(){
        System.out.println("dad");
    }

}
class Child1 extends Parent1{
    void maga(){
        System.out.println("Son");
    }

}
class Child2 extends Parent1{
    void maglu(){
        System.out.println("Daughter");
    }

}
class class3{
    public static void main(String[]args){
        Child1 ph = new Child1();
        Child2 ch = new Child2();
        ph.maga();
        ph.appa();
        ch.maglu();
    }
}
// 2 child= 1parent