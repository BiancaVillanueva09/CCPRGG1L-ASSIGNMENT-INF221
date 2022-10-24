public class App {
    public static void main(String[] args) throws Exception {

        char [][] mdArray = {{'1','1','1'},{'1','1','1'},{'1','1','1'}, {'1', '1', '1'}};
    

        // PATTERN 1
        //Outer loop
        for (int rows = 0; rows < mdArray.length; rows ++) {
            System.out.println(" ");
            System.out.print("Row " + rows +": ");

                for (int columns = 0; columns < mdArray.length; columns++) {
    
                    // EVEN ROWS
                    if (rows % 2 == 0 && (columns == 0 || columns == 2)) {
                        System.out.print(mdArray[rows][columns]);
                    }
                    // ODD ROWS
                    else if (rows % 2 != 0 && columns == 1) {
                        System.out.print(mdArray[rows][columns]);
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
            }

            //Inner loop
            //for (int columns = 0; columns < 3; columns ++) {
                //System.out.print(mdArray[rows][columns] + " ");
                }  
            //}
        //System.out.println("1. PATTERN 1");
        // PATTERN 2
        //System.out.println("2. PATTERN 2");
        // PATTERN 3
        //System.out.println("3. PATTERN 3");
        // PATTERN 4
        //System.out.println("4. PATTERN 4");
        // PATTERN 5
        //System.out.println("5. PATTERN 5");
        // Get the SUM
        //System.out.println("6. SUM");
    
        }
    //}
