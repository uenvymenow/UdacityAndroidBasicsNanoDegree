package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class WordAdapter extends ArrayAdapter<Word> {
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);

        public WordAdapter(Activity context, ArrayList<Word> words);

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        // Find the TextView in list_item.xml with the Miwok ID
        TextView miwokTranslation = (TextView) listItemView.findViewById(R.id.miwokWord);

        // Get the miwok word and set it to the miwok TextView
        miwokTranslation.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml with the default translation ID
        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.defaultWord);

        // Get the default word and set it to the default TextView
        defaultTranslation.setText(currentWord.getDefaultTranslation());

        return listItemView;
    }
}
