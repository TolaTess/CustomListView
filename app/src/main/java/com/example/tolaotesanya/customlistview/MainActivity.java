package com.example.tolaotesanya.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView mlistView;

    int[] images = {R.drawable.image1,
                    R.drawable.image2,
                    R.drawable.image3,
                    R.drawable.image4,
                    R.drawable.image5};

    String[] names = {"Teket Logo1",
                    "Teket Logo2",
                    "Teket Logo3",
                    "Teket Logo4",
                    "Teket Logo5"};

    String[] descriptions = {"Sample with Image",
            "Sample red text only",
            "Sample black text only",
            "Sample orange T logo",
            "Sample black Dfree"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mlistView = findViewById(R.id.listview);

        //create customAdaptor object to access listView
        CustomAdaptor customAdaptor =new CustomAdaptor();
        mlistView.setAdapter(customAdaptor);

    }

    //create customer Adaptor class to create the listview from the customlayout xml file
    class CustomAdaptor extends BaseAdapter{


        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            //set view to the custom layout xml
            View view1 = getLayoutInflater().inflate(R.layout.customlayout, null);
            ImageView mImageView = view1.findViewById(R.id.imageView2);
            TextView mTextView = view1.findViewById(R.id.textView);
            TextView mTextView1 = view1.findViewById(R.id.textView1);

            //iterate through the image and name array
            mImageView.setImageResource(images[i]);
            mTextView.setText(names[i]);
            mTextView1.setText(descriptions[i]);
            return view1;
        }
    }
}
