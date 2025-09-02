package com.example.readphonesms;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class SmsReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();

        if (bundle != null) {
            Object[] pdus = (Object[]) bundle.get("pdus");
            if (pdus != null) {
                for (Object pdu : pdus) {
                    SmsMessage smsMessage = SmsMessage.createFromPdu((byte[]) pdu);
                    String sender = smsMessage.getDisplayOriginatingAddress();
                    String messageBody = smsMessage.getMessageBody();

                    // Show SMS in Toast (you can also send to Activity via Intent)
                    Toast.makeText(context,
                            "From: " + sender + "\nMessage: " + messageBody,
                            Toast.LENGTH_LONG).show();

                    // Optionally: broadcast to MainActivity
                    Intent smsIntent = new Intent("SMS_RECEIVED_ACTION");
                    smsIntent.putExtra("sender", sender);
                    smsIntent.putExtra("message", messageBody);
                    context.sendBroadcast(smsIntent);
                }
            }
        }
    }
}

