package kylle.cruz.com.prepinas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_fire extends AppCompatActivity {
    public void goToUpdateFirePage(View v) {

        Intent i = null;
        if (v.getId() == R.id.firetipsbtn) {
            i = new Intent(this, activity_updatefire.class);
            startActivity(i);
        }

    }


    public void goToTwitter(View v) {

        Intent i = null;
        if (v.getId() == R.id.firenewsbtn) {
            String url = "https://twitter.com/TXTFIRE";
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }



    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);
    }
}
