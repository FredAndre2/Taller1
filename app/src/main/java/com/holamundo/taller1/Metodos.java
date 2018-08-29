package com.holamundo.taller1;

public class Metodos {
 public static double Calcular_Valor_Compra(int cantidad,int material_manilla,int dije,int tipo_dije,int moneda){
     double valor_total=0;


     if (material_manilla==0 && dije==1){

         if(tipo_dije==0){
             valor_total=100 * cantidad;
             if (moneda==1){
                 valor_total = valor_total * 3200;
             }

         }
         else if (tipo_dije==2){
             valor_total = 80 * cantidad;
             if(moneda==1){
                 valor_total = valor_total * 3200;
             }
         }
         else{
             valor_total = 70 * cantidad;
             if(moneda==1){
                 valor_total = valor_total * 3200;
             }
         }
     }
     else if(material_manilla==0 && dije==0){
         if(tipo_dije==0){
             valor_total=120 * cantidad;
             if (moneda==1){
                 valor_total = valor_total * 3200;
             }

         }
         else if (tipo_dije==2){
             valor_total = 100 * cantidad;
             if(moneda==1){
                 valor_total = valor_total * 3200;
             }
         }
         else{
             valor_total = 90 * cantidad;
             if(moneda==1){
                 valor_total = valor_total * 3200;
             }
         }
     }
     else if(material_manilla==1 && dije==1){
         if(tipo_dije==0){
             valor_total=90 * cantidad;
             if (moneda==1){
                 valor_total = valor_total * 3200;
             }

         }
         else if (tipo_dije==2){
             valor_total = 70 * cantidad;
             if(moneda==1){
                 valor_total = valor_total * 3200;
             }
         }
         else{
             valor_total = 50 * cantidad;
             if(moneda==1){
                 valor_total = valor_total * 3200;
             }
         }
     }
     else if(material_manilla==1 && dije==0){
         if(tipo_dije==0){
             valor_total=110 * cantidad;
             if (moneda==1){
                 valor_total = valor_total * 3200;
             }

         }
         else if (tipo_dije==2){
             valor_total = 90 * cantidad;
             if(moneda==1){
                 valor_total = valor_total * 3200;
             }
         }
         else{
             valor_total = 80 * cantidad;
             if(moneda==1){
                 valor_total = valor_total * 3200;
             }
         }
     }

     return valor_total;
 }
}










