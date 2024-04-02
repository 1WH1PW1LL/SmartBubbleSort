/*
This is my SmartBubbleSort.
 */

public class SmartBubbleSort {
    public static void main(String[] args) {
        char[] input1 = {'c','b','n','r','v','f','z','a','A','G','b'};
        System.out.println(SmartBubbleSort(input1));
    }

    public static char[] SmartBubbleSort(char[] input)
    {
        int length = input.length;
        char storage1;
        for(int count1 = 0; count1 < length; count1++)
        {
            for(int count2 = 0; count2+1 < length; count2++)
            {
                if (input[count2] > input[count2+1]) {
                    storage1 = input[count2];
                    input[count2] = input[count2+1];
                    input[count2+1] = storage1;
                }
            }
        }
        return input;
    }
}
