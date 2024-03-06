package com.farhan.health2;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ArticlesViewHolder extends RecyclerView.ViewHolder {
    ImageView image;
    TextView title;
    TextView author;
    LinearLayout post;
    public ArticlesViewHolder(@NonNull View itemView) {

        super(itemView);
        image=itemView.findViewById(R.id.image);

        title=itemView.findViewById(R.id.title);

        author=itemView.findViewById(R.id.author);

        post=itemView.findViewById(R.id.post);
    }
}

