    public static int[] intarrIndexRemove(int[] arr, int index) {
        int[] result = new int[arr.length-1]; int index2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (index != i) {
                result[index2] = arr[i];
                index2++;
            }
        }
        return result;
    }
