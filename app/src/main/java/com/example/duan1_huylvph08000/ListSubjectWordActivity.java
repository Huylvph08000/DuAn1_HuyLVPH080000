package com.example.duan1_huylvph08000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListSubjectWordActivity extends AppCompatActivity {
    ListView listView;
    String mTitle[] = {"FOOD", "SPORTS", "MUSIC", "MOVIES", "TIME", "The World", "Holidays and Festivals"};
    String mDescription[] = {"Our food vocabulary ", "Learn general sports vocab", "Learn basic music vocab", "You can learn general vocabulary about movies", "Learn the vocab of time", "You can explore the vocabulary of numbers", "Vocabulary for some of the main religious and cultural festivals worldwide"};
    int images[] = {R.drawable.food, R.drawable.sport, R.drawable.music, R.drawable.phim, R.drawable.world, R.drawable.fesival, R.drawable.youtube};
    // so our images and other things are set in array

    // now paste some images in drawable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_subject_word);
        listView = findViewById(R.id.listView);
        setTitle("Topic");
        // now create an adapter class

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);
        // there is my mistake...
        // now again check this..

        // now set item click on list view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(ListSubjectWordActivity.this, "Our food vocabulary  ", Toast.LENGTH_SHORT).show();
                }
                if (position == 1) {
                    Toast.makeText(ListSubjectWordActivity.this, "Learn general sports vocab", Toast.LENGTH_SHORT).show();
                }
                if (position == 2) {
                    Toast.makeText(ListSubjectWordActivity.this, "Learn basic music vocab", Toast.LENGTH_SHORT).show();
                }
                if (position == 3) {
                    Toast.makeText(ListSubjectWordActivity.this, "You can learn general vocabulary about movies", Toast.LENGTH_SHORT).show();
                }
                if (position == 4) {
                    Toast.makeText(ListSubjectWordActivity.this, "Learn the vocab of time", Toast.LENGTH_SHORT).show();
                }
                if (position == 5) {
                    Toast.makeText(ListSubjectWordActivity.this, "You can explore the vocabulary of numbers", Toast.LENGTH_SHORT).show();
                }
                if (position == 6) {
                    Toast.makeText(ListSubjectWordActivity.this, "Vocabulary for some of the main religious and cultural festivals worldwide", Toast.LENGTH_SHORT).show();
                }
            }
        });
        // so item click is done now check list view
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter(Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row, R.id.textView10, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView10);
            TextView myDescription = row.findViewById(R.id.textView20);

            // now set our resources on views
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);
            return row;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_add:

                Intent intent = new Intent(ListSubjectWordActivity.this, HomeActivity.class);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
