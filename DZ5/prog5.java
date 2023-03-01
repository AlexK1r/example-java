package DZ5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

// Учитывая два целочисленных массива nums1 и nums2, верните максимальную 
// длину подмассива, который появляется в обоих массивах.
// Example 1:
// Input: nums1 = [1,2,3,2,1], nums2 = [3,2,1,4,7]
// Output: 3
// Explanation: Повторяющийся подмассив с максимальной длиной равен [3,2,1].

// Example 2:
// Input: nums1 = [0,0,0,0,0], nums2 = [0,0,0,0,0]
// Output: 5
// Explanation: Повторяющийся подмассив с максимальной длиной равен [0,0,0,0,0].

public class prog5 {    
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 1, 4, 7};
        Example(a, b);
        int[] c = {0, 0, 0, 0, 0, 0};
        int[] d = {0, 0, 0, 0, 0, 0};
        Example(c, d);
    }
    private static void Example(int[] nums1, int[] nums2) {        
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        findMaxSubArray(nums1, nums2);
        System.out.println();
    } 
    private static void findMaxSubArray(int[] nums1, int[] nums2) {
        HashSet<ArrayList<Integer>> temp1 = getAllSet(nums1);  // получаем множества
        HashSet<ArrayList<Integer>> temp2 = getAllSet(nums2);  // подмассивов каждого входного массива
        temp2.retainAll(temp1); // находим совпадения 
        int max = 0;
        for (ArrayList<Integer> item : temp2) { // находим самы большой размер подмассива
            if (max < item.size()) {
                max = item.size();
            }
        }
        System.out.printf("Output: %d\n", max);
        ArrayList<ArrayList<Integer>> resultArrays = new ArrayList<>();
        for (ArrayList<Integer> item : temp2) { // сохраняем найденные подмассивы с список
            if (max == item.size()) {
                resultArrays.add(item);
            }
        }        
        System.out.println(resultArrays);
    }
    //Разбивка исходного массива на простые
    private static HashSet<ArrayList<Integer>> getAllSet(int[] array) {
        HashSet<ArrayList<Integer>> temp = new HashSet<>();
        for (int n = 1; n < array.length+1; n++) {
            for (int i = 0; i < array.length; i++) {
                ArrayList<Integer> tempArray = new ArrayList<>();
                int end = Math.min(i + n, array.length);
                for (int j = i; j < end; j++) {
                    tempArray.add(array[j]);
                }
                temp.add(tempArray);
            }
        }
        return temp;
    }    
}