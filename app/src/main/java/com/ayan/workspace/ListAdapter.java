package com.ayan.workspace;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends ArrayAdapter {
    Bundle bundle;
    private List<ListVIewModel> listViewModels;
    Context mCtx;


    public ListAdapter(ArrayList<ListVIewModel> listViewModels, Context context) {
        super(context, R.layout.listviewrow, listViewModels);
        this.listViewModels=listViewModels;
        this.mCtx=context;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater inflater=LayoutInflater.from(mCtx);
            convertView=inflater.inflate(R.layout.listviewrow, null);
            viewHolder=new ViewHolder();
            viewHolder.textName=(TextView) convertView
                    .findViewById(R.id.childTextView);
            viewHolder.phonenumber=(TextView) convertView.findViewById(R.id.childTextViewPhone);
            viewHolder.button=(Button) convertView
                    .findViewById(R.id.childButton);
            viewHolder.button2=(Button) convertView.findViewById(R.id.childButton2);
            convertView.setTag(viewHolder);
        } else {
            viewHolder=(ViewHolder) convertView.getTag();
        }

        ListVIewModel listViewModel=listViewModels.get(position);


        viewHolder.textName.setText(listViewModel.getName());
        viewHolder.phonenumber.setText(listViewModel.getPhoneNumber());


        viewHolder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Textview= " + viewHolder.textName.getText().toString() + " " + viewHolder.phonenumber.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });

        viewHolder.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Textview= " + viewHolder.textName.getText().toString(), Toast.LENGTH_LONG).show();
                bundle=new Bundle();
                bundle.putString("ITEMNAME", viewHolder.textName.getText().toString());
                Intent intent=new Intent(getContext(), CallingActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtras(bundle);
                mCtx.startActivity(intent);
            }
        });


        return convertView;
    }

    public class ViewHolder {
        TextView phonenumber;
        TextView textName;
        Button button;
        Button button2;
    }
}