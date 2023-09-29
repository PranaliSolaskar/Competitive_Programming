maxa=arr[00],arr[0,n-1],arr[n-1,n-1],arr[n-1,0];
maxb=arr[0,1],arr[0,n-2],arr[n-1,n-2],arr[n-1,1]
maxc=arr[1,0],arr[n-2,0],arr[0,n-2],arr[n-]

public static int maximizeUpperLeftSum(int[][] matrix) {
        int n = matrix.length / 2; // n is half of the matrix size

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                
                int maxVal = Math.max(
                        Math.max(matrix[row][col], matrix[2 * n - 1 - row][col]),
                        Math.max(matrix[row][2 * n - 1 - col], matrix[2 * n - 1 - row][2 * n - 1 - col])
                );

                matrix[row][col] = maxVal;
                matrix[2 * n - 1 - row][col] = maxVal;
                matrix[row][2 * n - 1 - col] = maxVal;
                matrix[2 * n - 1 - row][2 * n - 1 - col] = maxVal;
            }
        }

        
        int sum = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                sum += matrix[row][col];
            }
        }

        return sum;
    }