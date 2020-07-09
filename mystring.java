/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;
import com.sun.xml.internal.ws.util.StringUtils;
import java.io.*;
import java.util.*;
import java.math.*;

/**
 *
 * @author oyo
 */
public class mystring {
    
    public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   String A=sc.next();
   String B=sc.next();
   int length=A.length() + B.length();
   
   String fullword=A+" ";
   fullword=fullword+B;
   System.out.println(length);
   if(A.compareTo(B)>0)
       System.out.println("yes");
   else
       System.out.println("no");
   char ch=' ';
   StringBuffer output = new StringBuffer();
   for (int i=0;i<fullword.length();i++)
   {
     if(ch==' ' && fullword.charAt(i)!=' ')
         output.append(Character.toUpperCase(fullword.charAt(i)));
     else
         output.append(fullword.charAt(i));
     ch=fullword.charAt(i);
   }
   fullword=output.toString();
   System.out.print(fullword);
  }   
}
