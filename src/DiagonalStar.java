public class DiagonalStar {
    public static void printSquareStar(int number) {
        if(number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        int rowCount = number;
        int columnCount = number;

        for(int currentRow = 0; currentRow < rowCount; currentRow++) {
            for(int currentColumn = 0; currentColumn < columnCount; currentColumn++) {
                if(currentRow == 0 || currentRow == (rowCount - 1)
                    || currentColumn == 0 || currentColumn == (columnCount - 1)
                    || currentRow == currentColumn || currentColumn == (rowCount - currentRow - 1)) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printSquareStar(5);
        System.out.println();
        System.out.println();

        printSquareStar(6);
        System.out.println();
        System.out.println();

        printSquareStar(7);
        System.out.println();
        System.out.println();

        printSquareStar(8);
        System.out.println();
        System.out.println();

        printSquareStar(4);
    }
}
