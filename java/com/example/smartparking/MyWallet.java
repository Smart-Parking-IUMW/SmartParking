package com.example.smartparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MyWallet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_wallet);
        getSupportActionBar().setTitle("MY WALLET");
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
    private void goToOut() {
        Toast.makeText(getApplicationContext(), "Log Out Successful!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MyWallet.this, LogIn.class);
        startActivity(intent);
    }
    private void goToSettings() {
        Intent intent = new Intent(MyWallet.this, Notification.class);
        startActivity(intent);
    }

    private void goToNotification() {
        Intent intent = new Intent(MyWallet.this, Settings.class);
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




    public void btn_pay(View view){
        startActivity(new Intent(getApplicationContext(), MyWalletPay.class));
    }

    public void btn_transfer(View view){
        startActivity(new Intent(getApplicationContext(), MyWalletTransfer.class));
    }

    public void btn_topup(View view){
        startActivity(new Intent(getApplicationContext(), MyWalletTopUp.class));
    }

    public void btn_request(View view){
        startActivity(new Intent(getApplicationContext(), MyWalletRequest.class));
    }

}