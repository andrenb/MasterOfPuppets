package ninja.soumuito.mastecontrol;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

public class SingUpActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_sing_up);



        mAuth = FirebaseAuth.getInstance();


    Button singUp  = findViewById(R.id.singUp);
        singUp.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            wireteTest();

        }
    });

    }
public void wireteTest() {

        EditText name_text = findViewById(R.id.name_text);

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference novoaluno = database.getReference("iesb/alunos/"+ UUID.randomUUID().toString());


    novoaluno.child("nome").setValue(name_text.getText().toString());
    novoaluno.child("matricula").setValue("1234124");
    novoaluno.child("campus").setValue("sul");
    novoaluno.child("dt_nasc").setValue("1234412341");
    novoaluno.child("curso").setValue("Culinaria");
    novoaluno.child("interece").child("it1").setValue("computa");
    novoaluno.child("interece").child("it2").setValue("ingles");

    }

    public void createUser() {

        EditText text_pass = findViewById(R.id.text_pass);
        EditText mailText = findViewById(R.id.mailText);




        mAuth.signInWithEmailAndPassword(mailText.getText().toString(),text_pass.getText().toString())
                .addOnCompleteListener(SingUpActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()) {
                            Log.d("AUTH", "signInWithEmail:success");

                            Intent intent = new Intent(SingUpActivity.this, MainActivity.class);
                            startActivity(intent);
                        }
                        else {
                            Log.w("AUTH", "signInWithEmail:failure", task.getException());
                            Toast.makeText(SingUpActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }
                        // ...
                    }
                });


    }
}
