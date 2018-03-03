package ninja.soumuito.mastecontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.lang.reflect.Array;
import java.util.UUID;

public class ProfileActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_profile);

        mAuth = FirebaseAuth.getInstance();


        Button profile_save = findViewById(R.id.profile_save);
        profile_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wirete();

            }
        });

    }

    public void wirete() {

        EditText nome = findViewById(R.id.nome);

        EditText matricula = findViewById(R.id.matricula);
        EditText curso = findViewById(R.id.curso);
        EditText campus = findViewById(R.id.campus);
        EditText interesses = findViewById(R.id.interesses);
        EditText data_nsc = findViewById(R.id.data_nsc);


        Aluno alunos = new Aluno();
        alunos.nome = nome.getText().toString();
        alunos.matricula =  matricula.getText().toString();
        alunos.curso = curso.getText().toString();
        alunos.campus = campus.getText().toString();
        alunos.data_nsc = data_nsc.getText().toString();

       // alunos.interesses = interesses.getText().toString();

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference novoaluno = database.getReference("iesb/alunos/" + UUID.randomUUID().toString());


        novoaluno.child("nome").setValue(nome.getText().toString());
        novoaluno.child("matricula").setValue(matricula.getText().toString());
        novoaluno.child("curso").setValue(curso.getText().toString());
        novoaluno.child("campus").setValue(campus.getText().toString());
        novoaluno.child("data_nsc").setValue(data_nsc.getText().toString());
        novoaluno.child("interesses").setValue(interesses.getText().toString());


    }
}

