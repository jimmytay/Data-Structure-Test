package assign;

import java.util.*;

public class BestFit {
	
	public int Bestfit(int limit,Integer[] parcels) {

		int num=0;
		
		int n = parcels.length;
		
		int[] remain = new int [n];
		
		for (int i=0; i<n; i++)
	    {
	        int j;
	 
	        // Initialize minimum space left and index of best bin
	        int min = limit+1, bi = 0;
	        for (j=0; j<num; j++)
	        {
	            if (remain[j] >= parcels[i] && remain[j] - parcels[i] < min)
	            {
	                bi = j;
	                min = remain[j] - parcels[i];
	            }
	        }
	 
	        // If no bin could accommodate weight[i], create a new bin
	        if (min==limit+1)
	        {
	        	remain[num] = limit - parcels[i];
	            num++;
	        }
	        else // Assign the item to best bin
	            remain[bi] -= parcels[i];
	    }
	    return num;
		
	}
	


}
