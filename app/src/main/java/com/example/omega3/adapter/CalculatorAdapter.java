package com.example.omega3.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class CalculatorAdapter extends RecyclerView.Adapter<CalculatorAdapter.CalculatorViewHolder>{

    @NonNull
    @Override
    public CalculatorViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CalculatorViewHolder calculatorViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class CalculatorViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public CalculatorViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
