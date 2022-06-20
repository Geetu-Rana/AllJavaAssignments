package day10Assignment2;

public class ScienceStudent extends Student {
	
	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	@Override
	public int getPercentage() {
	int	sum = (physicsMarks+chemistryMarks+mathsMarks)/3;
		return sum;
	}

}
