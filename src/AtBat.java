

public class AtBat {
	
	private Result result;
	
	public AtBat(Result userResult){
		result = userResult;
	}
	
	//returns an int representing the number of bases earned for the at bat
	public int basesEarned(){
		
		int basesEarned = 0;
		
		switch(result){
		case OUT:
			break;
		case SINGLE:
			basesEarned = 1;
			break;
		case DOUBLE:
			basesEarned = 2;
			break;
		case TRIPLE:
			basesEarned = 3;
			break;
		case HOMERUN:
			basesEarned = 4;
			break;
		}
		return basesEarned;
	}
}
