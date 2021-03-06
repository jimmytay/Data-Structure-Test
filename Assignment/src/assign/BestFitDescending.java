package assign;

import assign.BestFit;

import java.util.*;

public class BestFitDescending {

	static BestFit bf = new BestFit();
	
	public int bestFitDescending(int limit,Integer[] parcels){
		
		int num = 0;
		Integer[] newParcels = new Integer [parcels.length];
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(parcels.length, Collections.reverseOrder());
		
		queue.addAll(Arrays.asList(parcels));
				
		for(int x=0;x<newParcels.length;x++){
			
			newParcels[x] = queue.remove();
		}
		
		num = bf.Bestfit(limit,newParcels);
	    
		return num;
	}
}
