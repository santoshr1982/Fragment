package assignment.fragment.rsantosh.com.fragmentassignment;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MessagePasser, View.OnClickListener {

    private EditText mEditAccept;
    private Button mSubmit;
    MessagePasser mMessagePasser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditAccept = (EditText) findViewById(R.id.accept_number);
        mSubmit = (Button) findViewById(R.id.submit);
        mSubmit.setOnClickListener(this);
    }

    @Override
    public void passNumber(int num) {


    }

    @Override
    public void onClick(View view) {

        int number = Integer.parseInt(mEditAccept.getText().toString());

        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.container, new SimpleAddition()).commit();

        passNumber(number);
       // Toast.makeText(getApplicationContext(),""+number,Toast.LENGTH_SHORT).show();
    }
}
