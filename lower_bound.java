class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int si=0;int ei=arr.length-1;
        int ans=arr.length;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(arr[mid]>=target){
                ans=mid;
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return ans;
    }
}
