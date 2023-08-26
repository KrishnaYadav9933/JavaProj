import java.util.Arrays;

public class duplicate {
    public static void main(String[] args) {
        String str ="bcdebcdfgh";

        char [] Arr = str.toCharArray();
        Arrays.sort(Arr);
        System.out.println(Arr);
        boolean flag = false;
        for(int i=1; i<Arr.length; i++){
            if(Arr[i]==Arr[i-1]){
               flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println("repetition");
        }
        else{
            System.out.println("not repetition");
        }
    }
}
