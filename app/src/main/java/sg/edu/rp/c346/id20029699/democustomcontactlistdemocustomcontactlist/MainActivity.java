package sg.edu.rp.c346.id20029699.democustomcontactlistdemocustomcontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView lv;
    ArrayList<Contact> al;
    CustomAdapter CA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listViewContacts);
        al = new ArrayList<>();
        Contact item1 = new Contact("Mary", 65, 1234567, 'F');
        Contact item2 = new Contact("Ken", 65, 7654321, 'M');
        al.add(item1);
        al.add(item2);

        CA = new CustomAdapter(this, R.layout.row, al);
        lv.setAdapter(CA);

    }
}