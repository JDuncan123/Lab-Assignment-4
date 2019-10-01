
public class Sorter {
	public int[] bubbleSort(int arr[],int arrSize) {
		int index,temp,num,swap;
		swap=1;
		index=0;
		arrSize=5;
		
		while(index<arrSize && swap==1){
			swap=0;
			num=arrSize-1;
			while(num>index) {
				if (arr[num]<arr[num-1]) {
					temp=arr[num-1];
					arr[num-1]=arr[num];
					arr[num]=temp;
					swap=1;
				}
				num--;
			}
			index++;
		}
	
		
		return arr;
	}
	
	public int[] selectionSort(int arr[],int arrSize) {
		int index=0,smallest,temp,num;
		arrSize=5;
		while(index<arrSize) {
			smallest=index;
			num=index+1;
			while(num<arrSize) {
				if(arr[num]<arr[smallest]) {
					smallest=num;					
				}
				num++;
			}
			temp=arr[index];
			arr[index]=arr[smallest];
			arr[smallest]=temp;
			index++;
		}
		return arr;
	}
	
	public int[] insertionSort(int arr[],int arrSize) {
		int index,num,temp;
		//arrSize=5;
		index=1;
		
		while(index<arrSize) {
			temp=arr[index];
			num=index;
			while(num>0 && temp<=arr[num]) {
				arr[num]=arr[num-1];
				num--;
			}
			arr[num]=temp;
			index ++;
		}
		return arr;
	}

}
