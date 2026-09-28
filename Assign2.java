/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IMRD
 */
public class Assign2 {
    public static void main(String[] args)
    {
        System.out.println(" Arithmetic Operator ");
        int n1=30 , n2=15 ,sum=0,dif=0,multi=0;
        float div=0 ,mod=0;
        System.out.println("Number 1 = "+n1);
        System.out.println("Number 2 = "+n2);
        sum=n1+n2;
        System.out.println("The Sum = "+sum);
        dif=n1-n2;
        System.out.println("Difference = "+dif);
        multi=n1*n2;
        System.out.println("Multiplication = "+multi);
        div=n1/n2;
        System.out.println("Difference = "+div);
        mod=n1%n2;
        System.out.println("Modulus = "+mod);
        System.out.println(" Logical Operator ");
        if((n1==30)&&(n2==15))
        {
            System.out.println("Both Conditions are True");
        
        }
        else
        {
            System.out.println("Both Conditions are NOT True");
        }
    }
}
