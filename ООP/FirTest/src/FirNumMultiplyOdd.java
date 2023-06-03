public class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;

        for (int i = 3; i <= n; i++) {
            if (i % 2 == 0) continue;
            result *= i;
//            if (i % 2 != 0) {
//                result *= i;
//            }
        }
        return result;
    }
}
