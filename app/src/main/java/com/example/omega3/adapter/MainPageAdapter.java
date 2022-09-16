package com.example.omega3.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.omega3.R;
import com.example.omega3.activities.MainPageActivity;
import com.example.omega3.model.MainPage;

import java.util.List;

public class MainPageAdapter extends RecyclerView.Adapter<MainPageAdapter.MainPageViewHolder> {

    private final List<MainPage> mainPageList;
    private final Context context;

    public MainPageAdapter(List<MainPage> mainPageList, Context context) {
        this.mainPageList = mainPageList;
        this.context = context;
    }

    @NonNull
    @Override
    public MainPageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view = LayoutInflater.from(viewGroup.getContext())
               .inflate(R.layout.main_page_adapter, viewGroup, false);
        return new MainPageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainPageViewHolder mainPageViewHolder, int i) {

        MainPage mainPage = mainPageList.get(i);

        mainPageViewHolder.name.setText(mainPage.getName());
    }

    @Override
    public int getItemCount() {
        return mainPageList.size();
    }

    public class MainPageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView name;

        public MainPageViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);


            name = itemView.findViewById(R.id.titleTextView);
        }


        @Override
        public void onClick(View view) {

            int position = getAdapterPosition();
            MainPage mainPage = mainPageList.get(position);

            Intent intent = new Intent(context, MainPageActivity.class);

            intent.putExtra("name", mainPage.getName());

            context.startActivity(intent);
        }
    }

}
