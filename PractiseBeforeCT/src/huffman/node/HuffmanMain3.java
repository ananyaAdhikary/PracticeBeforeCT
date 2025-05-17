package huffman.node;

import java.util.PriorityQueue;

public class HuffmanMain3 {
	static int count = 0;  // ✅ Keep only this one

	public static void main(String[] args) {
		int n = 4;
		char[] c = {'A','C','E','M','U','Z'};
		int[] data = { 100,53,133,60,44,8 };

		PriorityQueue<HuffmanNode> q = new PriorityQueue<HuffmanNode>(n, new HuffmanComparator());

		for (int i = 0; i < n; i++) {
			HuffmanNode hn = new HuffmanNode();
			hn.c = c[i];
			hn.freq = data[i];
			hn.left = null;
			hn.right = null;
			q.add(hn);
		}

		HuffmanNode root = null;

		while (q.size() > 1) {
			HuffmanNode x = q.poll();
			HuffmanNode y = q.poll();

			HuffmanNode f = new HuffmanNode();
			f.freq = x.freq + y.freq;
			f.c = '-';
			f.left = x;
			f.right = y;

			root = f;
			q.add(root);
		}
int total = root.freq*8;
		System.out.println("The original length: " +total);
		print(root, "", c, data);  // ✅ fixed
		System.out.println("The compression length: " + count); 
		System.out.println("The comppression percentage: "+((double)(total-count)/total)*100+"%");// ✅ now it shows correct value
	}

	private static void print(HuffmanNode root, String s, char[] c, int[] data) {
		if (root.left == null && root.right == null && Character.isLetter(root.c)) {
			System.out.println(root.c + ": " + s);
			int fre = 0;
			for (int i = 0; i < c.length; i++) {
				if (c[i] == root.c) {
					fre = data[i];
					break;
				}
			}
			count += fre * s.length();
			return;
		}

		print(root.left, s + "0", c, data);
		print(root.right, s + "1", c, data);
	}
}
