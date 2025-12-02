class Animal{
    public void eat(){
        System.out.println("吃");
    }
    public void sleep(){
        System.out.println("睡了");
    }
}
class Wolf extends Animal{
    public void eat(){
        System.out.println("狼吃肉");
    }

}
class Sheep extends Animal{
    public void eat(){
        System.out.println("羊吃草");
    }
}
public class AnimalTest{
    public static void main(String[] args) {
        Wolf w = new Wolf();
        Sheep s = new Sheep();
        s.eat();
        s.sleep();
        w.eat();
        w.sleep();
    }
}