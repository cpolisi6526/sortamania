public class sorting {

    public static int binarySearch(int[] elements, int target) {
        int length = elements.length;
        int index =  (int)(elements.length/ 2);
        for (int x=0; x<elements.length; x++) {
            if (target == elements[index]) {
                return index;
            }
            else {
                if (target > elements[index]) {
                    index =  (int)(index / 2) + length;
                    length =  (int)(length / 2);
                }
                else {
                    index = (int)(index / 2);
                    length = (int) (length / 2);
                }
            }
        }
        return -1;
    }
}
