package day10Assignment2;

public class HistoryStudent extends Student{
	int historyMarks;
	int civicsMarks;
	
	@Override
	public int getPercentage() {
		int sum = (historyMarks+civicsMarks)/2;
		return sum;
	}

}
