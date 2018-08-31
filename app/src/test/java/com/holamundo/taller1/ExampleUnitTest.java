package com.holamundo.taller1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void Calcular_Valor_Compra1(){
        int cantidad=1,material_manilla=0,dije=1,tipo_dije=0,moneda=0;
        int valor_esperado = 100;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra2(){
        int cantidad=1,material_manilla=0,dije=1,tipo_dije=1,moneda=0;
        int valor_esperado = 100;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra3(){
        int cantidad=1,material_manilla=0,dije=1,tipo_dije=2,moneda=0;
        int valor_esperado = 80;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra4(){
        int cantidad=1,material_manilla=0,dije=1,tipo_dije=3,moneda=0;
        int valor_esperado = 70;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra5(){
        int cantidad=1,material_manilla=0,dije=0,tipo_dije=0,moneda=0;
        int valor_esperado = 120;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra6(){
        int cantidad=1,material_manilla=0,dije=0,tipo_dije=1,moneda=0;
        int valor_esperado = 120;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra7(){
        int cantidad=1,material_manilla=0,dije=0,tipo_dije=2,moneda=0;
        int valor_esperado = 100;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra8(){
        int cantidad=1,material_manilla=0,dije=0,tipo_dije=3,moneda=0;
        int valor_esperado = 90;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra9(){
        int cantidad=1,material_manilla=1,dije=1,tipo_dije=0,moneda=0;
        int valor_esperado = 90;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra10(){
        int cantidad=1,material_manilla=1,dije=1,tipo_dije=1,moneda=0;
        int valor_esperado = 90;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra11(){
        int cantidad=1,material_manilla=1,dije=1,tipo_dije=2,moneda=0;
        int valor_esperado = 70;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra12(){
        int cantidad=1,material_manilla=1,dije=1,tipo_dije=3,moneda=0;
        int valor_esperado = 50;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra13(){
        int cantidad=1,material_manilla=1,dije=0,tipo_dije=0,moneda=0;
        int valor_esperado = 110;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra14(){
        int cantidad=1,material_manilla=1,dije=0,tipo_dije=1,moneda=0;
        int valor_esperado = 110;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra15(){
        int cantidad=1,material_manilla=1,dije=0,tipo_dije=2,moneda=0;
        int valor_esperado = 90;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra16(){
        int cantidad=1,material_manilla=1,dije=0,tipo_dije=3,moneda=0;
        int valor_esperado = 80;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }


    //Pruebas con conversion a Peso Colombiano


    @Test
    public void Calcular_Valor_Compra17(){
        int cantidad=1,material_manilla=0,dije=1,tipo_dije=0,moneda=1;
        int valor_esperado = 320000;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra18(){
        int cantidad=1,material_manilla=0,dije=1,tipo_dije=1,moneda=1;
        int valor_esperado = 320000;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra19(){
        int cantidad=1,material_manilla=0,dije=1,tipo_dije=2,moneda=1;
        int valor_esperado = 256000;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra20(){
        int cantidad=1,material_manilla=0,dije=1,tipo_dije=3,moneda=1;
        int valor_esperado = 224000;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra21(){
        int cantidad=1,material_manilla=0,dije=0,tipo_dije=0,moneda=1;
        int valor_esperado = 384000;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra22(){
        int cantidad=1,material_manilla=0,dije=0,tipo_dije=1,moneda=1;
        int valor_esperado = 384000;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra23(){
        int cantidad=1,material_manilla=0,dije=0,tipo_dije=2,moneda=1;
        int valor_esperado = 320000;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra24(){
        int cantidad=1,material_manilla=0,dije=0,tipo_dije=3,moneda=1;
        int valor_esperado = 288000;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra25(){
        int cantidad=1,material_manilla=1,dije=1,tipo_dije=0,moneda=1;
        int valor_esperado = 288000;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra26(){
        int cantidad=1,material_manilla=1,dije=1,tipo_dije=1,moneda=1;
        int valor_esperado = 288000;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra27(){
        int cantidad=1,material_manilla=1,dije=1,tipo_dije=2,moneda=1;
        int valor_esperado = 224000;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra28(){
        int cantidad=1,material_manilla=1,dije=1,tipo_dije=3,moneda=1;
        int valor_esperado = 160000;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra29(){
        int cantidad=1,material_manilla=1,dije=0,tipo_dije=0,moneda=1;
        int valor_esperado = 352000;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra30(){
        int cantidad=1,material_manilla=1,dije=0,tipo_dije=1,moneda=1;
        int valor_esperado = 352000;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra31(){
        int cantidad=1,material_manilla=1,dije=0,tipo_dije=2,moneda=1;
        int valor_esperado = 288000;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
    @Test
    public void Calcular_Valor_Compra32(){
        int cantidad=1,material_manilla=1,dije=0,tipo_dije=3,moneda=1;
        int valor_esperado = 256000;
        assertEquals(valor_esperado, Metodos.Calcular_Valor_Compra(cantidad,material_manilla,dije,tipo_dije,moneda), 0);

    }
}