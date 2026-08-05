class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int x = image.length;
        for (int row = 0; row < x; row++) {
            int y = image[row].length;
            for (int col = 0; col < y/2; col++) {
                swap(image,row,col);
            }
            System.out.println(Arrays.deepToString(image));
        }

        for(int row=0 ; row<image.length ; row++){
            for(int col=0 ; col< image[row].length; col++){
                if (image[row][col]==0){
                    image[row][col]=1;
                }
                else{
                    image[row][col]=0;
                }
            }
        }
        return image;   
    }
    void swap(int[][] arr, int row, int col){
        int temp = arr[row][col];
        arr[row][col]=arr[row][arr[row].length-1-col];
        arr[row][arr[row].length-1-col]=temp;
    }
}