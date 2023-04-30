import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_01 {
    public static void main(String[] args) {
        int[] arr = {54, 12, 38, 21, 59, 34, 76, 2, 6, 76, 12, 65};
        int n = arr.length;


        Logger logger = Logger.getLogger("BubbleSortLog");
        FileHandler fh;

        try {
            fh = new FileHandler("BubbleSort.log");
            logger.addHandler(fh);

            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {

                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;

                        logger.log(Level.INFO, "Iteration " + (i + 1) + ", swap " + arr[j] + " and " + arr[j+1] + ": " + Arrays.toString(arr));
                    }
                }
            }

            logger.log(Level.INFO, "Sorted array: " + Arrays.toString(arr));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

