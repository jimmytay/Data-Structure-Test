package assign;

import java.util.Scanner;
import assign.*;

public class TestApp {
	
	static BestFit bf = new BestFit(); 
	static BestFitDescending bfd = new BestFitDescending();
 	
	public static void main(String args[]) {
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the track limit: ");
        int limit = sc.nextInt();
                
        System.out.print("Enter the number of parcels: ");
        int num = sc.nextInt();
        
        int[] parcels = new int[num];
        
        for(int x=0;x<parcels.length;x++){
        
        	System.out.print("Enter weight for parcel "+(x+1)+": ");
        	parcels[x]=sc.nextInt();
        }
        */
		
		Integer parcels[] = {2, 5, 4, 7, 1, 3, 8};
	    int limit = 10;
	    
        System.out.println("Minimum number is "+bf.Bestfit(limit,parcels));

        System.out.println("Minimum number is "+bfd.bestFitDescending(limit,parcels));
	}
	
}
