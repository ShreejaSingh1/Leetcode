class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=firstOccurence(nums,target);
        int last=lastOccurence(nums,target);
        int arr[]=new int[2];
        arr[0]=first;
        arr[1]=last;
        return arr;
    }
    public int firstOccurence(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public int lastOccurence(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }

}