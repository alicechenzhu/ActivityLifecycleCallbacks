package com.example.myapplication;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button mbutton;

    private Application.ActivityLifecycleCallbacks mActivitylifecycleCallbacks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbutton = (Button)findViewById(R.id.button);
        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mbutton.setBackgroundResource(R.drawable.bg1);
                Extproc.state(mbutton,MainActivity.this,R.drawable.bg2);
//                getApplication().registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
//                    @Override
//                    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
//
//                    }
//
//                    @Override
//                    public void onActivityStarted(Activity activity) {
//
//                    }
//
//                    @Override
//                    public void onActivityResumed(Activity activity) {
//                        if(activity !=null && activity==MainActivity.this){
//                            Log.d("TAG","lalalala");
//                            mbutton.setBackgroundResource(R.drawable.bg2);
//
//                        }
//                    }
//
//                    @Override
//                    public void onActivityPaused(Activity activity) {
//
//                    }
//
//                    @Override
//                    public void onActivityStopped(Activity activity) {
//
//                    }
//
//                    @Override
//                    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
//
//                    }
//
//                    @Override
//                    public void onActivityDestroyed(Activity activity) {
//
//                    }
//                });
                Intent intent =new Intent(MainActivity.this,secondActivity.class);
                startActivity(intent);
            }
        });
    }

//    @Override
//    protected void onStop(){
//        super.onStop();
//        if(mActivitylifecycleCallbacks!=null){
//            getApplication().unregisterActivityLifecycleCallbacks(mActivitylifecycleCallbacks);
//        }
//
//    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        getApplication().unregisterActivityLifecycleCallbacks(mActivitylifecycleCallbacks);
    }
}
