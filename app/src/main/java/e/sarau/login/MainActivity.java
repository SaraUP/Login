package e.sarau.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.editTextEmail);
        Password = (EditText)findViewById(R.id.editText6);
        Login = (Button)findViewById(R.id.button4);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }

    private void validate(String userName, String userPassword){
        if((userName.equals("sarisup14@gmail.com")) && (userPassword.equals("1234"))){
            Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Error!", Toast.LENGTH_SHORT).show();
            Login.setEnabled(false);
            }
        }
    }

