public class multiarraybs {


    public static void main(String []args){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int target=5;
        int ans=search(arr,target);
        System.out.println(ans);
        }

    

    //return index if it exist
    //return -1 if it does not exist
    static int search(int arr[][],int target){

        int row=0;
        int col=arr.length-1;

        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                System.out.println("row:"+row+" col:"+col);
                return 1;
            }
            else if(arr[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
        return -1;
    }
}
