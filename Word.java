package com.example.android.tourguide;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains resource IDs for the name of a place , qualitative features, and
 * optional image file for that place.
 */
public class Word {

    /** String resource ID for the  name of the place*/
    private int mPlaceNameId;

    /** String resource ID for the qualitative features */
    private int mFeatures;

    /** String resource ID for the locale of the described place*/

    private int mLocation;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;



    public Word(int placeNameId, int featureId, int locationId, int imageResourceId){
        mPlaceNameId = placeNameId;
        mFeatures = featureId;
        mLocation = locationId;
        mImageResourceId = imageResourceId;

    }

    public Word(int placeNameId, int featureId, int locationId) {
        mPlaceNameId = placeNameId;
        mFeatures = featureId;
        mLocation = locationId;
    }


    /**
     * Get the string resource ID for the place of a certain place.
     */
    public int getPlaceNameId() {

        return mPlaceNameId;
    }

    /**
     * Get the string resource ID for the feature such as height or Surface area.
     */
    public int getFeaturesId() {

        return mFeatures;
    }

    /**
     * Get the string resource ID for the locale of the described place
     */
    public int getLocationId() {

        return mLocation;
    }
    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }



}
