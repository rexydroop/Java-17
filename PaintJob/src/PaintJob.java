public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.3, 2, 1));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }

        double area = width * height;
        int buckets = 0;
        int totalBuckets = extraBuckets + buckets;
        double totalPaintAvailable = areaPerBucket * totalBuckets;

        while (totalPaintAvailable < area){
            buckets++;
            totalBuckets = extraBuckets + buckets;
            totalPaintAvailable = areaPerBucket * totalBuckets;
        }
        return buckets;
    }
}
