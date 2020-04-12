package uk.ac.napier.courseworkdirtrally;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    //create the database


   // public Record_System data = new Record_System();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        //to access the database  you must instantiate the database anywhere
        // either as a read or write mode
        Database data = new Database(this);


        //"this" is the context, so that the database can know where to opeate


        //Buttons
        Button players = (Button) findViewById(R.id.Menu_playerButton);

        players.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activityA = new Intent(MainMenu.this,PlayerMenu.class);

                startActivity(activityA);

            }
        });
    }
}
