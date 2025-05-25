class P2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            // Print spaces
            for (int space = 4; space > i; space--) {
                System.out.print(" ");
            }
            // Print stars
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }
            // Move to the next line
            System.out.println();
        }
    }
}

//       *
//     * *
//   * * *
// * * * *