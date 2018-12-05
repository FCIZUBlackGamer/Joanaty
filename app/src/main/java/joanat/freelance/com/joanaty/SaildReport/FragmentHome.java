package joanat.freelance.com.joanaty.SaildReport;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import joanat.freelance.com.joanaty.R;
import joanat.freelance.com.joanaty.SellBell.ProductInBellSell;

public class FragmentHome extends Fragment {

    View view;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    List<ProductInBellSell> productInBellSellList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_report_sell_bell, container, false);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.rec);
        recyclerView.setLayoutManager(layoutManager);
        productInBellSellList = new ArrayList<>();
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();

        productInBellSellList.add(new ProductInBellSell());
        adapter = new ReportAdapter(getActivity(), productInBellSellList);
        recyclerView.setAdapter(adapter);
    }
}
