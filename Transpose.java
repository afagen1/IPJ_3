public class Transpose {
    // IPJ_3_1.4.14

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[][] arr1 = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr1[i][j] = (2*i) + (3*j);
            }
        }
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1.length; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int[][] arr2 = new int[arr1.length][arr1.length];
        int x;
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1.length; j++){
                arr2[i][j] = arr1[j][i];
            }
        }
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < arr2.length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
