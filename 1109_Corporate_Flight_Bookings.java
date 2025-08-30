class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] tempPrefixSum = new int[n + 1];

        for(int[] booking : bookings) {
            int fromFlight = booking[0];
            int toFlight = booking[1];
            int seatsBooked = booking[2];
            tempPrefixSum[fromFlight - 1] += seatsBooked;
            tempPrefixSum[toFlight] += -seatsBooked;
        }
        
        int[] prefixSum = new int[n];
        prefixSum[0] = tempPrefixSum[0];
        for(int i = 1; i < prefixSum.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + tempPrefixSum[i];
        }
        return prefixSum;
    }
}
