## 📸 Screenshots

### Inbox SMS View & Incoming SMS Toast

<img src="https://github.com/abdullah-al-shafi/Read-Phone-SMS/blob/main/screenshots/screenshot.png?raw=true" alt="Screenshot" width="350"/>


# 📱 Read Phone SMS (Android)

An Android app that demonstrates how to **read SMS messages from the SIM card inbox** and **receive new incoming SMS instantly** (like OTPs) using `BroadcastReceiver`.  
This project is beginner-friendly and great for learning how SMS permissions and content providers work in Android.  

---

## 🚀 Features
- ✅ Read SMS messages from the **inbox** (SIM card)  
- ✅ Auto-detect **new incoming SMS** in real time  
- ✅ Display messages inside the app in a scrollable `TextView` (code-view style)  
- ✅ Uses runtime permissions (`READ_SMS`, `RECEIVE_SMS`)  
- ✅ Simple, clean project structure for easy understanding  

---

## 🛠️ Tech Stack
- **Language:** Java  
- **Framework:** Android SDK  
- **Min SDK:** 21 (Android 5.0 Lollipop)  
- **Target SDK:** 34  

---

## 🔑 Permissions
The app requests the following permissions:

```xml
<uses-permission android:name="android.permission.READ_SMS" />
<uses-permission android:name="android.permission.RECEIVE_SMS" />
<uses-permission android:name="android.permission.SEND_SMS" />


READ_SMS → Required to read inbox messages

RECEIVE_SMS → Required to detect new incoming SMS

SEND_SMS → Required if you want to send SMS (optional in this demo)


---






