package fractional.knapsack.problem;

import java.util.ArrayList;
import java.util.Collections;

import FKP.ALGo.FKP;

public class FKPMain {
	public static void calculation(ArrayList<FractionalKnapsackProblem>list)
	{
		double capacity=15;
		double totalProfit=0;
		for(int i=0;i<list.size();i++)
		{
			if(capacity==0)
				break;
			else if(capacity>=list.get(i).getWeight())
			{
				
				totalProfit=totalProfit+list.get(i).getProfit();
				capacity=capacity-list.get(i).getWeight();
			}
			else
			{
				double t= ( list.get(i).getProfit() / list.get(i).getWeight() ) *capacity;
				totalProfit=totalProfit+t;
				capacity=0;
			}
		}
		System.out.println("the total profit is:"+totalProfit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<FractionalKnapsackProblem> list=new ArrayList<FractionalKnapsackProblem>();
		
		
		FractionalKnapsackProblem item1=new FractionalKnapsackProblem();
		item1.setItem(1);
		item1.setProfit(12);
		item1.setWeight(3);
		
		FractionalKnapsackProblem item2=new FractionalKnapsackProblem();
		item2.setItem(2);
		item2.setProfit(5);
		item2.setWeight(1);
		
		FractionalKnapsackProblem item3=new FractionalKnapsackProblem();
		item3.setItem(3);
		item3.setProfit(16);
		item3.setWeight(4);
		
		FractionalKnapsackProblem item4=new FractionalKnapsackProblem();
		item4.setItem(4);
		item4.setProfit(7);
		item4.setWeight(2);
		
		FractionalKnapsackProblem item5=new FractionalKnapsackProblem();
		item5.setItem(5);
		item5.setProfit(9);
		item5.setWeight(9);
		
		FractionalKnapsackProblem item6=new FractionalKnapsackProblem();
		item6.setItem(6);
		item6.setProfit(11);
		item6.setWeight(4);
		
		FractionalKnapsackProblem item7=new FractionalKnapsackProblem();
		item7.setItem(7);
		item7.setProfit(6);
		item7.setWeight(3);
		
		
		list.add(item1);
		list.add(item2);
		list.add(item3);
		list.add(item4);
		list.add(item5);
		list.add(item6);
		list.add(item7);
		
		Collections.sort(list,new FKPComparator());
		

		for(FractionalKnapsackProblem L:list)
			System.out.print(L.getItem() +" ");
		
		calculation(list);

		

	}

}
