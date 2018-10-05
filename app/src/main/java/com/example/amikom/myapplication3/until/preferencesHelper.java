package com.example.amikom.myapplication3.until;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by amikom on 28/09/2018.
 */

public class preferencesHelper {
    private static preferencesHelper INSTANCE;
    private SharedPreferences sharedPreferences;
}
private PreferencesHelper(Context context){
    sharedPreferences=context
            .getApplicationcontext()
            .getSharedPreferences("simple.android.app,Context.MODE_PRIVATE");
}
public static  preferencesHelper getInstance(Context context){
    if (INSTANCE ==null){
        INSTANCE =new PreferencesHelper(context);
    }
    return INSTANCE;
}
public SharedPreferences Pref(){
    return sharedPreferences;
}
public Boolean isLogin(){
    return sharedPreferences.getBoolean("isLogin",false);
}
public void setlogin (boolean isCall){
    sharedPreferences.edit().putBoolean("ïslogin".isCall).apply();

}
public void setName(String isName){
    sharedPreferences.edit().putString("isName", isName.apply();
}
public String get
