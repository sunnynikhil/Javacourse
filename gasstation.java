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
class petrol{
    int petrol;
    int distance;
    petrol(int p,int d){
        this.distance=d;
        this.petrol=p;
    }
}

public class gasstation {

    public static int tour(petrol a[],int n){

        int start=0;
        int end=1;
        int cur_petrol = a[start].petrol-a[start].distance;
        while(cur_petrol<0 || start!=end){
        
            while(cur_petrol<0 && start!=end){
            cur_petrol-=a[start].petrol-a[start].distance;
            start=(start+1)%n;
            
            if(start==0)
                return -1;
            
            }
            cur_petrol+=a[end].petrol-a[end].distance;
            end=(end+1)%n;
        }
        return start;
    }
    
    public static void main(String[] args){
        petrol[] arr = {new petrol(4,6),
                        new petrol(6,5),
                        new petrol(7,3),
                        new petrol(4,5)};
        
        int start = tour(arr,arr.length);
        if(start==-1)
            System.out.print("no tour is possible");
        else
            System.out.print("tour starts from "+start );
        } 
    }

