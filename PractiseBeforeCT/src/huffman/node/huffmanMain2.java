package huffman.node;
import java.util.PriorityQueue;

import java.util.Scanner;
public class huffmanMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           //Scanner s = new Scanner (System.in);
           
		int n = 6,as;
		double comparative_length;
		char[] charArray = {'a','c','e','m','u','z'};
		int[] charfreq = { 100, 53, 133,60,44,8};
		
		//creating a prority queue
		//makes a min-priority queue(min-heap).
		
		PriorityQueue<HuffmanNode>q=new PriorityQueue<HuffmanNode>(n,new HuffmanComparator());
		
		
		
		for(int i=0;i<n;i++)
		{
			HuffmanNode hn = new HuffmanNode();
			
			hn.c = charArray[i];
			hn.freq=charfreq[i];
			
			hn.left=null;
			hn.right=null;
			
			q.add(hn);
		}
	
		
	HuffmanNode root =  null;
	int count=0;
	
	while(q.size()>1) {
		
		HuffmanNode x = q.peek();
		q.poll();
		
		HuffmanNode y=q.peek();
		q.poll();
		
		HuffmanNode f = new HuffmanNode();
		
		f.freq=x.freq+y.freq;
		f.c='-';
		
		
		f.left=x;
		f.right=y;
		root=f;
		
		q.add(f);
		count+= x.freq;
		count+=y.freq;
		
		
	}
	
	printCode(root,"",count);
	as= 8*root.freq;
	System.out.println("Ascii length= "+as);
	System.out.println("huffman length= "+count);
	//System.out.println("The comppression percentage: "+((double)(total-count)/total)*100+"%");
	comparative_length=((double)(as-count)/as)*100;
	
	System.out.println("Comparative length is = "+comparative_length+"%");
	
	
	
	
	}

	private static void printCode(HuffmanNode root, String s,int count) {
		// TODO Auto-generated method stub
		if(root.left==null && root.right==null && Character.isLetter(root.c)) {
			   
			   System.out.println(root.c+":"+s+" ");
			   return;
		   }
		
		printCode(root.left,s+"0",count);
		printCode(root.right,s+"1",count);
		
		
		}
	

}