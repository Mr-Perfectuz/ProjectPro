
package com.example.android.ProjectPro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

    }

    int quantity = 0;
    public void decrement(View view) {
        if ( quantity == 0) {
            Toast toast = Toast.makeText(this, " Sanoq manfiy bo'la olmaydi !", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        quantity = quantity - 1;
        displayQuantity(quantity);

    }

    public void increment(View view) {
        if (quantity ==33 ) {
            // show an error message sa a toast
            Toast toast = Toast.makeText(this, " Sanoq Tugatildi !", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        quantity = quantity + 1;
        displayQuantity(quantity);
    }



    /**
     * This method displays the given quantity value on the screen.
     */
    public void displayQuantity(int number ) {
        TextView quantityTextView =(TextView)findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
}
