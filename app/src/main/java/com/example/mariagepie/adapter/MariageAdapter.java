package com.example.mariagepie.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mariagepie.model.MariageModel;
import com.example.mariagepie.R;
import com.example.mariagepie.DetailActivity;

import java.util.List;

public class MariageAdapter extends RecyclerView.Adapter<MariageAdapter.MariageViewHolder> {

    private List<MariageModel> mariageList;
    private Context context;

    public MariageAdapter(List<MariageModel> mariageList, Context context) {
        this.mariageList = mariageList;
        this.context = context;
    }

    @NonNull
    @Override
    public MariageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mariage, parent, false);
        return new MariageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MariageViewHolder holder, int position) {
        MariageModel mariage = mariageList.get(position);
        holder.bind(mariage);
    }

    @Override
    public int getItemCount() {
        return mariageList.size();
    }

    public class MariageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView nameTextView;
        private MariageModel currentMariage;

        public MariageViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            itemView.setOnClickListener(this);
        }

        public void bind(MariageModel mariage) {
            currentMariage = mariage;
            nameTextView.setText(mariage.getName());
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("type", currentMariage.getType());
            intent.putExtra("description", currentMariage.getDescription());
            intent.putExtra("name", currentMariage.getName());
            context.startActivity(intent);
        }
    }
}
