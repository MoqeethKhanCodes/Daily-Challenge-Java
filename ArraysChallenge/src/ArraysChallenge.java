public class ArraysChallenge {
    public static void main(String[] args) {
        int [] givenArray = {50, 25, 80, 5, 15};

        for (int i = 0; i < givenArray.length; i++) {

            for (int j = i + 1; j < givenArray.length; j++)
                if(givenArray[i] < givenArray[j]) {
                    swap(givenArray, i, j);
                }
        }

        for(int i : givenArray) {
            System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
    public static void swap1(int[] arr, int first, int second) {
        arr[first] = arr[first] + arr[second]; //30
        arr[second] = arr[first] - arr[second];//10
        arr[first] = arr[first] - arr[second];//20

    }
    public static void swap2(int[] arr, int first, int second) {
        arr[first] = arr[first] * arr[second]; //30
        arr[second] = arr[first] / arr[second];//10
        arr[first] = arr[first] / arr[second];//20

    }
    public static void swap3(int[] arr, int first, int second) {
        arr[first] = arr[first] ^ arr[second];
        arr[second] = arr[first] ^ arr[second];
        arr[first] = arr[first] ^ arr[second];

    }


}