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
import java.util.*;

public class segmenttree {

    public static void segmentbuild(int a[], int s[], int l,int h ,int pos){
        if(l==h){
                
                    s[pos]=a[l];
                    return;
            
        }
        int m = (l+h)/2;
//        System.out.println("low="+l+" high="+h+" pos="+pos);
        segmentbuild(a,s,l,m,2*pos+1);
        segmentbuild(a,s,m+1,h,2*pos+2);
        s[pos]=Math.min(s[2*pos+1], s[2*pos+2]);
    }
    
    public static int minseg(int s[],int ql,int qh,int l,int h,int pos){
        if(ql<=l && qh>=h)
            return s[pos];
        if(ql>h || qh<l)
            return Integer.MAX_VALUE;
        int mid=(l+h)/2;
        return Math.min(minseg(s,ql,qh,l,mid,2*pos+1),minseg(s,ql,qh,mid+1,h,2*pos+2));
    }
    public static void main(String[] args){
    
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
         a[i]=in.nextInt();
        int x = (int) (Math.ceil(Math.log(n) / Math.log(2))); 
        int k = 2 * (int) Math.pow(2, x) - 1; 
//        int k = 2*n-1;
        int seg[] = new int[k];
        for(int i=0;i<k;i++)
            seg[i]=Integer.MAX_VALUE;
        segmentbuild(a,seg,0,n-1,0);
        int ql=in.nextInt();
        int qh = in.nextInt();
        int result=minseg( seg ,ql,qh,0, n-1 ,0);
        System.out.print("result:"+result);
        
    }
}
