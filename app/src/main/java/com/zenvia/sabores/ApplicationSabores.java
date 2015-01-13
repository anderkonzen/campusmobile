package com.zenvia.sabores;

import android.app.Application;

import com.zenvia.galeria.GaleriaConfigurator;

public class ApplicationSabores extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        int[] imagesIds = {com.zenvia.galeria.R.drawable.jake, com.zenvia.galeria.R.drawable.oimiga, com.zenvia.galeria.R.drawable.finn, com.zenvia.galeria.R.drawable.gunter, com.zenvia.galeria.R.drawable.tromba, com.zenvia.galeria.R.drawable.caracol};
        GaleriaConfigurator gc = GaleriaConfigurator.getInstance();
        gc.setFree(BuildConfig.FREE_APP);

        for(int i = 0; i < imagesIds.length ; i++)
            gc.addImage(imagesIds[i]);
    }
}
