package com.holamundo.taller1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;
import android.content.res.Resources;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
    private EditText Cantidad;
    private TextView ValorTotal;
    private Spinner Tipo_Dije, Material_Manilla, Dije, Moneda;
    private Resources recursos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Cantidad = (EditText)findViewById(R.id.Txt_Cantidad);
        ValorTotal = (TextView) findViewById(R.id.Txt_Valor_Total);
        Dije = (Spinner)findViewById(R.id.Cmb_Dije);
        Material_Manilla = (Spinner)findViewById(R.id.Cmb_Material_Manilla);
        Tipo_Dije = (Spinner)findViewById(R.id.Cmb_Tipo_Dije);
        Moneda = (Spinner)findViewById(R.id.Cmb_Moneda);
        recursos = this.getResources();
    }
    public boolean Validar(){
        if (Cantidad.getText().toString().isEmpty()){
            Cantidad.requestFocus();
            Cantidad.setError(recursos.getString(R.string.Error1));
            return false;
        }
        if (Integer.parseInt(Cantidad.getText().toString())==0){
            Cantidad.requestFocus();
            Cantidad.setError(recursos.getString(R.string.Error2));
            return false;
        }
        return true;
    }
    public void Btn_Calcular(View v){
        int Op_dije, Op_manilla, Op_TipoDije, Op_moneda;
        int Cant=0;
        double Valor_Total = 0;

        if (Validar()){
                Cant = Integer.parseInt(Cantidad.getText().toString());
                Op_dije = Dije.getSelectedItemPosition();
                Op_manilla = Material_Manilla.getSelectedItemPosition();
                Op_TipoDije = Tipo_Dije.getSelectedItemPosition();
                Op_moneda = Moneda.getSelectedItemPosition();

                Valor_Total = Metodos.Calcular_Valor_Compra(Cant,Op_manilla,Op_dije,Op_TipoDije,Op_moneda);

            ValorTotal.setText(""+Valor_Total);
        }

    }
    public void Btn_NuevaVenta(View v){
        Cantidad.setText("");
        ValorTotal.setText("");
        Cantidad.requestFocus();
        Dije.setSelection(0);
        Material_Manilla.setSelection(0);
        Tipo_Dije.setSelection(0);
        Moneda.setSelection(0);


    }
}
