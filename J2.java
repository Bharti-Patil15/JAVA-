/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2;

/**
 *
 * @author IMRD
 */
public class J2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a=8;
       int b=6;
       System.out.println("Arithmatic Operators");
       System.out.println("Addition = "+(a+b));
       System.out.println("Substraction = "+(a-b));
       System.out.println("Multiplication = "+(a*b));
       System.out.println("Division = "+(a/b));
       System.out.println("Modulus= "+(a%b));
       System.out.println("Relational Operators");
       System.out.println("Equal to = "+(a==b));
       System.out.println("Greater = " +(a>b));
       System.out.println("Less = " +(a<b));
       System.out.println("Greater than =  " +(6>=9));
       System.out.println("Less than = " +(3<=3));
       System.out.println("Not equal to = " +(a!=b));
       System.out.println("Logical Operators");
       int age=20;
       System.out.println("AND = "+ (age>=18 && age<=60));
       System.out.println("OR = "+ (age>=18 || age<=60));
       System.out.println("NOT = "+ (!(age<=12)));
       System.out.println("Assignment Operators");
       a=10;
       System.out.println("Initial Value of a = "+a);
       System.out.println("Assign ="+a);
       System.out.println("Assign & Add"+(a+=5));
       System.out.println("Assign & Substract = "+(a-=5));
       System.out.println("Assign & Multipy = "+(a*=5));
       System.out.println("Assign & Division = "+(a/=5));
       System.out.println("Assign & Modulus = "+(a-=5));
       System.out.println("Unary Operators");
       int y=3;//uninitialize operand cannot increment
       System.out.println("Increment = "+ y);     
       System.out.println("Valued used : "+(++y));
       System.out.println("Final value : "+y);
    }
    
}
