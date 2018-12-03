package joanat.freelance.com.joanaty.SellBell;

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

public class FragmentHome extends Fragment {

    View view;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    List<ProductInBellSell> productInBellSellList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_sell_bell, container, false);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.rec);
        recyclerView.setLayoutManager(layoutManager);
        productInBellSellList = new ArrayList<>();
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();

    }
}
