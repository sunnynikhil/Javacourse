/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;
import java.util.*;

/**
 *
 * @author oyo
 */
public class MinHeap {
    
    public static void heapify(int arr[],int n,int i){
        int last=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && l>=0&& arr[l]!=0&& arr[l]<arr[last])
            last=l;
        if(r<n && r>=0&& arr[r]!=0 && arr[r]<arr[last])
            last=r;
        if(i!=last){
            int swap=arr[i];
            arr[i]=arr[last];
            arr[last]=swap;
            heapify(arr,n,last);
        }
    }
    
    public static int p(int arr[],int n,int data){
        n=n+1;
        arr[n-1]=data;
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
        return n;
    }
    public static int pp(int arr[],int n){
        System.out.print("n");
        int last=arr[n-1];
        arr[0]=last;
        n=n-1;
        heapify(arr,n,0);
        return n;
    }
    public static void main(String[] args){
        int arr[] = new int[100];
        int n=0;
        int t;
        Scanner in = new Scanner(System.in);
        t=in.nextInt();
        while(t-->0){
            int quries;
            quries=in.nextInt();
            int i=0;
            while(i<quries){
                String s;
                s=in.nextLine();
                System.out.println("i:"+i);
                switch(s)
                        {
                    case "p":
                    int x;
                    x=in.nextInt();
                    n=p(arr,n,x);
                    System.out.println(n);
                        break;
                    case "t":
                    System.out.println(arr[0]);
                    break;
                
                    case "pp":
                    n=pp(arr,n);
                    System.out.println(n);
                    break;
            
            }
                i++;
            }
        }
    }
    
}
