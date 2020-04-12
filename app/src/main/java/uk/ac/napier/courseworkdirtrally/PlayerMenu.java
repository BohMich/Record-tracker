package uk.ac.napier.courseworkdirtrally;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PlayerMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_menu);
        //load database





        TableLayout tl = (TableLayout)findViewById(R.id.table_layout_list_players);
        tl.setColumnStretchable(0,true);
        tl.setColumnStretchable(1,true);

        TextView text = new TextView(this);
        text.setText("TEST!");
        tl.addView(text);



        Button AddPlayer = (Button)findViewById(R.id.btn_gotoAddPlayerMenu);
        AddPlayer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               // Intent activityA = new Intent(PlayerMenu.this,Player_Menu_newPlayer.class);
               // startActivity(activityA);
               List x = getdata();

            }
        });

    }

    private List getdata(){

        Database db = new Database(this);
        SQLiteDatabase read = db.getReadableDatabase();

        ///get readable database
        //define projection , specify which columns you want to use after queery
        String[] projection = {FeedReaderContract.FeedPlayer.COLUMN_NAME};

        //build cursor, it will be used to iterate through results
        Cursor cursor = read.query(
                FeedReaderContract.FeedPlayer.TABLE_NAME,
                projection,
                null,
                null,
                null,
                null,
                null
        );

        List x = new ArrayList();

        while(cursor.moveToNext()){
            String name = cursor.getString(cursor.getColumnIndexOrThrow(
                    FeedReaderContract.FeedPlayer.COLUMN_NAME));
            x.add(name);

        }
        cursor.close();

        return x;
    }
}


