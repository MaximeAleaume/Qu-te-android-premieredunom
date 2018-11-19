package fr.wildcodeschool.firstapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.editText).setEnabled(false);
        findViewById(R.id.editText2).setEnabled(false);





    }

    public void becomeWilder(View view){

        boolean checked = ((CheckBox) view).isChecked();
        if (checked) {
            findViewById(R.id.editText).setEnabled(true);
            findViewById(R.id.editText2).setEnabled(true);
        } else {
            findViewById(R.id.editText).setEnabled(false);
            findViewById(R.id.editText2).setEnabled(false);
        }
    }

    public void hired(View view){

        EditText firstname = findViewById(R.id.editText);
        EditText lastname = findViewById(R.id.editText2);
        TextView congratz = findViewById(R.id.congratz);


        String strFirstName = firstname.getText().toString();
        String strLastName = lastname.getText().toString();

        Context context = getApplicationContext();
        CharSequence text = "Please fill both name";
        int duration = Toast.LENGTH_LONG;
        final Toast toast = Toast.makeText(context, text, duration);

        if (strFirstName.length() == 0|| strLastName.length() == 0){
            toast.show();
        } else {
            congratz.setText("Congratulation\t" + strFirstName + "\t" +strLastName );
        }
    }
}
