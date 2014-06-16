package com.bloc.blocnotes;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
/*import android.widget.RelativeLayout; */

/**
 * Created by mark.tan on 5/26/14.
 */
public class NoteFragment extends Fragment{
    NoteFragment(){
        Fragment f = new Fragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); /*returns a view object, which is what ends up appearing on screen when the Fragment is added to the layout */
        /*setContentView(R.layout.note_fragment);*/

        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, ViewNoteFragment.newInstance(position + 1))
                .commit();

//        LayoutInflater I = getLayoutInflater();
//        View v = I.inflate(R.layout.note_fragment, null);



    }

    @Override
    public ViewGroup onCreateView(){

    }

}

// Instantiating an object
// Instance of a class
// Class Fragment will have a new instance by calling Fragment constructor
// Assign this object to variable f
// f refers to an instance of Fragment class

// XML Instructions
// Populate the layout file with an EditText and inflate it in the onCreateView(…) method of NoteFragment.
// Pull a reference to the EditText View from the inflated XML and save it as a field.
// Return the View and verify that your Fragment behaves as before.
