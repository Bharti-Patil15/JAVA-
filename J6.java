
package j6;
class Animal
    {
        public void move()
        {
        
            System.out.println("Animals can Move");
        }
    }
    class Dog extends  Animal
    {
        //Method overriding
        public void move()
        { 
           System.out.println("Dogs can walk and run"); 
        }
        void add(int a,int b)
        {
            int s = a+b;
            System.out.println("Sum = "+s);
        
        }
        //Method Overloading
        void add(int a,int b,int c)
        {
            int s = a+b+c;
            System.out.println("Sum = "+s);
        
        }
        
    }


public class J6 {
    
    
    public static void main(String[] args) {
        Animal a=new Animal();
        Animal b= new Dog();
        a.move();
        b.move();
        
        Dog d= new Dog();
        d.add(10, 20);
         d.add(10, 20,30);
    }
    
}
