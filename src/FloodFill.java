public class FloodFill {

    private static void fillTop(int[][] image, int sr, int sc, int srcColor, int targetColor) {
        if(sr <= 0 || image[sr-1][sc] == targetColor) {
            return;
        }
        if(image[sr-1][sc] == srcColor) {
            image[sr-1][sc] = targetColor;
            floodFillHelper(image, sr-1, sc, targetColor, srcColor);
            //fillTop(image, sr-1, sc, srcColor, targetColor);
        }
    }
    private static void fillBottom(int[][] image, int sr, int sc, int srcColor, int targetColor) {
        if(sr >= image.length-1 || image[sr + 1][sc] == targetColor) {
            return;
        }
        if(image[sr+1][sc] == srcColor) {
            image[sr+1][sc] = targetColor;
            floodFillHelper(image, sr+1, sc, targetColor, srcColor);
            //fillTop(image, sr+1, sc, srcColor, targetColor);
        }
    }
    private static void fillRight(int[][] image, int sr, int sc, int srcColor, int targetColor) {
        if(sc >= image[0].length-1 || image[sr][sc+1] == targetColor) {
            return;
        }
        if(image[sr][sc+1] == srcColor) {
            image[sr][sc+1] = targetColor;
            floodFillHelper(image, sr, sc+1, targetColor, srcColor);
            //fillTop(image, sr, sc+1, srcColor, targetColor);
        }
    }
    private static void fillLeft(int[][] image, int sr, int sc, int srcColor, int targetColor) {
        if(sc <= 0 || image[sr][sc-1] == targetColor) {
            return;
        }
        if(image[sr][sc-1] == srcColor) {
            image[sr][sc-1] = targetColor;
            floodFillHelper(image, sr, sc-1, targetColor, srcColor);
            //fillTop(image, sr, sc-1, srcColor, targetColor);
        }
    }

    private static void floodFillHelper(int[][] image, int sr, int sc, int color, int srcColor) {
        fillTop(image, sr, sc, srcColor, color);
        fillBottom(image, sr, sc, srcColor, color);
        fillRight(image, sr, sc, srcColor, color);
        fillLeft(image, sr, sc, srcColor, color);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int srcColor = image[sr][sc];
        image[sr][sc] = color;

        floodFillHelper(image, sr, sc, color, srcColor);


        return image;
    }
}