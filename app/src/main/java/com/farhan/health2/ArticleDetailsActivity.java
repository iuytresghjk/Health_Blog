package com.farhan.health2;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;

import com.google.gson.Gson;

public class ArticleDetailsActivity extends AppCompatActivity {
    TextView title;
     TextView author;
     TextView details;
     ImageView image;
    Article article;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_details);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Article Details");
        }


        title = findViewById(R.id.title);
        author = findViewById(R.id.author);
        details = findViewById(R.id.details);
        image = findViewById(R.id.image);

        article = new Gson().fromJson(getIntent().getStringExtra("data"), Article.class);

        title.setText(article.getTitle());
        author.setText(article.getAuthor());
        details.setText(article.getDescription());
        image.setImageResource(article.getImage());

        author.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
           finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
