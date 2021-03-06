package ArrayUtils;

import java.util.ArrayList;
import java.util.Random;

/**
 * This class contains utility methods for array manipulation.
 */
public class ArrayUtil
{
    private static Random generator = new Random();

    /**
     * Creates an array filled with random values.
     *
     * @param length the length of an array
     * @param n      the number of possible random values
     * @return an array filled with length numbers between 0 and n - 1
     */
    public static Integer[] randomIntArray(int length, int n)
    {
        Integer[] a = new Integer[length];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = generator.nextInt(n);
        }
        return a;
    }

    /**
     * Creates an array list filled with random values.
     *
     * @param length the length of an array
     * @param n      the number of possible random values
     * @return an array filled with length numbers between 0 and n - 1
     */
    public static ArrayList<Integer> randomSequenceOfNumbers(int length, int n)
    {
        ArrayList<Integer> a = new ArrayList<>(length);
        for (int i = 0; i < length; i++)
        {
            a.add(generator.nextInt(n));
        }
        return a;
    }

    /**
     * Swaps two entries of an array.
     *
     * @param a the array
     * @param i the first position to swap
     * @param j the second position to swap
     */
    public static <T> void swap(T[] a, int i, int j)
    {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * Gets the ordered sequence of integers.
     *
     * @param start the first number in the list
     * @param end   the last number in the list
     * @return ordered array list of integers
     */
    public static ArrayList<Integer> sequenceOfNumbers(int start, int end)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = start; i < end; i++)
        {
            result.add(i);
        }
        return result;
    }

    /**
     * Gets lexicographically ordered list of unicode characters as a strings.
     *
     * @param start first character
     * @param end last character
     * @return lexicographically sorted array list of strings
     */
    public static ArrayList<String> sequenceOfStrings(char start, char end)
    {
        ArrayList<String> result = new ArrayList<>();
        for (char i = start; i <= end; i++)
        {
            String s = String.valueOf(i);
            result.add(s);
        }
        return result;
    }

    /**
     * Gets randomized list of unicode characters as a strings.
     *
     * @param min minimum desired value of unicode character
     * @param max maximum desired value of unicode character
     * @return randomized array list of strings
     */
    public static ArrayList<String> randomSequenceOfStrings(int min, int max)
    {
        ArrayList<String> result = new ArrayList<>();
        for (int i = min; i < max; i++)
        {
            int ch = generator.nextInt((max - min) + 1) + min;
            String str = String.valueOf((char) ch);
            result.add(str);
        }
        return result;
    }
}
