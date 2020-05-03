package com.example.activities_connection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class check_activity extends AppCompatActivity {

    //private TextView name_text = (TextView)findViewById(R.id.name_one);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setPadding(16, 16, 16, 16);

        Bundle arguments = getIntent().getExtras();

        final Product product;
        if(arguments!=null){
            product = (Product) arguments.getSerializable(Product.class.getSimpleName());

            textView.setText("Name: " + product.getName() + "\nCompany: " + product.getCompany() +
                    "\nPrice: " + String.valueOf(product.getPrice()));
        }

        setContentView(textView);
    }
}
