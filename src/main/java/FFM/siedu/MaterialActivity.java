package FFM.siedu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MaterialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material);
    }

    //Checking available files in storage
    //If Ya, Fetch it to activity
    //If Nay, Fetch it from database connection

}
