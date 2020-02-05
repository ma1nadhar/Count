import java.util.*;
public class Count {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		String line = console.nextLine();
		System.out.println();
		System.out.println("Please enter an alphabetical sequence of strings separated");
		System.out.println("by spaces. The end of the sequence must be signified using");
		System.out.println("the sentinel value lastString, followed by a return.");
		System.out.println();
		System.out.println();
		line = line.replace("lastString", "");
		String lineToPrint = line;
		
		lineToPrint = lineToPrint.trim().toLowerCase();
		String[] linesplitToPrint = lineToPrint.split(" ");
		System.out.println("Your original list: "+Arrays.toString(linesplitToPrint));
		line = line.toLowerCase() + "end";
		//System.out.println(line);
		String[] linesplit = line.split(" ");
		
		Arrays. sort(linesplit);
		
		int count = 1;
		List<Integer> myCountList = new ArrayList<Integer>();
		for(int i = 0; i<linesplit.length-1; i++) {
			
				if(linesplit[i].equals(linesplit[i+1])) {
					count++;
					//System.out.println("is match "+linesplit[i]);
				}	
				else
				{
					if(count>0) {
						myCountList.add(count);
						//System.out.println("is not a match > 0"+linesplit[i]);
					} else {
						myCountList.add(1);
						//System.out.println("is not a match = 1"+linesplit[i]);
					}
					count = 1;
				}
			
			
		}
		//System.out.println(myCountList);
		Collections.sort(myCountList);
		//Arrays.sort(myCountList.toArray(), Collections.reverseOrder());
		System.out.println("Count: "+myCountList);
	}//main

}
