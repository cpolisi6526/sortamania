public class runner {
    public static void main(String[] args)
    {
        int[] arr1 = {-20, 3, 15, 81, 432};

        // test when the target is in the middle
        int index = sorting.binarySearch(arr1,15);
        System.out.println(index);

        // test when the target is the first item in the array
        index = sorting.binarySearch(arr1,-20);
        System.out.println(index);

        // test when the target is in the array - last
        index = sorting.binarySearch(arr1,432);
        System.out.println(index);

        // test when the target is not in the array
        index = sorting.binarySearch(arr1,53);
        System.out.println(index);
    }
}


