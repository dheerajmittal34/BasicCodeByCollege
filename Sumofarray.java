public class Sumofarray {

    // Recursive function to sum array elements
    public static int sumTreasure(int[] boxes, int index) {
        if (index == boxes.length) {
            return 0; 
        }

        return boxes[index] + sumTreasure(boxes, index + 1);
    }

    public static void main(String[] args) {
        int[] treasureBoxes = {5, 10, 20, 15}; 
        int totalTreasure = sumTreasure(treasureBoxes, 0);
        System.out.println(totalTreasure);
    }
}
