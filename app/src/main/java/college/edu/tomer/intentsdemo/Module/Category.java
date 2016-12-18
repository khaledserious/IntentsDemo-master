package college.edu.tomer.intentsdemo.Module;

/**
 * Created by master on 22/05/16.
 */
public class Category {
   final private String title;
   final private int imageResID;

    //Constructor:
    public Category(String title, int imageResID) {
        this.title = title;
        this.imageResID = imageResID;
    }

    public String getTitle() {
        return title;
    }
    public int getImageResID() {
        return imageResID;
    }
}
