package college.edu.tomer.intentsdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewParent;

import java.util.ArrayList;

import college.edu.tomer.intentsdemo.Module.Category;
import college.edu.tomer.intentsdemo.Module.CategoryViewHolder;


public class MainActivity extends AppCompatActivity {

    CategoryViewHolder song1, song2, song3, song4,song5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Category> songs = new ArrayList<>();
        songs.add(new Category("Countries", R.mipmap.countries));
        songs.add(new Category("Animals", R.mipmap.animals));
        songs.add(new Category("Health ", R.mipmap.health));
        songs.add(new Category("Sport", R.mipmap.sport));
        songs.add(new Category("Cars", R.mipmap.cars));


        song1 = new CategoryViewHolder(findViewById(R.id.song1), songs.get(0));
        song2 = new CategoryViewHolder(findViewById(R.id.song2), songs.get(1));
        song3 = new CategoryViewHolder(findViewById(R.id.song3), songs.get(2));
        song4 = new CategoryViewHolder(findViewById(R.id.song4), songs.get(3));
        song5 = new CategoryViewHolder(findViewById(R.id.song5), songs.get(4));





    }

        //view.setBackgroundColor(0xFF0000FF);
        //1) instantiate a new Intent with the destination class






   public void showDetails(View view){
       ViewParent parent = view.getParent();
        Context c = getApplicationContext();
        Intent dIntent = new Intent(c, DetailsActivity.class);

       Intent eIntent = new Intent(c, FirstActivity.class);

       // Intent fIntent = new Intent(c, SecondActivity.class);
       // Intent gIntent = new Intent(c, ThirdActivity.class);

        //put extra data
        switch (view.getId()){

            case R.id.song1:
                dIntent.putExtra("SongIndex", 0);
                startActivity(dIntent);
                break;

           case R.id.song2:
               dIntent.putExtra("SongIndex", 0);
               startActivity(dIntent);
               break;
           /* case R.id.song3:
               fIntent.putExtra("SongIndex", 2);
                startActivity(fIntent);
                break;
            case R.id.song4:
                gIntent.putExtra("SongIndex", 3);
                startActivity(gIntent);
                break;
            case R.id.song5:
                gIntent.putExtra("SongIndex", 3);
                startActivity(gIntent);
                break;*/
        }

        //3) start the intent:

    }










}
