package adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;

import java.util.List;

import model.BanhNgot;

public class BanhNgotAdapter extends BaseAdapter {

    private Context context;
    private int idLayout;
    private List<BanhNgot> listBanhNgot;
    private int positionSelected = -1;

    // Constructor
    public BanhNgotAdapter(Context context, int idLayout, List<BanhNgot> listBanhNgot) {
        this.context = context;
        this.idLayout = idLayout;
        this.listBanhNgot = listBanhNgot;
    }

    @Override
    public int getCount() {
        if(listBanhNgot.size() != 0 && !listBanhNgot.isEmpty()) {
            return listBanhNgot.size();
        }

        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(idLayout, viewGroup, false);
        }

        // TextViews
        TextView tvTitleBanh = view.findViewById(R.id.tvTiTleBanh);
        TextView tvContentBanh = view.findViewById(R.id.tvContentBanh);
        TextView tvPriceBanh = view.findViewById(R.id.tvPriceBanh);
        // Images
        ImageView imgBanh = view.findViewById(R.id.imgBanh);
        //ImageView imgCongBanh = view.findViewById(R.id.imgCongBanh);
        // Buttons
        Button btnDonut = view.findViewById(R.id.btnDonut);
        Button btnPinkDonut = view.findViewById(R.id.btnPinkDonut);
        Button btnFloating = view.findViewById(R.id.btnFloating);
        final LinearLayout linearLayout = view.findViewById(R.id.idLinearLayout);
        final BanhNgot banhNgot = listBanhNgot.get(i);

        if(listBanhNgot != null && !listBanhNgot.isEmpty()) {
            // TextView
            tvTitleBanh.setText(banhNgot.getTitleBanh());
            tvContentBanh.setText(banhNgot.getContentBanh());
            tvPriceBanh.setText(banhNgot.getPriceBanh());
            // ImageView
            imgBanh.setImageResource(banhNgot.getImgsBanh());
        }

        // Click
//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //Toast.makeText(context, banhNgot.getTitleBanh(), Toast.LENGTH_SHORT).show();
//                positionSelected = i;
//                notifyDataSetChanged();
//            }
//        });

        if(positionSelected == i) {
            linearLayout.setBackgroundColor(Color.BLUE);
        } else {
            linearLayout.setBackgroundColor(Color.WHITE);
        }

        return view;
    }
}
