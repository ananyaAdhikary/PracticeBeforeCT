package activity.selection.problem;

import java.util.Arrays;

public class ActivitySelectionMthodeTWO {

	
	public static void selection(String[] activity,int[]start,int[] finish)
	{
		System.out.print(activity[0] +" ");
		int l=0;
		for(int i=1;i<activity.length;i++)
		{
			if(start[i]>finish[l])
			{
				System.out.print(activity[i] +" ");
				l=i;
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String activity[]= {"A3","A2","A1","A5","A6","A4"};
		int start[]= {1,3,0,5,8,5};
		int finish[]= {2,4,6,7,9,9};
		
		Arrays.sort(finish);

	selection(activity,start,finish);
		
		
		

	}

}
