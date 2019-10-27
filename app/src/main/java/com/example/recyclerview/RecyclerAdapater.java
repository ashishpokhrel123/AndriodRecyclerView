package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerAdapater extends  RecyclerView.Adapter<RecyclerAdapater.ContactViewHolder> {


     private Context mContext;
    private List<contact> contactList;

    RecyclerAdapater(Context mContext, List<contact> contactList){

           this.mContext=mContext;
           this.contactList=contactList;

    }


    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.contact,viewGroup,false);

        return new ContactViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {

         contact contacts = contactList.get(position);
        holder.imgProfile.setImageResource(contacts.getImgid());
        holder.tvName.setText(contacts.getName());
        holder.tvPhone.setText(contacts.getPhone());


        });






    @Override
    public int getItemCount() {
        return contactList.size();
    }

    class ContactViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imgProfile;
        TextView tvName,tvPhone;

        ContactViewHolder(@NonNull View itemView) {
            super(itemView);

            imgProfile = itemView.findViewById(R.id.imgProfile);
            tvName = itemView.findViewById(R.id.tvName);
            tvPhone =itemView.findViewById(R.id.tvPhone);
        }
    }
}
