
package j3;
 import java.io.*;

public class J3 {
  
    public static void main(String[] args) {
       try{
       
           DataInputStream d= new DataInputStream(System.in);
           System.out.println("\n Enter your 1st String : ");
           String s = d.readLine();//used to read input from user
           //String Functions
           int y=s.length();//count number of characters
           System.out.println("\n Length of Your string is "+y);
           String s1=s.toUpperCase();
           System.out.println("\n Your string in uppercase "+s1);
           String s2=s.toLowerCase();
           System.out.println("\n Your string in lowercase "+s2);
           char c=s.charAt(4);
           System.out.println("\n Your Character at your specified index 4 "+c);
           String r=s.replace('a','b');
           System.out.println("\n Your replaceds character is"+r);
           String sb=s.substring(1,5);
           System.out.println("\n Your substring is : "+sb);
           System.out.println("\n Enter character to find index");
           String s3=d.readLine();
           int a=s.indexOf(s3);
           System.out.println("\n index of char is "+a);
           System.out.println("\n Enter Character to find last Index");
           String s4=d.readLine();
           int b=s.indexOf(s4);
           System.out.println("\n Last index of char is "+b);
           System.out.println("\n Enter the 2nd string ");
           String s5=d.readLine();
           String p=s.concat(s5);
           System.out.println("\n Concated string is "+p);
           boolean b1=s.equals(s1);
           if(b1==true)
           {
                 System.out.println("\n Strings are equal ");
           }
           else
           {
                System.out.println("\n strings are not equal");
           }
           
           //String Buffer Function
           StringBuffer sf=new StringBuffer("Java Programming");
           System.out.println("\n String = "+sf);//will print the string
           System.out.println("\n Length = "+sf.length());//Total number of characters
           System.out.println("\n Capacity = "+sf.capacity());//Total allocated capacity
           sf.setLength(8);
           System.out.println("\n After setting the Length  string = "+sf);
           sf.setCharAt(0, 'B');//it will change the character at speacified position
           System.out.println("\n Set CharAt String = "+sf);
           sf.setCharAt(0, 'J');
           int a1=8;
           sf.append(a1);//It concatenates the other data type value
           System.out.println("\n Appended String = "+sf);
           sf.insert(5, "is the ");
           sf.insert(16, " language");
           System.out.println("\n In serted String = "+sf);
           sf.reverse();
           System.out.println("\n Reverse String = "+sf);
           
       
       }
       catch(Exception e)
       {
          System.out.println(""+e);
       }
    }
    
}
