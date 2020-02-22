public class BinrayCalculator {
    String binaryAdd(String a, String b){
        int aa = Integer.parseInt(a, 2);
        int bb = Integer.parseInt(b, 2);
        return Integer.toString(aa+bb, 2);
    }
    String binarySubtract(String a, String b){
        int aa = Integer.parseInt(a, 2);
        int bb = Integer.parseInt(b, 2);
        return Integer.toString(aa-bb, 2);
    }
    String binaryMultiply(String a, String b){
        int aa = Integer.parseInt(a, 2);
        int bb = Integer.parseInt(b, 2);
        return Integer.toString(aa*bb, 2);
    }
    String binaryDivide(String a, String b) throws DivisonByZeroException {
        int aa = Integer.parseInt(a, 2);
        int bb = Integer.parseInt(b, 2);
        if(b.equals("0")){
            throw new DivisonByZeroException("Nulla!");
        }

        return Integer.toString(aa/bb, 2);
    }
}
