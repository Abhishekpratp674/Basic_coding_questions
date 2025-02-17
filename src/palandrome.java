//check the array is palandrone or not !
public class palandrome {
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        boolean ans = true;
        int i =0;
        int j = arr.length-1;
        while (i < j) {
            if (arr[i] != arr[j]){
                ans = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(ans);
    }
}
