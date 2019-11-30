package com.example.duan1_huylvph08000.Vocabulary;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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
import android.widget.TextView;
import android.widget.Toast;

import com.example.duan1_huylvph08000.Home.HomeActivity;
import com.example.duan1_huylvph08000.R;

public class SubjectsWordActivity extends AppCompatActivity implements VocabularyMVP.View{
    ListView listView;
    String mTitle[] = {"FOOD", "SPORTS", "MUSIC", "MOVIES", "TIME", "The World", "Holidays and Festival"};
    String mDescription[] = {"Our food vocabulary ", "Learn general sports vocab", "Learn basic music vocab", "You can learn general vocabulary about movies", "Learn the vocab of time", "You can explore the vocabulary of numbers", "Vocabulary for some of the main religious and cultural festivals worldwide"};
    int images[] = {R.drawable.food, R.drawable.sport, R.drawable.music, R.drawable.phim, R.drawable.world, R.drawable.fesival, R.drawable.youtube};
    VocabularyMVP.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects_word);
        listView = findViewById(R.id.listView);
        setTitle("Topic");
        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);
        presenter = new VocabularyPresenter(this);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position ==  0) {
presenter.clickedTopic0();
                }
                if (position ==  1) {
presenter.clickedTopic1();
                }
                if (position ==  2) {
presenter.clickedTopic2();
                }
                if (position ==  3) {
  presenter.clickedTopic3();              }
                if (position ==  4) {
presenter.clickedTopic4();
                }
                if (position ==  5) {

  presenter.clickedTopic5();              }
                if (position ==  6) {

  presenter.clickedTopic6();              }
            }
        });
    }

    @Override
    public void topic0() {
        Toast.makeText(SubjectsWordActivity.this, "Our food vocabulary  ", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void topic1() {
        Toast.makeText(SubjectsWordActivity.this, "Whatsapp Description", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void topic2() {
        Toast.makeText(SubjectsWordActivity.this, "Twitter Description", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void topic3() {
        Toast.makeText(SubjectsWordActivity.this, "Instagram Description", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void topic4() {
        Toast.makeText(SubjectsWordActivity.this, "Youtube Description", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void topic5() {
        Toast.makeText(SubjectsWordActivity.this, "Youtube Description", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void topic6() {
        Toast.makeText(SubjectsWordActivity.this, "Youtube Description", Toast.LENGTH_SHORT).show();

    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView21);

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
            case R.id.backHome:

                Intent intent = new Intent(SubjectsWordActivity.this, HomeActivity.class);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
