package us.jmnet.uda.projectzero;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class PortfolioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
    }

    public void project1ButtonOnClick(View view) {
        showToastForUnfinishedApp(getString(R.string.project1_name));
    }

    public void project2ButtonOnClick(View view) {
        showToastForUnfinishedApp(getString(R.string.project2_name));
    }

    public void project3ButtonOnClick(View view) {
        showToastForUnfinishedApp(getString(R.string.project3_name));
    }

    public void project4ButtonOnClick(View view) {
        showToastForUnfinishedApp(getString(R.string.project4_name));
    }

    public void project5ButtonOnClick(View view) {
        showToastForUnfinishedApp(getString(R.string.project5_name));
    }

    public void project6ButtonOnClick(View view) {
        showToastForUnfinishedApp(getString(R.string.project6_name));
    }

    private void showToastForUnfinishedApp(String appName) {
        String toastText = String.format(getString(R.string.unimplemented_toast_text), appName);

        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, toastText, Toast.LENGTH_SHORT);
        toast.show();
    }
}
