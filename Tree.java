
import java.util.*;
import java.io.*;
import java.util.Map.Entry; 

//
//class Node {
//    Node left;
//    Node right;
//    int data;
//    
//    Node(int data) {
//        this.data = data;
//        left = null;
//        right = null;
//    }
//}

class Tree {

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
    public static int heightoftree(Node root)
    {
        if(root==null)
            return 0;
        int lheight=heightoftree(root.left)+1;
        int rheight=heightoftree(root.right)+1;
        if(lheight>rheight)
            return lheight;
       return rheight; 
                
    }
	static void getVerticalOrder(Node root, int hd, 
                                TreeMap<Integer,Vector<Integer>> m) 
    { 
     
        if(root == null) 
            return; 
          
        Vector<Integer> get =  m.get(hd); 
          
       
        if(get == null) 
        { 
            get = new Vector<>(); 
            get.add(root.data); 
        } 
        else
            get.add(root.data); 
          
        m.put(hd, get); 
        
        getVerticalOrder(root.left, hd-1, m); 
          
        getVerticalOrder(root.right, hd+1, m); 
    } 
      
   
    static void printVerticalOrder(Node root) 
    { 
        TreeMap<Integer,Vector<Integer>> m = new TreeMap<>(); 
        int hd =0; 
        getVerticalOrder(root,hd,m);  
        for (Entry<Integer, Vector<Integer>> entry : m.entrySet()) 
        { 
            Vector<Integer> values=entry.getValue();
            System.out.print(values.firstElement()+" ");
        } 
    } 
        public static void printlevel(Node root,int level)
        {
            if(root==null)
                return;
            if(level==1)
                System.out.print(root.data+" ");
            else if(level>1)
            {
                printlevel(root.left,level-1);
                printlevel(root.right,level-1);
            }
        }

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        printVerticalOrder(root);
    }	
}