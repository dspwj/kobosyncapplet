keytool -genkey -alias koboself -keystore koboSelfSignedKeystore -validity 365 < selfsignedkeystore.conf
jarsigner -keystore koboSelfSignedKeystore -storepass 2811WeltonStreet -keypass 2811WeltonStreet kobo_postproc_applet.jar koboself
jarsigner -keystore koboSelfSignedKeystore -storepass 2811WeltonStreet -keypass 2811WeltonStreet KoboSync_0.93.jar koboself