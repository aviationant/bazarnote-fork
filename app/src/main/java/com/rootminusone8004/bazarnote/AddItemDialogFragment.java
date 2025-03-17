package com.rootminusone8004.bazarnote;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.DialogFragment;

public class AddItemDialogFragment extends DialogFragment {
    private EditText itemInput;
    private ItemAddedListener listener;

    public interface ItemAddedListener {
        void onItemAdded(String itemName);
    }

    public void setItemAddedListener(ItemAddedListener listener) {
        this.listener = listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_add_item, container, false);

        itemInput = view.findViewById(R.id.edit_text_item);
        Button
    }




}
