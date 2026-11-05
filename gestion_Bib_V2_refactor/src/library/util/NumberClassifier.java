package library.util;

/** Ancienne Book.complexMethodExample(), extraite (Extract Method + SRP). */
public final class NumberClassifier {
    private NumberClassifier() { }

    public static String classify(int i) {
        if (i % 2 == 0) {
            return i + " is even";
        }
        if (i % 3 == 0) {
            return i + " divisible by 3";
        }
        return i + " something else";
    }

    public static void printUpTo(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(classify(i));
        }
    }
}
