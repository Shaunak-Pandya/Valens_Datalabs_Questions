public class LeftRotate {


    static int[] rotateLeft(int[] a, int d) {

        for(int i=0;i<d;i++)
        {
            int lastValue=a[0];
            for(int j=0;j<a.length;j++)
            {
                if(j==(a.length-1))
                {
                    a[a.length-1]=lastValue;
                }
                else
                {
                    a[j]=a[j+1];
                }

            }
        }


        return a;
    }

    public static void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i<arr.length; i++) {
            sb.append(arr[i]);
            if(i != arr.length-1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {

        printArray(rotateLeft(new int[]{0, 1, 2, 3}, 2)); //my tested array

        printArray(rotateLeft(new int[]{0, 1, 2, 3}, 2));

        printArray(rotateLeft(new int[]{5, 4, 3, 2, 1}, 5));

        printArray(rotateLeft(new int[]{3, 2, 1}, 4));

    }
}
