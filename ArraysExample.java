public class ArraysExample {
    public static void main(String[] args) {
        int[][] twoDimen = {{11, 12}, {14, 15}};
        int sum = 0;

        // Calculate sum of 2D array
        for (int i = 0; i < twoDimen.length; i++) {
            for (int j = 0; j < twoDimen[i].length; j++) {
                sum += twoDimen[i][j];
            }
        }
        System.out.println("Sum of elements in twoDimen: " + sum);

                MaxIn3DArray();
    }

    public static void MaxIn3DArray() {
        int[][][] threeDimen = {
            {{11, 12, 13}, {14, 15, 16}},
            {{17, 18, 19}, {20, 21, 22}}
        };

        int max = threeDimen[0][0][0]; 

        
        for (int i = 0; i < threeDimen.length; i++) {
            for (int j = 0; j < threeDimen[i].length; j++) {
                for (int k = 0; k < threeDimen[i][j].length; k++) {
                    if (threeDimen[i][j][k] > max) {
                        max = threeDimen[i][j][k];
                    }
                }
            }
        }

        System.out.println("Maximum value in threeDimen: " + max);
    }
}
