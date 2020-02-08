package com.example.apiprueba;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apiprueba.models.Hotel;

import java.util.ArrayList;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {
    private  ArrayList<Hotel> dataset;
    private Context context;
    private  Hotel hotel;

    public RecyclerViewAdaptador (Context context){
        this.context = context;
        dataset = new ArrayList<>();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView inombre,idireccion,icontacto;
        private CardView targeta;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            inombre=(TextView) itemView.findViewById(R.id.nombre);
            idireccion=(TextView) itemView.findViewById(R.id.direccion);
            icontacto=(TextView) itemView.findViewById(R.id.contacto);
            targeta = (CardView) itemView.findViewById(R.id.cardviewhotel);

        }
    }

    public void adicionarlista(ArrayList<Hotel>listaHotel){
        dataset.addAll(listaHotel);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hotel,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        hotel = dataset.get(position);

        holder.icontacto.setText(hotel.getContactoTelefNico());
        holder.inombre.setText(hotel.getNombreDelHotel());
        holder.idireccion.setText(hotel.getDirecciN());
    }

    @Override
    public int getItemCount() {

        return 0;
    }
}
