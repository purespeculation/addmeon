# Addmeon

Addmeon is a mobile app developed for COMP350 - Software Engineering, by William Beck-Askenaizer, Matthew Burdick, and Ryan Santos. 
The App aims to simplify the sharing of game platform usernames, such as steam, blizzard, and xbox, down to the simple scanning of a QR code.

### Home Screen

The user starts out with blank home screen, and is given a simple interface. 

![homescreen](https://github.com/williambeckaskenaizer/addmeon/blob/master/images/Capture.PNG)

### Adding an account to your list

The user may add an account to their list of sharable accounts by tapping the '+' icon, which brings up the following screen:

![adding account](https://github.com/williambeckaskenaizer/addmeon/blob/master/images/addaccount.PNG)

### Example

Let's say the user taps the steam icon. They're greeted with the following official Steam OAuth page, asking to sign in, preventing false identites from being shared.

![steam sign in](https://github.com/williambeckaskenaizer/addmeon/blob/master/images/steamsignin.PNG)

Once the sign in is completed, the account will appear on the home screen like so

![Steam Home Screen](https://github.com/williambeckaskenaizer/addmeon/blob/master/images/homescreensteam.PNG)


### Scanning or Generating

Tapping Scan/Generate will bring up two buttons, Scan, and Generate. Scan allows the user to scan another user's QR code, and add the relevant accounts to their own app.
Generate will create a QR code based on the accounts signed in, and can be interpreted by another user utilizing the scan function.

![Scan/Generate](https://github.com/williambeckaskenaizer/addmeon/blob/master/images/scan-generate.PNG)

### Settings

As of now, the only available setting is a reset button to nuke the account database, and clear all stored info.