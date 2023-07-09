package choclateAssignment;

public class ChoclateClass {
	int intialPoint;
	int endPoint;

	void choclateCount() {
		while (intialPoint < endPoint) {
			intialPoint += 5;
			if(intialPoint<=63) {
				System.out.println(intialPoint);
			}else {
				System.out.println("Number of choclate cannot exceed 63");
				break;
			}
			
		}
	}
}
