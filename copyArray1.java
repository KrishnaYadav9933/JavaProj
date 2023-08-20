import java.util.Arrays;
class copyArray1{
    public static void main(String [] args){
        int [] marks = new int[]{2, 7, 4, 5,8};
        int DumyArr[]=new int[marks.length];
        int DumyArr1[]=new int[marks.length];
        DumyArr=Arrays.copyOf(marks,marks.length);
        DumyArr1=Arrays.copyOfRange(marks, 1, 3);
        System.out.println(Arrays.toString(DumyArr));
        System.out.println(Arrays.toString(DumyArr1));
    }
}