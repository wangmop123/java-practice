
public class SumColumns {
    public static void main(String[] args) {

        int a[] = { 2, 3, 8, 12 };
        int b[] = { 3, 3, 4, 3, 4, 4 };

        int[] summedColumns = sumColumns(a, b);

        System.out.println("Summed columns:");
        for (int value : summedColumns) {
            System.out.println(value);
        }
    }

    public static int[] sumColumns(int[] col1, int[] col2) {
        int maxLength;
        if (col1.length > col2.length) {
            maxLength = col1.length;
        } else {
            maxLength = col2.length;
        }

        int[] summed = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            if (i < col1.length) {
                summed[i] = summed[i] + col1[i];
            }
            if (i < col2.length) {
                summed[i] = summed[i] + col2[i];
            }
        }

        return summed;
    }
}
