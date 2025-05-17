package huffman.node;

import java.util.PriorityQueue;

public class HuffmanMain {
	public static int count=0;
	public static void printcode(HuffmanNode root,String s)
	{
		if(root.left==null && root.right==null && Character.isLetter(root.c)) {
			System.out.println(root.c+ ":" +s);
			count=count+(s.length()*root.freq);
		    return;
		}
		printcode(root.left,s+"0");
		printcode(root.right,s+"1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=6;
		int[] freqArr= {100,53,133,60,44,8};
		char[] letter= {'A','C','E','M','U','Z'};
	
		
		PriorityQueue<HuffmanNode> q=new PriorityQueue<HuffmanNode>(n,new HuffmanComparator());
		
		for(int i=0;i<n;i++)
		{
			HuffmanNode hn=new HuffmanNode();
			hn.c=letter[i];
			hn.freq=freqArr[i];
			hn.left=null;
			hn.right=null;
			q.add(hn);
			
//			
		}

		HuffmanNode root=null;
		while(q.size()>1)
		{
			HuffmanNode x=q.peek();
			q.poll();
			HuffmanNode y=q.peek();
			q.poll();
			
			HuffmanNode w=new HuffmanNode();
			w.c='_';
			w.freq=x.freq+y.freq;
			w.left=x;
			w.right=y;
			root=w;
			
			q.add(w);
		}
		printcode(root,"");
		int totalfreq=root.freq*8;
		System.out.println("Ascii length:"+totalfreq);
		System.out.println("compression length:"+count);
		System.out.println("the percentage="+((double)(totalfreq-count) *100 / totalfreq)+"%");
		
		
		
	}

}
