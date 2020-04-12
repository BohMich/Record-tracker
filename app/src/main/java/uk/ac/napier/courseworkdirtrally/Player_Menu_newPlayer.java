package uk.ac.napier.courseworkdirtrally;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Objects;


public class Player_Menu_newPlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player__menu_new_player);

        Toast.makeText(Player_Menu_newPlayer.this,"MENU/PLAYER/ADDPLAYER",Toast.LENGTH_LONG);
        //read database
        Database data = new Database(this);
        SQLiteDatabase db = data.getWritableDatabase();

        //set button listener


        Button btn_addPlayer = (Button) findViewById(R.id.btn_add_new_player);
        btn_addPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get infro from TEXTVIEW and turn it to string
                TextView name = (TextView) findViewById(R.id.txtview_add_player_name);
                String inName = name.getText().toString();
                //simple check
                if(!Objects.equals(inName, "")){

                    ContentValues values = new ContentValues();
                    values.put(FeedReaderContract.FeedPlayer.COLUMN_NAME, inName );
                    Toast.makeText(Player_Menu_newPlayer.this,"Name has been added",Toast.LENGTH_LONG).show();
                }
                else Toast.makeText(Player_Menu_newPlayer.this,"Invalid Name",Toast.LENGTH_LONG).show();

            }
        });

    }
}
