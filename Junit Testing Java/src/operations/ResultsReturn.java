package operations;

public class ResultsReturn {
		public String getResultRank(int marks) {
			
			if(marks > 75) {
				return "A+";
			}else if(marks > 65) {
				return "B+";
			}else {
				return "C";
			}
		}
}
