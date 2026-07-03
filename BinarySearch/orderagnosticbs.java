package BinarySearch;

public class orderagnosticbs {
    public static void main(String[] args){
        int arr[]={9,8,7,6,5,4,3,2,1};
        int target=3;
        int ans=orderAgnosticBS(arr,target);
        System.out.println(ans);

    }

    static int orderAgnosticBS(int arr[],int target){
        int start = 0;
		int end =arr.length-1;

        //finding wether the array is sorted in ascending or descending order
        boolean isAsc=arr[start]<arr[end];
        // if(arr[start]<arr[end]){
        //     isAsc=true;
        // }
        // else{
        //     isAsc=false;
        // }





		while(start<=end){
			//finding middle element
			int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }

            if(isAsc){
                
			if(target<arr[mid]){
				end=mid-1;
			}
			else if(target>arr[mid]){
				start=mid+1;

			}
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }



			
		
		
		}
		return -1;
	

    }

    
}
