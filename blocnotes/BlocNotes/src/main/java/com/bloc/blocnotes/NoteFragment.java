package com.bloc.blocnotes;

import android.app.Fragment;
import android.os.Bundle;
import android.widget.RelativeLayout;

/**
 * Created by mark.tan on 5/26/14.
 */
public class NoteFragment extends Fragment{
    NoteFragment(){
        Fragment f = new Fragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}

// Instantiating an object
// Instance of a class
// Class Fragment will have a new instance by calling Fragment constructor
// Assign this object to variable f
// f refers to an instance of Fragment class