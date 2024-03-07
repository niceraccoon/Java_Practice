package RemainderOfDevision;

/*
 On Christmas Eve, there were three flowers on the windowsill, from left to right: geranium, crocus, and violet.
 Every morning, Masha wiped the window and swapped the flower on the right with the central flower.
 And every evening, Tanya watered the flowers and swapped the left and central flowers.
 It is required to determine the order of flowers at night after K days.

 Input:
 The input file INPUT.TXT contains a natural number K - the number of days (K ≤ 1000).

 Output:
 In the output file OUTPUT.TXT, you need to output three English letters: "G", "C", and "V" (capital letters without spaces),
 describing the order of colors on the window after K days (from left to right). Denotations: G - geranium, C - crocus, V - violet.
 */

import java.util.*;

public class RearrangingFlowerPots {
    public static void main(String[] args) {
        String a = "VGC";
        String b = "CVG";
        String c = "GCV";

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        scanner.close();

        if (day % 3 == 0) {
            System.out.println(c);
        }
        else if (day % 3 == 1){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }

    }
}
