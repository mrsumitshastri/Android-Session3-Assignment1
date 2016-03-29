package helloworld.iconikindia.com.android_session3_assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn ;
    ImageView img ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.btnHide);
        img = (ImageView)findViewById(R.id.imageView);
    }

    public void hideShow(View v)
    {
        if(img.getVisibility() == View.VISIBLE)
        {
            img.setVisibility(View.INVISIBLE);
            btn.setText("Show");
        }
        else
        {
            img.setVisibility(View.VISIBLE);
            btn.setText("Hide");
        }

    }


}
