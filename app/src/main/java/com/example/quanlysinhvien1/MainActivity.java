package com.example.quanlysinhvien1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;



import com.example.quanlysinhvien1.Apdater.AdapterDanhSachSinhVien;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<sinhvien> sinhviens;
    AdapterDanhSachSinhVien adapterDanhSachSinhVien;
    RecyclerView recyclerDanhsachsinhvien;
    CheckBox cknam,cknu;
    EditText edhoten,edngaysinh,edMasinhvien;

    Button btnThem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();

    }


    private void addControls() {
        edhoten=findViewById(R.id.edhotensinhvien);
        edngaysinh=findViewById(R.id.edngaysinh);
        edMasinhvien=findViewById(R.id.edmasinhvien);
        cknam=findViewById(R.id.cknam);
        cknu=findViewById(R.id.cknu);
        btnThem=findViewById(R.id.btnThem);

        if(cknam.isChecked())
            cknu.setChecked(false);
        if(cknu.isChecked())
            cknam.setChecked(false);


        recyclerDanhsachsinhvien=findViewById(R.id.recyclerDanhsachsinhvien);

        sinhviens=new ArrayList<>();
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String hoten=edhoten.getText().toString();
                    String ngaysinh=edngaysinh.getText().toString();
                    String masinhvien=edMasinhvien.getText().toString();


                    String gioitinh="";
                    if(cknam.isChecked()){
                        gioitinh="nam";
                    }else if(cknu.isChecked()){
                        gioitinh="nu";
                    }

                    sinhviens.add(new sinhvien(masinhvien,hoten,ngaysinh,gioitinh));

                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
                    recyclerDanhsachsinhvien.setLayoutManager(layoutManager);
                    adapterDanhSachSinhVien = new AdapterDanhSachSinhVien(MainActivity.this,R.layout.custom_layout_ryclerdanhsachsinhvien,sinhviens);
                    recyclerDanhsachsinhvien.setAdapter(adapterDanhSachSinhVien);
                    adapterDanhSachSinhVien.notifyDataSetChanged();
            }
        });




            }



}

