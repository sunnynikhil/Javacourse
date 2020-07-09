/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

/**
 *
 * @author oyo
 */
public class filp0s1s {
    
    public static int filp(int a[]){
        int max=0;
        int org_zeros=0;
        for(int i=0;i<a.length;i++){
        if(a[i]==0)
            org_zeros++;
        int count1=0,count2=0;
        for(int j=i;j<a.length;j++){
            if(a[j]==1)
                count2++;
            else
                count1++;
            max=Math.max(max,count2-count1);
           
        }
        }
        System.out.println("max="+max);
        return max+org_zeros;
    }
    public static void main(String[] args){
        int a[] ={0,1,0,0,1,1,0};
        int length=filp(a);
        System.out.print("length"+length);
    }
}
