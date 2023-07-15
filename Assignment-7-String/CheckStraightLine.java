public class CheckStraightLine {
    public static boolean checkStraightLine(int[][] coordinates) {
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];
        
        // Calculate the initial slope
        double initialSlope = calculateSlope(x0, y0, x1, y1);
        
        for (int i = 2; i < coordinates.length; i++) {
            int xi = coordinates[i][0];
            int yi = coordinates[i][1];
            
            // Calculate the slope between current point and the first point
            double currentSlope = calculateSlope(x0, y0, xi, yi);
            
            // If the slope is not equal to the initial slope, return false
            if (currentSlope != initialSlope) {
                return false;
            }
        }
        
        return true;
    }
    
    private static double calculateSlope(int x1, int y1, int x2, int y2) {
        // Avoid division by zero
        if (x1 == x2) {
            return Double.POSITIVE_INFINITY;
        }
        
        return (double) (y2 - y1) / (x2 - x1);
    }
    
    public static void main(String[] args) {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}};
        
        boolean isStraightLine = checkStraightLine(coordinates);
        
        System.out.println("Do the points form a straight line? " + isStraightLine);
    }
}
