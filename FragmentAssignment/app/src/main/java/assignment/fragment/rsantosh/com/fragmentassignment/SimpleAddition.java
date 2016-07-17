package assignment.fragment.rsantosh.com.fragmentassignment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SimpleAddition extends Fragment {

    private TextView mDisplayText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_simple_addition,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mDisplayText = (TextView) getActivity().findViewById(R.id.display_number);

    }

    public void setNumber(int number) {

        Display(number);

    }

    private void Display(int number) {

        mDisplayText.setText(number);

    }
}
