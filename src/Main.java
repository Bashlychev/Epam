public class Main {
        public static void main (String[] args) {
            int [] sortedArray = {20, 91, 64, 75, 19, 26, 48, 22, 50,92};
            int key = 20;
            int po
            printMaximumElement (arraySmall);

        }
 static void printMaximumElement (int[] array) {
            int max = array [0];
            int maxIndex = 0;
            int comparisons = 0;
            int replacements = 0;
            for (int i=0; i < array.length; i++) {
                if (array[i] > max){
                    max = array[i];
                    maxIndex = i;
                    replacements++;
                }
                comparisons++;
            }
            System.out.println("Max element: " + max);
            System.out.println("Max element index: " + maxIndex);
            System.out.println("Comparisons: " + comparisons);
            System.out.println("Replacements: " +replacements);
        }
    }