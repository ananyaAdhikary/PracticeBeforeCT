package activity.selection.problem;

import java.util.ArrayList;
import java.util.Collections;

public class ASPMain {
	
	public static void selection(ArrayList<ActivitySelectionProblem> list,ArrayList<ActivitySelectionProblem> list2)
	{
//		System.out.println("\nThe selected activity are:");
//		System.out.print(list.get(0).getActivity()+" ");
		list2.add(list.get(0));
		int lastFinish=list.get(0).getFinish();
		
		for(int i=1;i<list.size();i++)
		{
			if(list.get(i).getStart()>=lastFinish)
			{
//				System.out.print(list.get(i).getActivity()+" ");	
				list2.add(list.get(i));
				lastFinish=list.get(i).getFinish();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		ArrayList<ActivitySelectionProblem>list=new ArrayList<ActivitySelectionProblem>();
		
		
		ActivitySelectionProblem a1=new ActivitySelectionProblem();
		a1.setActivity("A1");
		a1.setStart(0);
		a1.setFinish(6);
		
		ActivitySelectionProblem a2=new ActivitySelectionProblem();
		a2.setActivity("A2");
		a2.setStart(3);
		a2.setFinish(4);
		
		ActivitySelectionProblem a3=new ActivitySelectionProblem();
		a3.setActivity("A3");
		a3.setStart(1);
		a3.setFinish(2);
		
		ActivitySelectionProblem a4=new ActivitySelectionProblem();
		a4.setActivity("A4");
		a4.setStart(5);
		a4.setFinish(9);
		
		ActivitySelectionProblem a5=new ActivitySelectionProblem();
		a5.setActivity("A5");
		a5.setStart(5);
		a5.setFinish(7);
		
		ActivitySelectionProblem a6=new ActivitySelectionProblem();
		a6.setActivity("A6");
		a6.setStart(8);
		a6.setFinish(9);
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		list.add(a6);
		
		Collections.sort(list,new ASPComparator());
		
		System.out.println("the sorted activity list:");
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i).getActivity()+" ");
		}
		
		ArrayList<ActivitySelectionProblem>list2=new ArrayList<ActivitySelectionProblem>();
		
		selection(list,list2);
		System.out.println("\nThe selected activity are:");
		
		for(int i=0;i<list2.size();i++)
		{
			System.out.print(list2.get(i).getActivity()+" ");
		}
//		System.out.println(list2);
		
	}

}
