package fractional.knapsack.problem;

import java.util.Comparator;

public class FKPComparator implements Comparator<FractionalKnapsackProblem>{

	@Override
	public int compare(FractionalKnapsackProblem o1, FractionalKnapsackProblem o2) {
		// TODO Auto-generated method stub
		
		double cmp,cmp2;
		cmp=new Double(o1.getProfit()/o1.getWeight());
		cmp2=new Double(o2.getProfit()/o2.getWeight());
		
		if(cmp>cmp2)
			return -1;
		else
			return 1;
			
		
	}
	

}
