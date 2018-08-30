package com.isuru.sqllite.mvpretrofit.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.isuru.sqllite.mvpretrofit.R;
import com.isuru.sqllite.mvpretrofit.model.ServiceProvider;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ServiceProviderAdapter extends RecyclerView.Adapter<ServiceProviderAdapter.MyViewHolder> {

    Context context;
    List<ServiceProvider> serviceProviderList;

    public ServiceProviderAdapter(Context context, List<ServiceProvider> serviceProviderList) {
        this.context = context;
        this.serviceProviderList = serviceProviderList;
    }

    public void setServiceProviderList(List<ServiceProvider> serviceProviderList) {
        this.serviceProviderList = serviceProviderList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ServiceProviderAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_adapter_service_type,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ServiceProviderAdapter.MyViewHolder holder, int position) {

        holder.mServiceTypeNameTextView.setText(serviceProviderList.get(position).getBusinessName());
        holder.mServiceProvderAddress.setText(serviceProviderList.get(position).getCommonHotLine());
    }

    @Override
    public int getItemCount() {
        return serviceProviderList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.service_provider_name)
        TextView mServiceTypeNameTextView;

        @BindView(R.id.service_provider_address)
        TextView mServiceProvderAddress;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);

        }
    }
}
