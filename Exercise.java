public class Exercise {
    public static void main(String[] args) throws Exception {

        char [][] mdArray = {{'1','1','1'},{'1','1','1'},{'1','1','1'}, {'1', '1', '1'}};

        // PATTERN 1
         System.out.println("Pattern1");
        //Outer loop
        for (int rows = 0; rows < mdArray.length; rows ++) {
             System.out.println(" ");
             System.out.print("Row " + rows +": ");

                 for (int columns = 0; columns < 3; columns++) {
                     // EVEN ROWS
                     if (rows % 2 != 0 ) {
                        System.out.print(mdArray[rows][columns] + " ");
                     }
                     // ODD ROWS
                     else if (rows % 2 == 0) {
                         System.out.print(" ");
                     }
                 }
             }

             
        System.out.println(" ");
        // PATTERN 2
        System.out.println(" ");
        System.out.println("Pattern2");
        //Outer loop
        for (int rows = 0; rows < mdArray.length; rows ++) {
             System.out.println(" ");
             System.out.print("Row " + rows +": ");
     
                 for (int columns = 0; columns < 3; columns++) {
                     // EVEN ROWS
                     if (rows % 2 != 0) {
                         System.out.print(" ");
                     }
                     // ODD ROWS
                     else if (rows % 2 == 0 ) {
                         System.out.print(mdArray[rows][columns] + " ");
                     }
                 }
             }


        System.out.println(" ");
        // PATTERN 3
        System.out.println(" ");
        System.out.println("Pattern3");
        for (int rows = 0; rows < mdArray.length; rows ++) {
             System.out.println(" ");
             System.out.print("Row " + rows +": ");
                for (int columns = 0; columns < 3; columns++) {
                    if (rows == 0 || rows == 3) {
                        System.out.print(mdArray[rows][columns] + " ");
                    }
                    else if (rows == 1 || rows == 2) {
                        System.out.print(" ");
                    }

                    if (columns == 0 || columns == 2) {
                        System.out.print(" ");
                    }
                    else if (rows == 1 || rows == 2 && columns == 1) {
                        System.out.print(mdArray[rows][columns] + " ");
                    }
                }
            }


        System.out.println(" ");
        // PATTERN 4
        System.out.println(" ");
        System.out.println("Pattern4");
        for (int rows = 0; rows < mdArray.length; rows ++) {
            System.out.println(" ");
            System.out.print("Row " + rows +": ");
                for (int columns = 0; columns < 3; columns++) {
                    if (rows == 1 || rows == 3) {
                        System.out.print(mdArray[rows][columns] + " ");
                    }
                    else if (rows == 0 || rows == 2) {
                        System.out.print(" ");
                    }
    
                    if (columns == 0 || columns == 2) {
                        System.out.print(" ");
                    }
                    else if (rows == 0 || rows == 2 && columns == 1) {
                        System.out.print(mdArray[rows][columns] + " ");
                    }
                }
            }


        System.out.println(" ");
        // PATTERN 5
        System.out.println(" ");
        System.out.println("Pattern5");
        int [][] mdArray2 = {{1,1,1},{1,1,1},{1,1,1}, {1, 1, 1}};

        int sum = 0;
        for (int rows = 0; rows < mdArray.length; rows ++) {

            for (int columns = 0; columns < 3; columns ++) {
                sum += mdArray2[rows][columns];
            }
        }
        System.out.println(sum);
    }

}
