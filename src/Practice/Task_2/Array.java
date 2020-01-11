package Practice.Task_2;

public class Array {
    private int[] arr;

    public Array(int n) {
        this(n, 0);
    }

    public Array(int n, int k){
        arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = k;
        }
    }

    public Array(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public int maxElem(){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static Array uniteArrays(Array array1, Array array2){
        int[] arr = array1.getArr();
        int l1 = arr.length;
        int[] arr2 = array2.getArr();
        int l2 = arr2.length;

        int[] unitedArr = new int[l1 + l2];
        int freeIndex = 0;
        for (int i = 0; i < l1; i++){
            unitedArr[freeIndex] = arr[i];
            freeIndex++;
        }
        for (int i = 0; i < l2; i++){
            unitedArr[freeIndex] = arr2[i];
            freeIndex++;
        }
        return new Array(unitedArr);
    }

    public static Array mergeArrays(Array array1, Array array2){
        int[] arr = array1.getArr();
        int[] arr2 = array2.getArr();
        int maxInt = Math.max(array1.maxElem(), array2.maxElem());
        int[] intMap = new int[maxInt + 1];
        for (int i = 0; i < arr.length; i++){
            int count = intMap[arr[i]];
            if (count == 0) {
                intMap[arr[i]]++;
            }
        }
        for (int i = 0; i < arr2.length; i++){
            int count = intMap[arr2[i]];
            if (count > 0) {
                intMap[arr[i]]++;
            }
        }

        Array result = new Array(0);
        for (int i = 0; i < intMap.length; i++){
            int count = intMap[i];
            if (count > 1){
                Array a = new Array(count, i);
                result = uniteArrays(result,a);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "Array : {";
        for (int i = 0; i < arr.length; i++){
            result += arr[i];
            if (i < arr.length - 1){
                result += " , ";
            }
        }
        result += "}\n";
        result += "Max elem : " + (arr.length > 0 ? maxElem() : '-');
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Array){
            Array array = (Array) obj;
            int[] arr2 = array.getArr();
            for (int i = 0; i < arr.length; i++){
                if (arr[i] != arr2[i]){
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
