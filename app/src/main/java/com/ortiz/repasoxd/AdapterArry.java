package com.ortiz.repasoxd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterArry extends RecyclerView.Adapter<AdapterArry.MyViewHolderobjeto> {
    ArrayList<Objeto>Objeto1;

    public AdapterArry(ArrayList<Objeto>objeto1){
        Objeto1 = objeto1;
    }
    @NonNull
    @Override
    public AdapterArry.MyViewHolderobjeto onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemsrecycle,parent,false);

        return new MyViewHolderobjeto(view);
    }

    @Override //agregas los elementos para mostrar
    public void onBindViewHolder(@NonNull AdapterArry.MyViewHolderobjeto holder, int position) {
        Objeto objeto = Objeto1.get(position);
        holder.txtproducto.setText(objeto.Producto);
        holder.txtgarantia.setText(objeto.Garantia);
        holder.txtelectro.setText(objeto.Electro);
        holder.txtstock.setText(objeto.Stock);
        holder.txtrank.setText(objeto.Rank);

    }

    @Override//Cuenta los los items para la lista
    public int getItemCount() {
        return Objeto1.size();
    }
        //identifico los txt
    public class MyViewHolderobjeto extends RecyclerView.ViewHolder {
        TextView txtproducto;
        TextView txtgarantia;
        TextView txtelectro;
        TextView txtstock;
        TextView txtrank;


        public MyViewHolderobjeto(@NonNull View itemView) {
            super(itemView);

            txtproducto = itemView.findViewById(R.id.txtproducto);
            txtgarantia = itemView.findViewById(R.id.txtgarantia);
            txtelectro = itemView.findViewById(R.id.txtelectro);
            txtstock = itemView.findViewById(R.id.txtstock);
            txtrank = itemView.findViewById(R.id.txtrank);


        }
    }
}
