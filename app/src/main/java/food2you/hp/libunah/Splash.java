package food2you.hp.libunah;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class Splash extends AppCompatActivity {
    public  static String url;
    SharedPreferences.Editor editor;
    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        pref = getApplicationContext().getSharedPreferences("levana", Context.MODE_PRIVATE);
         editor = pref.edit();
       // B28E31

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run() {
                        /*LayoutInflater layoutInflater = LayoutInflater.from(Splash.this);
                        View promptView = layoutInflater.inflate(R.layout.choose_language, null);

                        final AlertDialog alertD = new AlertDialog.Builder(Splash.this).create();


                        Button hebrew = (Button) promptView.findViewById(R.id.heb);

                        Button english = (Button) promptView.findViewById(R.id.eng);

                        hebrew.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {

                                editor.putString("language", "true");  // Saving string

// Save the changes in SharedPreferences
                                editor.apply();

                                url = "http://hotfixtech.com/levana/he/women-signin.php";

                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);

                                // btnAdd1 has been clicked

                            }
                        });

                        english.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {

                                editor.putString("language", "true");  // Saving string

// Save the changes in SharedPreferences
                                editor.apply();
                                url = "http://hotfixtech.com/levana/women-signin.php";

                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);

                                // btnAdd2 has been clicked

                            }
                        });

                        alertD.setView(promptView);

                        alertD.show();*/


                        if(pref.contains("language"))
                        {
                            String checked=pref.getString("language", "");

                            if(checked.matches("true")) {
                                url=pref.getString("language_url", "");
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            }

                        }

                        else {

                            Intent intent = new Intent(getApplicationContext(), language.class);
                            startActivity(intent);

                        }

                    }
                }, 4000);
            }
        });
    }
}
