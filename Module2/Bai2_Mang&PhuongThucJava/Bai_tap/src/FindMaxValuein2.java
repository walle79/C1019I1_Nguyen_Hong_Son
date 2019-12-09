public class FindMaxValuein2 {
    public static void main(String[] args) {
        System.out.println("Mảng khởi tạo là: ");
        int[][] array = {
                {8, 2, 5, 4},
                {52, 26, 13, 18},
                {19, 25, 21, 12}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        int indexRow = 1;
        int indexCol = 1;
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            indexRow = i;
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]>max){
                    max = array[i][j];
                    indexCol = j + 1;
                }
            }
        }
        System.out.println("Max = " + max + " at " + indexRow + " and " + indexCol);




    }

}
