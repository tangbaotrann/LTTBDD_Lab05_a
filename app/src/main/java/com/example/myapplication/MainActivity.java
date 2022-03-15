package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import adapter.BanhNgotAdapter;
import model.BanhNgot;

public class MainActivity extends AppCompatActivity {

    private List<BanhNgot> listBanhNgot;
    private ListView listView;
    private int[] imgs;
    // Chuyển hướng
    //private ImageView imgChuyenHuong;
    // Search
    //private TextInputEditText editText;
    //private ArrayAdapter<BanhNgot> arrAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Chuyển sang trang chi tiết
        //imgChuyenHuong = findViewById(R.id.imgCongBanh);

        listView = findViewById(R.id.idListView);
        listBanhNgot = new ArrayList<>();
        imgs = new int[] {R.drawable.donut_yellow1, R.drawable.tasty_donut2, R.drawable.green_donut3, R.drawable.donut_red4};
        listBanhNgot.add(new BanhNgot(1, imgs[0],"Tasty Donut", "Spicy tasty donut family", "$10.00"));
        listBanhNgot.add(new BanhNgot(2, imgs[1],"Pink Donut", "Spicy tasty donut family", "$20.00"));
        listBanhNgot.add(new BanhNgot(3, imgs[2],"Floating Donut", "Spicy tasty donut family", "$30.00"));
        listBanhNgot.add(new BanhNgot(4, imgs[3],"Tasty Donut", "Spicy tasty donut family", "$40.00"));

        BanhNgotAdapter adapter = new BanhNgotAdapter(this, R.layout.item_custom_list_view, listBanhNgot);
        listView.setAdapter(adapter);

        // add event
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                Bundle bundle = new Bundle();
                bundle.putInt("id", listBanhNgot.get(i).getId());
                bundle.putInt("img", listBanhNgot.get(i).getImgsBanh());
                bundle.putString("title", listBanhNgot.get(i).getTitleBanh());
                bundle.putString("content", listBanhNgot.get(i).getContentBanh());
                bundle.putString("price", listBanhNgot.get(i).getPriceBanh());
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });


        // Search
        //editText = findViewById(R.id.idSearch);
        //arrAdapter = new ArrayAdapter<>(this, R.layout.item_custom_list_view, listBanhNgot);
        //listView.setAdapter(arrAdapter);
        // add event
//        editText.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            // Search
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                MainActivity.this.arrAdapter.getFilter().filter(charSequence);
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//            }
//        });
    }

    // Search
    public void initListSearch() {
        //arrAdapter = new ArrayAdapter<>(this, R.layout.item_custom_list_view,)
    }
}