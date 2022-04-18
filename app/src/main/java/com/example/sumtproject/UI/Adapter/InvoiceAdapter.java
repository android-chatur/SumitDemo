package com.example.sumtproject.UI.Adapter;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sumtproject.R;
import com.example.sumtproject.UI.view.OnItemClickListener;

public class InvoiceAdapter extends RecyclerView.Adapter<InvoiceAdapter.MyViewHolder_procedBene> {
    Context context;
    //AppPreferences appPreferences;
    ImageView next;
    TextView date, date_;
    LinearLayout lin_membackground;
    Typeface typeSemibold, typeRegular, typeHeader, heding, normal, typebold, typeLight;
    //ArrayList<LiMem> Membership_list = new ArrayList<com.example.barayihsalem.UI.Model.LiMem>();
    private final OnItemClickListener.OnClickCallback onClickCallback_Benefi;

    public InvoiceAdapter(Context exchage_list, OnItemClickListener.OnClickCallback onClickCallback_Benefi) {
        this.context = exchage_list;
        //this.Membership_list = Membership_list;
        this.onClickCallback_Benefi = onClickCallback_Benefi;
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @NonNull
    @Override
    public MyViewHolder_procedBene onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // appPreferences = new AppPreferences(context);
        //appController = (AppController) context.getApplicationContext();

        // infalte the item Layout
        View v;

        ((Activity) context).getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.invoi_list, parent, false);


        //  View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder_procedBene vh = new MyViewHolder_procedBene(v); // pass the view to View Holder
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder_procedBene holder, int position) {
       // date.setText(Membership_list.get(position).membershipName);


      //  lin_membackground.setOnClickListener(new OnItemClickListener(position, onClickCallback_Benefi, "ITEM"));
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
       // return Membership_list.size();
        return 5;
    }

    public class MyViewHolder_procedBene extends RecyclerView.ViewHolder {
        public MyViewHolder_procedBene(@NonNull View itemView) {
            super(itemView);


//            lin_membackground = itemView.findViewById(R.id.lin_membackground);
//            date.setTypeface(typebold);



          /*  bene_bank_name = itemView.findViewById(R.id.bene_bank_name);
            benefi_name = itemView.findViewById(R.id.benefi_name);

*/
           /* benefi_name.setTypeface(typeSemibold);

            bene_bank_name.setTypeface(typeLight);*/

        }
    }


}
