public class EuclideanDistance {
    // IPJ_3_1.4.3

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int sum = 0;
        double euclid;

        for(int i = 0; i < n; i++){
            arr1[i] = i*i;
            arr2[i] = i+i;
        }

        for(int i = 0; i < n; i++){
            sum = sum + (arr2[i]-arr1[i])*(arr2[i]-arr1[i]);
        }
        euclid = Math.sqrt((double)sum);
        System.out.print(euclid);
    }
}
