package Practice.Task_2;

public class Main {
    public static void main(String[] args) {
        Array[] arrays = new Array[]{
                new Array(3), new Array(3,5)
        };
        for (Array arr : arrays){
            System.out.println(arr.toString());
        }
        Array unite = Array.uniteArrays(arrays[0], arrays[1]);
        Array merge = Array.mergeArrays(arrays[0], arrays[1]);
        System.out.println(unite);
        System.out.println(merge);

        Array a = new Array(3);
        System.out.println(arrays[0].equals(a));
    }
}
