package joanat.freelance.com.joanaty.ReturnedReport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import joanat.freelance.com.joanaty.R;
import joanat.freelance.com.joanaty.SellBell.ProductInBellSell;

public class ReportAdapter extends RecyclerView.Adapter<ReportAdapter.Vholder> {

    Context context;
    List<ProductInBellSell> agents;

    public ReportAdapter(Context context, List<ProductInBellSell> agents) {
        this.context = context;
        this.agents = agents;
//        loginDatabae = new LoginDatabae(context);
//        cursor = loginDatabae.ShowData();
    }

    @NonNull
    @Override
    public Vholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_report, parent, false);
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

    }

    @Override
    public int getItemCount() {
        return agents.size();
    }

    public class Vholder extends RecyclerView.ViewHolder {
        TextView barcode, amount, discount;
        TextView sell_type;
        TextView name, price, total;

        public Vholder(View itemView) {
            super(itemView);
            barcode = itemView.findViewById(R.id.barcode);
            amount = itemView.findViewById(R.id.amount);
            name = itemView.findViewById(R.id.product_name);
            discount = itemView.findViewById(R.id.discount);
            sell_type = itemView.findViewById(R.id.sell_type);
            price = itemView.findViewById(R.id.price);
            total = itemView.findViewById(R.id.total);
        }
    }

}
