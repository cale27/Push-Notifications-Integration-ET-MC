package com.example.scarlett.modelonowtest;

import android.app.Application;

import com.exacttarget.etpushsdk.ETPush;
import com.exacttarget.etpushsdk.ETPushConfig;

/**
 * Created by Scarlett on 19/04/2016.
 */
public class ApplicationController extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
       try{
            ETPush.readyAimFire(new ETPushConfig.Builder(this)
                    .setEtAppId("7fc9052b-b317-475a-bb2f-8ea9cc897965")
                    .setAccessToken("sbgqjfuymyfny3r96ax25rsq")
                    .setGcmSenderId("679503204526")
                    .setAnalyticsEnabled(true)
                    .setWamaEnabled(true)
                    .build());
        }
        catch(Exception e){

        }

    }
}
