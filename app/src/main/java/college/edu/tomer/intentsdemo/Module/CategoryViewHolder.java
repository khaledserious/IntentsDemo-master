package college.edu.tomer.intentsdemo.Module;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import college.edu.tomer.intentsdemo.R;


public class CategoryViewHolder {
    TextView title;
    ImageView ivAlbum;

    public CategoryViewHolder(View songView, Category song) {
        title  = (TextView) songView.findViewById(R.id.title);
        ivAlbum  = (ImageView) songView.findViewById(R.id.ivAlbum);
        dispSong(song);
    }

    private void dispSong(Category song){
        title.setText(song.getTitle());
        ivAlbum.setImageResource(song.getImageResID());
    }
}
