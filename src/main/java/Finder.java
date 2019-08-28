public class Finder {

    public Integer findMax(int[] intArray) {
        int max;
        Integer maxInteger = null;

        if (intArray == null || intArray.length == 0) {
            return null;
        }

        max = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }

        maxInteger = new Integer(max);
        return maxInteger;
    }

    public Integer findMin(int[] intArray) {
        int min;
        Integer minInteger = null;

        if (intArray == null || intArray.length == 0) {
            return null;
        }

        min = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }

        minInteger = new Integer(min);
        return minInteger;
    }
}
