public class RectangularMatrix {
    // IPJ_3_1.4.18

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int x = Integer.parseInt(args[2]);
        int y = Integer.parseInt(args[3]);
        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[x][y];
        int dot = 0;

        if(m != x) System.out.print("error incompatible array dimensions");
        else{
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    arr1[i][j] = i+j;
                }
            }

            for(int i = 0; i < x; i++){
                for(int j = 0; j < y; j++){
                    arr2[i][j] = i-j;
                }
            }

            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    for(int k = 0; k < x; k++){
                        for(int l = 0; l < y; l++){
                            dot = dot + (arr1[i][j]*arr2[k][l]);
                        }
                    }

                }
            }
            System.out.print(dot);
        }
    }
}
