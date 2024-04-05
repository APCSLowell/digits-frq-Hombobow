import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
		int count = 0;
		ArrayList <Integer> nd = new ArrayList <Integer>();
		while (num /10 > 10) {
			nd.add(num % 10);
			num /= 10;
		}
		nd.add(num);
		for (int i = nd.length; i >= 0; i++) {
			digitList.add(nd.get(i));
		}
		
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		boolean y = false;
		int min = digitList.get(0);
		for (int i = 0; i < digitList.size(); i++) {
			if (digitList.get(i) < min) {
				y = true;
			}
			else {
				min = digitList.get(i);
			}
		}
		if (y) {
			return false;
		}
		return true;
		
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
