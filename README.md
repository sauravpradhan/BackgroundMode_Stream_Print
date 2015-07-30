# BackgroundMode_Stream_Print
Get Audio mode and Audio Stream in the background with Broadcast.

#Test-App link
https://drive.google.com/file/d/0Byaspar4S5SEV2NmSS1aaG5CNVU/view?usp=sharing

#How to use?
Logs can be filtered using tag "s@urav". 
Once the application is launched put it in background and then launch your application for which you want to find out the Mode and Stream.
Now give broadcast using: adb shell am broadcast -a android.intent.action.PACKAGE_ADDED
Now see the logs, you will get the mode and then volume of 5 different streams.
Now you'll know the mode but to get the Stream, change the volume and again send the broadcast.
Now see which stream's volume has been changed. That is the active stream.
This is done because there is no direct API to find the active stream.
