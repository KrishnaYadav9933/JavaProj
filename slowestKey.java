class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int [] duration = new int[releaseTimes.length];
        duration[0]=releaseTimes[0];
        for(int i=1; i<releaseTimes.length; i++){
            duration[i]=releaseTimes[i]-releaseTimes[i-1];
        }
        int max = duration[0];
        for(int i=1; i<releaseTimes.length; i++){
            if(duration[i]>max){
                max = duration[i];
            }
        }
        String ans="";
        for(int i=0; i<releaseTimes.length; i++){
            if(duration[i]==max){
                ans +=keysPressed.charAt(i);
            }
        }
        char maxLexico = ans.charAt(0);
        for(int i=1; i<ans.length(); i++){
            if((int)ans.charAt(i)>(int)maxLexico){
                maxLexico = ans.charAt(i);
            }
        }
        return maxLexico;

    }
}
