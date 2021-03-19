package com.example.android.tourguide;






import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.android.tourguide.Word;

import java.util.ArrayList;

/**
 * {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Word} objects.
 */
public class WordAdapter extends ArrayAdapter<Word>  {



    /**
     * Create a new {@link WordAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of {@link Word}s to be displayed.
     */


    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID nationalPark_text_view.
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.nationalPark_text_view);
        // Get the national park from the currentWord object and set this text on
        // the TourGuide TextView.
        placeTextView.setText(currentWord.getPlaceNameId());

        // Find the TextView in the list_item.xml layout with the ID size_text_view.
        TextView featuresTextView = (TextView) listItemView.findViewById(R.id.size_text_view);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        featuresTextView.setText(currentWord.getFeaturesId());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.local_text_view);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        locationTextView.setText(currentWord.getLocationId());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not

        if (currentWord.hasImage()){
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentWord.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }




        // Return the whole list item layout (containing 3 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
