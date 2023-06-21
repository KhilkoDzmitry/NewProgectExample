import java.util.Arrays;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
threeDimensionalArray();
    }
    public static void threeDimensionalArray()
    {
        int[][][] threeDimensionalArray = new int[][][]{
                {
                        {1,10,11}
                },
                {
                        {10},
                        {-5,10,15,4}

                },
                {
                        {1},
                        {1,2},
                        {1,2,3,4},
                        {0}
                }

        };
        System.out.println(Arrays.deepToString(threeDimensionalArray));

        System.out.println();

        System.out.println("Please, enter any integer number: ");
        int value=cin().nextInt();

        for (int outer=0; outer < threeDimensionalArray.length; outer++)
        {
            for (int middle=0; middle < threeDimensionalArray[outer].length; middle++)
            {
                for (int inner=0; inner<threeDimensionalArray[outer][middle].length; inner++)
                {
                    threeDimensionalArray[outer][middle][inner]+=value;
                }
            }
        }
        System.out.println();
        System.out.println(Arrays.deepToString(threeDimensionalArray));
    }
public static Scanner cin()
        {
        return new Scanner(System.in);
    }

}
