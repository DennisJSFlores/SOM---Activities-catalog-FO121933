package flores.js.dnns.somactivitiescatalogfo121933;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.PermissionRequest;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","onDestroy");

    }


    public void intanceState (View view){
        Log.d("LifeCycle", "Instance State Click!");
        Intent intent = new Intent(this, InstanceStateActivity.class);
        startActivity(intent);
    }

    public void permissionRequest (View view){
        Log.d("LifeCycle", "Permission Request Click!");
        Intent intent = new Intent(this, PermissionRequestActivity.class);
        startActivity(intent);
    }

}
