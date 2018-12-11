package kylle.cruz.com.prepinas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_earthquake extends AppCompatActivity {

    public void goToUpdateEarthPage(View v) {

        Intent i = null;
        if (v.getId() == R.id.earthqtipsbtn) {
            i = new Intent(this, activity_updateearth.class);
            startActivity(i);
        }

    }

    public void goToTwitter(View v) {

        Intent i = null;
        if (v.getId() == R.id.eartnewsbtn) {
            String url = "https://twitter.com/phivolcs_dost";
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake);
    }
}
