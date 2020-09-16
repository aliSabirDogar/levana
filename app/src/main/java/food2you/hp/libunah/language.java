package food2you.hp.libunah;

import android.app.Activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class language extends Activity {
    SharedPreferences.Editor editor;
    SharedPreferences pref;
    public  static String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_language);

        pref = getApplicationContext().getSharedPreferences("levana", Context.MODE_PRIVATE);
        editor = pref.edit();

        ImageView hebrew = (ImageView) findViewById(R.id.heb);

        ImageView english = (ImageView) findViewById(R.id.eng);

        hebrew.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                editor.putString("language", "true");  // Saving string
                editor.putString("language_url", "http://hotfixtech.com/levana/he");

// Save the changes in SharedPreferences
                editor.apply();

                url = "http://hotfixtech.com/levana/he";

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

                // btnAdd1 has been clicked

            }
        });

        english.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                editor.putString("language", "true");  // Saving string
                editor.putString("language_url", "http://hotfixtech.com/levana");

// Save the changes in SharedPreferences
                editor.apply();
                url = "http://hotfixtech.com/levana";

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

                // btnAdd2 has been clicked

            }
        });
    }
}
