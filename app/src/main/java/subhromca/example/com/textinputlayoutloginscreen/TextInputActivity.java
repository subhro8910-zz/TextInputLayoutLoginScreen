package subhromca.example.com.textinputlayoutloginscreen;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TextInputActivity extends AppCompatActivity {

    Button loginbtn;
    EditText user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_input);
        final TextInputLayout usernameWrapper = (TextInputLayout) findViewById(R.id.usernameWrapper);
        final TextInputLayout passwordWrapper = (TextInputLayout) findViewById(R.id.passwordWrapper);
        loginbtn=(Button)findViewById(R.id.login);
        usernameWrapper.setHint("Username");
        passwordWrapper.setHint("Password");

        user=(EditText)findViewById(R.id.username);
        pass=(EditText)findViewById(R.id.password);
        
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logindone();
            }
        });
        }

    public void logindone() {
        String checkuser=user.getText().toString().trim();
        String chkpass=pass.getText().toString().trim();
        if(checkuser.equals("ABCD")&& chkpass.equals("ABCD1234"))
        {
            Toast.makeText(this,"username and password matched!",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,"username and password do not matched!",Toast.LENGTH_LONG).show();
        }
    }
}


