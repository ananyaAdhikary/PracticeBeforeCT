package huffman.node;

import java.util.Comparator;

public class HuffmanComparator implements Comparator<HuffmanNode>{

	@Override
	public int compare(HuffmanNode o1, HuffmanNode o2) {
		// TODO Auto-generated method stub
		return o1.freq-o2.freq;
	}
	

}
