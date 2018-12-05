package joanat.freelance.com.joanaty.ReturnBell;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.List;

import joanat.freelance.com.joanaty.R;

public class ReturnBellAdapter extends RecyclerView.Adapter<ReturnBellAdapter.Vholder> {

    Context context;
    List<ProductInBellReturn> agents;

//    LoginDatabae loginDatabae;
//    Cursor cursor;
//    int userid, shopid;

    public ReturnBellAdapter(Context context, List<ProductInBellReturn> agents) {
        this.context = context;
        this.agents = agents;
//        loginDatabae = new LoginDatabae(context);
//        cursor = loginDatabae.ShowData();
    }

    @NonNull
    @Override
    public Vholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_retrun_bell, parent, false);
//        while (cursor.moveToNext()) {
//            userid = Integer.parseInt(cursor.getString(2));
//            shopid = Integer.parseInt(cursor.getString(3));
//
//        }
        return new Vholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Vholder holder, final int position) {

        holder.name.setText(agents.get(position).getName()+"");
        holder.barcode.setText(agents.get(position).getBarcode()+"");
        holder.price.setText(agents.get(position).getPrice()+"");
        holder.total.setText(agents.get(position).getTotal() + "");
        holder.discount.setText(agents.get(position).getDiscount() + "");
        holder.amount.setText(agents.get(position).getAmount() + "");
        holder.sell_type.setText(agents.get(position).getSell_type() + "");
        holder.amount.setText(agents.get(position).getAmount() + "");
        holder.back.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // check or uncheck
                notifyDataSetChanged();
            }
        });

    }

    @Override
    public int getItemCount() {
        return agents.size();
    }

    public class Vholder extends RecyclerView.ViewHolder {
        TextView barcode, amount, discount;
        TextView sell_type;
        TextView name, price, total;
        CheckBox back;

        public Vholder(View itemView) {
            super(itemView);
            barcode = itemView.findViewById(R.id.barcode);
            amount = itemView.findViewById(R.id.amount);
            name = itemView.findViewById(R.id.product_name);
            discount = itemView.findViewById(R.id.discount);
            sell_type = itemView.findViewById(R.id.sell_type);
            price = itemView.findViewById(R.id.price);
            total = itemView.findViewById(R.id.total);
            back = itemView.findViewById(R.id.back);
        }
    }

}
