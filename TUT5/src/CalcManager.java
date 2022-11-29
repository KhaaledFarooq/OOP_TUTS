class CalcManager {
    public static boolean isEven(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }
    public static int cube(int n) {
        return n*n*n;
    }
    // ... - It means that zero or more int objects (or a single array of them) may be passed as the argument(s) for that method
    public static double add(double...x) {
        double sum = 0.0;
        for (double e : x)
            sum = sum + e;
        return sum;
    }
}
