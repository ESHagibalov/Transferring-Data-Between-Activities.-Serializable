package com.example.activities_connection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.activities_connection.Product;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
            final EditText nameText = findViewById(R.id.name);
            final EditText companyText = findViewById(R.id.company);
            final EditText priceText = findViewById(R.id.price);

            String name = nameText.getText().toString();
            String company = companyText.getText().toString();
            int price = Integer.parseInt(priceText.getText().toString());

            Product product = new Product(name, company, price);

            Intent intent = new Intent(this, check_activity.class);
            intent.putExtra(Product.class.getSimpleName(), product);

            startActivity(intent);
    }
}
