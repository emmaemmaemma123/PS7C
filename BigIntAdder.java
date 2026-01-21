import java.util.ArrayList;
public class BigIntAdder {
    public static int[] add(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> num = new ArrayList<>();
        int i = a.size()-1;
        int x = b.size()-1;
        int carry = 0;
        while (i>=0 || x>=0 || carry>0) {
            int digitA = (i>=0) ? a.get(i) : 0;
            int digitB = (x>=0) ? b.get(x) : 0;

            int sum = digitA + digitB + carry;
            num.add(0, sum%10);
            carry = sum/10;
            
            i--;
            x--;
        }
        
        int[] result = new int[num.size()];
        for (int k = 0; k < num.size(); k++) {
            result[k] = num.get(k);
        }
        return result;
    }
}