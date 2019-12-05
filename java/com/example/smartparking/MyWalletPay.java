package com.example.smartparking;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MyWalletPay extends AppCompatActivity {

    private ImageView mimageView;
    private static final int REQUEST_IMAGE_CAPTURE = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_wallet_pay);
        getSupportActionBar().setTitle("PAY");

        mimageView = findViewById(R.id.imageView);
    }

    public void takePicture(View view) {
        Intent imageTakeIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        if (imageTakeIntent.resolveActivity(getPackageManager())!=null){
            startActivityForResult(imageTakeIntent,REQUEST_IMAGE_CAPTURE);
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            mimageView.setImageBitmap(imageBitmap);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.addMenu:
                goToSettings();
                return true;
            case R.id.addMenu2:
                goToNotification();
                return true;
            case R.id.addMenu3:
                goToOut();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void goToSettings() {
        Intent intent = new Intent(MyWalletPay.this, Notification.class);
        startActivity(intent);
    }

    private void goToNotification() {
        Intent intent = new Intent(MyWalletPay.this, Settings.class);
        startActivity(intent);
    }
    private void goToOut() {
        Toast.makeText(getApplicationContext(), "Log Out Successful!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MyWalletPay.this, LogIn.class);
        startActivity(intent);
    }

    public void btn_homepage(View view){
        startActivity(new Intent(getApplicationContext(),HomePage.class));
    }

    public void btn_menu(View view){
        startActivity(new Intent(getApplicationContext(), Menu.class));
    }

    public void btn_profile(View view){
        startActivity(new Intent(getApplicationContext(), Profile.class));
    }
    public void btn_scan(View view){
        startActivity(new Intent(getApplicationContext(), Scan.class));
    }
    public void btn_payment(View view){
        startActivity(new Intent(getApplicationContext(), CheckPayment.class));
    }
    public void btn_reservation(View view){
        startActivity(new Intent(getApplicationContext(), Reservation.class));
    }


}
