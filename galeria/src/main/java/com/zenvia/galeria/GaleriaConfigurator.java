package com.zenvia.galeria;

import java.util.ArrayList;
import java.util.List;

public class GaleriaConfigurator {

    private static GaleriaConfigurator instance;
    private static boolean mFree;
    private static List<Integer> imageIds;


    public static GaleriaConfigurator getInstance() {
        if(instance == null)
            instance = new GaleriaConfigurator();
        return instance;
    }

    private GaleriaConfigurator() {
        imageIds = new ArrayList<>();
    }

    public static boolean isFree() {
        return mFree;
    }

    public static void setFree(boolean free) {
        mFree = free;
    }

    public static List<Integer> getImageIds() {
        return imageIds;
    }

    public static void setImageIds(List<Integer> imageIds) {
        GaleriaConfigurator.imageIds = imageIds;
    }

    public static void addImage(int i) {
        imageIds.add(i);
    }
}
