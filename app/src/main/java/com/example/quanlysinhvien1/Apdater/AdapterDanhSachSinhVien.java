package com.example.quanlysinhvien1.Apdater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.quanlysinhvien1.R;
import com.example.quanlysinhvien1.sinhvien;

import java.util.ArrayList;

public class AdapterDanhSachSinhVien extends RecyclerView.Adapter<AdapterDanhSachSinhVien.ViewHoler> {

    Context context;
    int resource;
    ArrayList<sinhvien> sinhvienmodeList;
    public AdapterDanhSachSinhVien(Context context, int resource, ArrayList<sinhvien> sinhvienmodeList){
        this.context=context;
        this.resource=resource;
        this.sinhvienmodeList=sinhvienmodeList;

    }
    public class ViewHoler extends RecyclerView.ViewHolder {

        TextView txthoten,txtngaysinh,txtMasinhvien,txtgioitinh;


        public ViewHoler(@NonNull View itemView) {
            super(itemView);


            txthoten=itemView.findViewById(R.id.txthoten);
            txtngaysinh=itemView.findViewById(R.id.txtngaysinh);
            txtMasinhvien=itemView.findViewById(R.id.txtMasinhvien);
            txtgioitinh=itemView.findViewById(R.id.txtgioitinh);


        }
    }
    @NonNull
    @Override
    public AdapterDanhSachSinhVien.ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(resource,parent,false);
        ViewHoler viewHolder=new ViewHoler(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final AdapterDanhSachSinhVien.ViewHoler holder, int position) {
        final sinhvien sinhvienModel=sinhvienmodeList.get(position);

            holder.txtMasinhvien.setText("Mã SV: "+sinhvienModel.getMasinhvien());
            holder.txthoten.setText("Tên SV: "+sinhvienModel.getHoten());
            holder.txtngaysinh.setText("Ngày sinh: "+sinhvienModel.getNgaysinh());
            holder.txtgioitinh.setText("Giới tính : "+sinhvienModel.getGioitinh());




    }

    @Override
    public int getItemCount() {
        return  sinhvienmodeList.size();
    }


}
