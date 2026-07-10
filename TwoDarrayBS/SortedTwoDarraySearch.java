public class SortedTwoDarraySearch {
    
    public static void main(String []args){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int target=5;
        int ans=search(arr,target);
        System.out.println(ans);
        }

    

    //return index if it exist
    //return -1 if it does not exist
    static int search(int [][]arr,int target){

        int row=arr.length;
        int col=arr[0].length;

       if(row==0){
        
       }
        return -1;
    }               
    
}
