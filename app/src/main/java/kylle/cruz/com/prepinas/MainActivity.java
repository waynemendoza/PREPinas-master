package kylle.cruz.com.prepinas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToFirePage(View v) {

        Intent i = null;
        if (v.getId() == R.id.firebtn) {
            i = new Intent(this, activity_fire.class);
            startActivity(i);
        }

    }

    public void goToStormPage(View v) {

        Intent i = null;
        if (v.getId() == R.id.stormbtn) {
            i = new Intent(this, activity_storm.class);
            startActivity(i);
        }

    }
    public void goToEarthqPage(View v) {

        Intent i = null;
        if (v.getId() == R.id.earthqbtn) {
            i = new Intent(this, activity_earthquake.class);
            startActivity(i);
        }

    }
}
