import java.util.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome \nBig O(entire program)= n+n+n+n+n+1\n"
				+ "=5n+1\n"
				+ "=n(linear)\n\n\n");
		System.out.println("Enter 5 numbers......\n");
		int nums[] = {0,0,0,0,0};
		int x=0;
		for(x=0;x<5;x++) {
		Scanner in = new Scanner(System.in);		
		nums[x]=in.nextInt();
		}
		System.out.println("You entered: " + nums[0]  + nums[1]  + nums[2]  
				+ nums[3]  + nums[4]);
		
		System.out.println("What operation would you like to perform on the array?\n"
				+ "1. Linear Search\n"
				+ "2. Binary Search\n"
				+ "3. Insertion Sort\n"
				+ "4. Bubble Sort\n"
				+ "5. Insertion Sort\n");
		Scanner in = new Scanner(System.in);		
		int choice=in.nextInt();
		
		if (choice==1) {
			int num;
			System.out.println("Linear search selected.......\nEnter search value...\n");
			Scanner n = new Scanner(System.in);
			num=in.nextInt();
			
			Searcher search = new Searcher();
			search.linearSearch(5, nums, num);
		}
		
		else if(choice==2) {
			int num;
			System.out.println("Binary search selected........\nEnter search value...\n");
			Scanner n = new Scanner(System.in);
			num=in.nextInt();
			
			Searcher search = new Searcher();
			search.binarySearch(5, nums, num);			
		}
		
		else if(choice==3) {
			System.out.println("Selection sort selected......\n");
			
			Sorter sort = new Sorter();
			sort.selectionSort(nums,5);
		}
		
		else if(choice==4) {
			System.out.println("Bubble sort selected......\n");
			
			Sorter sort = new Sorter();
			sort.bubbleSort(nums,5);
		}
		
		else if(choice==5) {
			System.out.println("Insertion sort selected......\n");
			
			Sorter sort = new Sorter();
			sort.insertionSort(nums,5);
			
		}

}
	
}