
package j4;
class Outer
{
    int outer_x=100;
    void test()
    {
        Inner inner=new Inner();
        inner.display();
    }
static int count=0;//will get memory only once and retain its value
Outer()
{
    count++;//incrementing the value of static variable
    System.out.println(count);
}
class Inner
{

    void display()
    {
    
        System.out.println("Display : outer_x= "+outer_x);
    }
}

}

public class J4 {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Outer outer=new Outer();
        outer.test();
        //creating objects
        Outer o1=new Outer();
        Outer o2=new Outer();
        Outer o3=new Outer();
    }
    
}
