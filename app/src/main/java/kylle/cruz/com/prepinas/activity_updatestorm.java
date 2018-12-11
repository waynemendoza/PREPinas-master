package kylle.cruz.com.prepinas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class activity_updatestorm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updatestorm);
    }



    public void call(View v){

        Intent i = null;
        if(v.getId() == R.id.btnCall){
            i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+6324342696"));
            startActivity(i);
        }

    }
}
