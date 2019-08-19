package com.amdocs;

public class AlgorithmFactor {

	public static IAalgorithm getAlgorithm(int algo) {
		IAalgorithm algorithm =null;
		
		if(algo==1)
			algorithm=new QuickSort();
		else
			if(algo==2)
			algorithm=new QuickSort();
			else
				if(algo==3)
			algorithm=new QuickSort();
				else 
					algorithm=new NullAlgorithm();
		return algorithm;
		
	}
	
	
}
