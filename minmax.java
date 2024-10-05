public class minmax{
    public static void main(String[] args) {
        int[] arr = {5, 6, 89, -56, 22, 45, -98};
        int target= 22;
        System.out.println(linearSearch(arr, target, 1,5));

        
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }

        for(int i= start; i<end; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}