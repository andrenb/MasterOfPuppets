package ninja.soumuito.mastecontrol;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Switch shelf = findViewById(R.id.shelfState);
        shelf.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference rele = database.getReference("main/states/");
                    rele.child("shelf").setValue(true);}
                else {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference rele = database.getReference("main/states/");
                    rele.child("shelf").setValue(false);}

            }
        });


        Switch outro = findViewById(R.id.otherState);
        outro.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference rele = database.getReference("main/states/");
                    rele.child("other").setValue(true);}
                else {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference rele = database.getReference("main/states/");
                    rele.child("other").setValue(false);}

            }
        });



        Button sup = findViewById(R.id.sup);
        sup.setOnClickListener(new View.OnClickListener() {@Override
            public void onClick(View view) {wirete(); }});

        Button sdown = findViewById(R.id.sdown);
        sdown.setOnClickListener(new View.OnClickListener() {@Override
            public void onClick(View view) { wireted(); } });

        Switch som = findViewById(R.id.soundState);
         som.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference rele = database.getReference("main/states/");
                rele.child("sound").setValue(true);}
                else {
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference rele = database.getReference("main/states/");
                    rele.child("sound").setValue(false);}

            }
        });

    }


    public void wirete() {

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference rele = database.getReference("main/states/");

        rele.child("D0").setValue(true);
        rele.child("D1").setValue(true);
        rele.child("D2").setValue(true);
        rele.child("D3").setValue(true);
        rele.child("D4").setValue(true);
        rele.child("other").setValue(true);
        rele.child("sound").setValue(true);
        rele.child("shelf").setValue(true);




    }
    public void wireted() {


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference rele = database.getReference("main/states/");



        rele.child("D0").setValue(false);
        rele.child("D1").setValue(false);
        rele.child("D2").setValue(false);
        rele.child("D3").setValue(false);
        rele.child("D4").setValue(false);
        rele.child("other").setValue(false);
        rele.child("sound").setValue(false);
        rele.child("shelf").setValue(false);



    }

}