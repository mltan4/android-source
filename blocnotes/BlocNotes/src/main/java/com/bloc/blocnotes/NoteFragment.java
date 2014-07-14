package com.bloc.blocnotes;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.EditText;
/*import android.widget.RelativeLayout; */

/**
 * Created by mark.tan on 5/26/14.
 */
public class NoteFragment extends Fragment{

    private static final String EDIT_TEXT = "My_Edit_Text";
    private EditText myEditText;
    private static final String ARG_SECTION_NUMBER = "section_number";

    public static NoteFragment newInstance(int sectionNumber) {
        NoteFragment fragment = new NoteFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        View a = inflater.inflate(R.layout.note_fragment, parent, false);
        return a;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(EDIT_TEXT, myEditText.getText().toString());
    }

    @Override
    public void onActivityCreated(Bundle outState) {
        super.onActivityCreated(outState);

        if (outState != null) {
            String myEdit = outState.getString(EDIT_TEXT); // Data type String (myEdit) is where we store the string EDIT TEXT.
            myEditText.setText(myEdit);
        }
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
