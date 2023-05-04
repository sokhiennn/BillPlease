package sg.edu.rp.c346.id22013179.billplease;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText amount;
    EditText numPax;
    ToggleButton svs;
    ToggleButton gst;
    TextView totalBill;
    TextView eachPays;
    Button split;
    Button reset;
    EditText discount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount = findViewById(R.id.editInputAmount);
        numPax = findViewById(R.id.editInputNumPax);
        totalBill = findViewById(R.id.totalBill);
        eachPays = findViewById(R.id.eachPays);
        svs = findViewById(R.id.toggleButtonSvs);
        gst = findViewById(R.id.toggleButtonGst);
        split = findViewById(R.id.splitButton);
        reset = findViewById(R.id.resetButton);
        discount = findViewById(R.id.editInputDiscount);



    }
}