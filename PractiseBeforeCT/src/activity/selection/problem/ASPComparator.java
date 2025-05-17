package activity.selection.problem;

import java.util.Comparator;

public class ASPComparator implements Comparator<ActivitySelectionProblem> {

	@Override
	public int compare(ActivitySelectionProblem o1, ActivitySelectionProblem o2) {
		// TODO Auto-generated method stub

//		if(o1.getFinish()>o2.getFinish())
//			return 1;
//		else 
//			return -1;
		
		
		return o1.getFinish()-o2.getFinish();
	}

	
}
