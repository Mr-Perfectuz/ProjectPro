
package com.example.android.ProjectPro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ExtraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);
    }

    int quantity = 0;
    public void decrementFive(View view) {
        if ( quantity == 0) {
            Toast toast = Toast.makeText(this, " Sanoq manfiy bo'la olmaydi !", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        quantity = quantity - 1;
        displayQuantity(quantity);

    }

    public void incrementFive(View view) {
        if (quantity ==100 ) {
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
        TextView quantityTextView =(TextView)findViewById(R.id.quantity_text_viewFive);
        quantityTextView.setText("" + number);
    }

}
