package com.example.sumtproject.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.sumtproject.R;
import com.example.sumtproject.UI.Adapter.InvoiceAdapter;
import com.example.sumtproject.UI.view.OnItemClickListener;

public class HomeActivity extends AppCompatActivity {
RecyclerView rw_invoice;
    InvoiceAdapter invoice_adapter;

    OnItemClickListener.OnClickCallback onClickCall = new OnItemClickListener.OnClickCallback() {
        @Override
        public void onClicked(View view, int position, String type) {








            }



          /*  if (animalNames != null && animalNames.size() > 0) {


            }*/




    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        rw_invoice=findViewById(R.id.rw_invoice);


        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(), 1);
        gridLayoutManager.setOrientation(LinearLayoutManager.VERTICAL); // set Horizontal Orientation
        rw_invoice.setLayoutManager(gridLayoutManager);
        invoice_adapter = new InvoiceAdapter(HomeActivity.this,  onClickCall);
        rw_invoice.setAdapter(invoice_adapter);
    }
}