class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int high =0;
        int low = 0;
        for( int i = 0; i<weights.length; i++) {
            low = Math.max(low, weights[i]);
            high += weights[i];
        }
        
        while(low <= high) {
            int mid = (high+low)/2;
            int reqTime = daysReq(weights , mid);
            if(reqTime <= days) {
                high = mid -1;
            }
            else {
                low = mid+1;
            }
        }
        return low;
    }

    public int daysReq (int arr[], int cap) {
        int day=1;
        int load =0; 
        for(int i = 0; i<arr.length; i++) {
            if(load + arr[i] > cap) {
                day = day+1;
                load = arr[i];
            }
            else{
                load += arr[i];
            }
        }
        return day;
    }
}
