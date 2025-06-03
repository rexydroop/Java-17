public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(2, 10, 15));
    }

    private static final int bigWeight = 5;

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        boolean result = false;
        int totalBigWeight = bigWeight * bigCount;

        if (totalBigWeight >= goal) {
            int remaining = goal % bigWeight;

            if (smallCount >= remaining) {
                result = true;
            }
        } else if (smallCount >= goal - totalBigWeight) {
            result = true;
        }

        return result;

    }
}
