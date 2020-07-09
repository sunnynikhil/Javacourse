/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Queue;
import java.util.*;

/**
 *
 * @author oyo
 */

class rootNode {
    rootNode left;
    rootNode right;
    int data;
    
    rootNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Pair<U, V>
{
	public final U first;   	// first field of a Pair
	public final V second;  	// second field of a Pair

	// Constructs a new Pair with specified values
	Pair(U first, V second)
	{
		this.first = first;
		this.second = second;
	}

	// Factory method for creating a Typed Pair immutable instance
	public static <U, V> Pair <U, V> of(U a, V b)
	{
		// calls private constructor
		return new Pair<>(a, b);
	}
}

public class TreeBasic {
    
    public static rootNode insert(rootNode root , int data){
        if(root==null){
            return new rootNode(data);
        }
        else{
            rootNode cur;
            if(data <= root.data)
            {
                cur=insert(root.left,data);
                root.left=cur;
            }
            else if(data >= root.data){
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    
    public static void inOrder(rootNode root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data);
        inOrder(root.right);

    }
    
    public static void postOrder(rootNode root){
       if(root == null)
            return;
        postOrder(root.left);
        postOrder(root.right); 
        System.out.print(root.data);
        
    }
    
    public static void preOrder(rootNode root){
       if(root == null)
            return;
       System.out.print(root.data);
        preOrder(root.left);
        preOrder(root.right); 
        
        
    }
    
    public static int heightOfTree(rootNode root){
        if(root == null)
            return 0;
        int lheight=0;
        int rheight=0;
        lheight=heightOfTree(root.left)+1;
        rheight=heightOfTree(root.right)+1;
        
        return rheight>lheight?rheight : lheight;
        
    }
    
    public static boolean find(rootNode root,int data){

        if(root==null )
            return false;
        if(root.data==data)
            return true;
        boolean r1=find(root.left,data);
        if(r1)return true;
        boolean r2=find(root.right,data);
        return r2;
        
        
    }
    
    public static void leveltransversal(rootNode root){
        int h= heightOfTree(root);
        for(int i=1;i<=h;i++)
            printGivenLevel(root,i);
    }
    public static void printGivenLevel(rootNode root , int level){
        if(root==null)
            return;
        if(level==1)
            System.out.print(root.data);
        else{
            printGivenLevel(root.left,level-1);
            printGivenLevel(root.right,level-1);
        }
    }
    public static boolean identicalTrees(rootNode x , rootNode y){
        if(x==null && y==null)
            return true;
        
        return (x!=null && y!=null) && (x.data == y.data) && identicalTrees(x.left,y.left) &&identicalTrees(x.right,y.right);
    }
    
    public static void leftview(rootNode root){
        
        if(root==null)
            return ;
        
        Queue<rootNode> queue = new ArrayDeque<>();
        
        queue.add(root);
        
        rootNode cur;
        
        while(!queue.isEmpty())
        {
                int size = queue.size();
                int i=0;
                while(i++<size){

//                    System.out.println("i++"+i);
                        cur=queue.poll();
                        if(i==size)
                            System.out.print("->"+cur.data);

                        if(cur.left!=null)
                            queue.add(cur.left);
                        if(cur.right!=null)
                            queue.add(cur.right);
                }

    }
        
        
    }
    
    public static void rightviewmap(rootNode root, int level, Map<Integer , Integer> map){
        
        if(root == null)
            return ;
        map.put(level, root.data);
        
        rightviewmap(root.right,level+1,map);
        rightviewmap(root.left,level+1,map);
    }
    
    public static void rightviewmap(rootNode root){
        Map<Integer , Integer> map = new HashMap<>();
        rightviewmap(root,1,map);
        
        System.out.print(map);
        for(int i=1;i<=map.size();i++)
            System.out.print(map.get(i)+" ");
    }
    
    public static void printbottom(rootNode root,int dist, int level, Map<Integer, Pair<Integer,Integer>> map){
        
        if(root== null)
            return;
        if(!map.containsKey(dist)|| level>=map.get(dist).second)
        { 
            map.put(dist,Pair.of(root.data, level));
        }
        
        printbottom(root.left,dist-1,level+1,map);
        printbottom(root.right,dist+1,level+1,map);
            
        
    }
    
    public static void printbottom(rootNode root){
        
        Map<Integer, Pair<Integer,Integer>> map = new TreeMap<>();
        printbottom(root,0,0,map);
        for(Pair<Integer, Integer> it : map.values())
            System.out.print(it.first);
        
        
    }
 public static void printTop(rootNode root, int dist, int level,
	                            Map<Integer, Pair<Integer, Integer>> map)
	{
		// base case: empty tree
		if (root == null) {
			return;
		}

		// if current level is less than maximum level seen so far
		// for the same horizontal distance or horizontal distance
		// is seen for the first time, update the map
		if (!map.containsKey(dist) || level >= map.get(dist).second) {
			// update value and level for current distance]
                    System.out.println("data="+root.data+"level="+level+"dist"+dist);
			map.put(dist, Pair.of(root.data, level));
		}

		// recur for left subtree by decreasing horizontal distance and
		// increasing level by 1
		printTop(root.left, dist - 1, level + 1, map);

		// recur for right subtree by increasing both level and
		// horizontal distance by 1
		printTop(root.right, dist + 1, level + 1, map);
	}

	// Function to print the top view of given binary tree
	public static void printTop(rootNode root)
	{
		// create a TreeMap where
		// key -> relative horizontal distance of the node from root node and
		// value -> pair containing node's value and its level
		Map<Integer, Pair<Integer, Integer>> map = new TreeMap<>();

		// do pre-order traversal of the tree and fill the map
		printTop(root, 0, 0, map);

		// traverse the TreeMap and print top view
		for (Pair<Integer, Integer> it: map.values()) {
			System.out.print(it.first + " ");
		}
	}
        
        public static boolean iscomptele(rootNode root){
            if(root==null)
                return false;
            boolean flag = false;
            rootNode cur;
            Queue<rootNode> queue = new ArrayDeque<>();
            queue.add(root);
            
            while(!queue.isEmpty()){
                
                cur=queue.poll();
                if(flag&&(cur.left!=null||cur.right!=null))
                    return false;
                if(cur.left==null && cur.right!=null)
                    return false;
                if(cur.left!=null)
                    queue.add(cur.left);
                else
                    flag=true;
                if(cur.right!=null)
                    queue.add(cur.right);
                else
                    flag=true;
                
            }
            
           return true; 
            
        }
        
        public static void nextnode(rootNode root,int val){
            
            if(root == null)
                return ;
            Queue<rootNode> queue = new ArrayDeque<>();
            queue.add(root);
            
            rootNode cur;
            while(!queue.isEmpty())
            {
                
                int size = queue.size();
                while(size-->0){
                    cur=queue.poll();
                    if(cur.data == val){
                        if(size==0){
                            
                            return;
                        }
                        System.out.print("right->"+queue.peek().data);
                    }
                    if(cur.left!=null)
                        queue.add(cur.left);
                    if(cur.right!=null)
                        queue.add(cur.right);
                }
            }
            
          return ;          
            
        }
        
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int t= in.nextInt();
            rootNode root = null;
            while(t-->0){
                int data= in.nextInt();
                root=insert(root,data);
            }
    //        int t2=in.nextInt();
    //        rootNode root1 = null;
    //         while(t2-->0){
    //             int data= in.nextInt();
    //            root1=insert(root1,data);
    //         }
    //         printbottom(root);
             nextnode(root,5);
    //       System.out.print("two tree are indentical "+identicalTrees(root,root1));  

        }

    
}

      