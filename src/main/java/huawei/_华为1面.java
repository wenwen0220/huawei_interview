package huawei;

/**
 * Created by jww on 2020/10/31.
 * Describe
 * 求2个正整数的最大公约数跟最小公倍数
 *
 */
public class _华为1面 {
    public static void main(String[] args) {

        System.out.println(getNum(15, 27));
        System.out.println(getNums(15, 27));

    }

    public static int getNum(int m, int n) {

        int bigger = Math.max(m, n);
        int smaller = Math.min(m, n);

        if (smaller == 0 || bigger % smaller == 0) {
            return smaller;
        }
        int start = bigger % smaller;

        int next = start % smaller;

        while (start > 1) {
            if (next % start == 0) {
                if (bigger % next != 0) {
                    return getNum(smaller, next);
                }
                return next;
            }
            int temp = start;
            start = next % start;
            next = start;
        }
        return start;
    }

    public static int getNums(int m, int n) {
        if (getNum(m, n) == 0) return 0;
        return m * n / getNum(m, n);
    }

    /**
     * 标准解法。
     */
    public static void function2(){
        int m=35;
        int n=49;

        int j = m * n;
        if (n > m) {
            int temp = m;
            m = n;
            n = temp;
        }
        //最大公约数
        while (n != 0) {
            int r = m % n;
            m = n;
            n = r;
        }
        System.out.println(m);
        int max = j / m;
        System.out.println(max);
    }
}
