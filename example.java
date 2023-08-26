public class example {
    static char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = releaseTimes[0];
        String index = "0";
        for(int i=1; i<releaseTimes.length; i++){
            if(releaseTimes[i]-releaseTimes[i-1]>max){
                index = "i";
            }
            else if(releaseTimes[i]-releaseTimes[i-1]==max){
                index +="i";
            }
        }
       char maxLexico=keysPressed.charAt(Integer.parseInt((String.valueOf(index.charAt(0)))));
        for(int i=1; i<index.length(); i++){
            if((int)index.charAt(i)>(int)maxLexico){
                maxLexico = index.charAt(i);
            }
        }
        return maxLexico;
    }

    public static void main(String[] args) {
        int [] R ={11, 34, 43, 59, 62, 80, 83, 92, 97};
        String K ="qgkzzihfc";
        System.out.println(slowestKey(R, K));
    }


}
