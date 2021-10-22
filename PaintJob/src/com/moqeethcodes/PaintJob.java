package com.moqeethcodes;

public class PaintJob {

    private static final int INVALID_VALUE = -1;

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return INVALID_VALUE;
        }
        return (int) (Math.ceil((width * height) / areaPerBucket - extraBuckets));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return INVALID_VALUE;
        }
        return (int) (Math.ceil((width * height) / areaPerBucket));

    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return INVALID_VALUE;
        }
        return (int) (Math.ceil(area / areaPerBucket));
    }

}
