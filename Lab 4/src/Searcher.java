
public class Searcher {
	public int linearSearch(int arrSize,int arr[],int searchVal) {
		int index=0;
		int size=5;
		while (index<size) {
			if (arr[index]==searchVal){
				System.out.println("Search value is located at index + " + index);
				
			return index;
			}
			index ++;
		}
		
		return -1;
	}
	
	public int binarySearch(int arrSize,int arr[],int searchVal) {
		//arrSize=5;
		int start=0;
		int end=arrSize-1;
		int mid=0;

		while(start<=end) {
			System.out.println("In the loop\n");
			
			mid=((start+end)/2);
			
			if (searchVal==arr[mid]) {
				return mid;
						// "Search value is located at index + " + mid;
			}
			else if(searchVal<arr[mid]) {
				end=mid-1;
			}
			else if(searchVal>arr[mid]) {
				end=mid+1;
			}
		}
		
		System.out.println("\t\tBig O()= 1+1+n(1+6)\t"
				+ "=2+n(7)\t"
				+ "=2+7n\t"
				+ "=n(linear)\t");
		
		return -1;
				//"Number not found.......";
	}
}

 
