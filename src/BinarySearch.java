public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {19, 20, 26, 48, 55, 64, 75, 89, 91};
        int key = 20;
        int position = binarySearch(sortedArray, key);
        System.out.println(key + "position in" + position);

    }

    static int binarySearch(int[] array, int key) {
        int position = 0; // индекс ключа, изначально принимаем за 0. потом перезапишем
        int left = 0;
        int right = array.length - 1; // правые принимается за -1, т.к массивы нумеруются с нуля (всего 9)

        while (left <= right) {
            int middle = (left + right) / 2; // будет 55, т.к массив делим пополам (8) и считаем 4, с нуля (5 шагов)
            if (array[middle] == key) {
                System.out.println("Key Found");
                return middle;
            }
            if (array[middle] < key) {
                System.out.println("Cut left half");
                left = middle + 1;
            }

            if (array[middle] > key) {
                System.out.println("Cut right half");
                right = middle - 1; // теперь 48 является правой частью массива (55 уже проверили).
            }
        }
        return -1; // В случае если элемента в массиве нет, мы просто в конце вайла сузимся до 0 отрезка и наш закончится, -1 значит элемент не найден
    }
}

