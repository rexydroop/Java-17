public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.26, 0.75));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double area = width * height;
        double areaLeft = area - areaPerBucket * extraBuckets;

        return getBucketCount(areaLeft, areaPerBucket);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1
    ;
        }

        double area = width * height;

        return getBucketCount(area, areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double buckets = area / areaPerBucket;

        return (int) Math.ceil(buckets);
    }
}
