package com.mehraz.usermanagement.Activities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mehraz.usermanagement.R;

public class NumberLoginActivity extends AppCompatActivity {

    private Button btnSendOtp;
    private Button btnVerifyOtp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_login);

        btnSendOtp = findViewById(R.id.btnSendOtp);
        btnVerifyOtp = findViewById(R.id.btnVerifyOtp);

        btnSendOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle sending OTP
                // You can add your OTP sending logic here

                // Hide the phone number section
                findViewById(R.id.phoneNumberSection).setVisibility(View.GONE);

                // Show the OTP verification section
                findViewById(R.id.otpSection).setVisibility(View.VISIBLE);
            }
        });

        btnVerifyOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle OTP verification
                // You can add your OTP verification logic here

                // Redirect to the HomeActivity without verification
                Intent intent = new Intent(NumberLoginActivity.this, HomeActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });
    }
}
