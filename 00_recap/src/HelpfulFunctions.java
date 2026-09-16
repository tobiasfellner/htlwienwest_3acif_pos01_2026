import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelpfulFunctions {
    public static void main(String[] args) {
        String base = "       htl,wien, West,   3ACIF";
        String[] result = base
                //.trim()
                .replace(" ", "")
                .replace("htl", "Höhere Technische Lehranstalt")
                .split(",");

        String input = "1234";
        int inputAsDigit = 0;
        if(input.matches("\\d*")){
            System.out.println("input ist eine Zahl");
            inputAsDigit = Integer.parseInt(input);
        }

        System.out.println(inputAsDigit * 2);

        String[] strArr = {"Hello", "HTL", "Wien", "West"};
        String[] strArr3 = Arrays.copyOf(strArr,3);
        String newStr = String.join("-", strArr);
        System.out.println(newStr);

        // Array resizing
        int[] intArr =  new int[3];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        intArr = resize(intArr, 4);
        intArr[3] = 4;

        intArr = Arrays.copyOf(intArr, 6);

        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 0; i < intArr.length; i++) {
            intList.add(intArr[i]);
        }

        intList.clear();
    }

    public static int[] resize(int[] old, int newLength){
        int[] newArr = new int[newLength];
        for (int i = 0; i < old.length; i++) {
            newArr[i] = old[i];
        }
        return newArr;
    }
}
