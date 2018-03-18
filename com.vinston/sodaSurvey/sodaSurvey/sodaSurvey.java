package sodaSurvey;

public class sodaSurvey {
	//----------------------------------------
	// Determines and prints the average of each row (soda) and 
	// each column (respodent) of the survey scores.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Each rows contains the scores awarded a soda
		// Each column contains the scores awarded by a respondent
		int[][] scores = { {3, 4, 5, 2, 1, 4, 3, 2, 4, 4},
						   {2, 4, 3, 4, 3, 3, 2, 1, 2, 2},
						   {3, 5, 4, 5, 5, 3, 2, 5, 5, 5},
						   {1, 1, 1, 3, 1, 2, 1, 3, 2, 4} 
						 };
		
		final int SODAS = 4;
		final int PEOPLE = 10;
		
		int[] sodaSum = new int[SODAS]; // Each elements is the score sum for a soda
		int[] personSum = new int[PEOPLE]; // Each element is the score sum for a respondent
		
		for(int soda = 0; soda < SODAS; soda++) {
			for(int person = 0; person < PEOPLE; person++) {
				sodaSum[soda] += scores[soda][person];
				personSum[person] += scores[soda][person];
			}
		}
		System.out.println("Averages: \n");
		
		for(int soda = 0; soda < SODAS; soda++) {
			System.out.println("Soda #" + (soda + 1) + ": " + (float)sodaSum[soda] / PEOPLE);
		}
		
		System.out.println();
		
		
		for (int person = 0; person < PEOPLE; person++) {
			
			System.out.println("Person #" + (person + 1) + ": " + (float)personSum[person] / SODAS );

		}
	}
}


