package edu.upc.eetac.dsa.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText text;

    //Operantes y resultado
    public double op1, op2, res;

    //Operacion
    int op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText)findViewById(R.id.TAG);
    }

    public void bt1 (View v){
        String cap=text.getText().toString();
        cap=cap+"1";
        text.setText(cap);
    }

    public void bt2 (View v){
        String cap=text.getText().toString();
        cap=cap+"2";
        text.setText(cap);
    }

    public void bt3 (View v){
        String cap=text.getText().toString();
        cap=cap+"3";
        text.setText(cap);
    }

    public void bt4 (View v){
        String cap=text.getText().toString();
        cap=cap+"4";
        text.setText(cap);
    }

    public void bt5 (View v){
        String cap=text.getText().toString();
        cap=cap+"5";
        text.setText(cap);
    }

    public void bt6 (View v){
        String cap=text.getText().toString();
        cap=cap+"6";
        text.setText(cap);
    }

    public void bt7 (View v){
        String cap=text.getText().toString();
        cap=cap+"7";
        text.setText(cap);
    }

    public void bt8 (View v){
        String cap=text.getText().toString();
        cap=cap+"8";
        text.setText(cap);
    }

    public void bt9 (View v){
        String cap=text.getText().toString();
        cap=cap+"9";
        text.setText(cap);
    }

    public void bt0 (View v){
        String cap=text.getText().toString();
        cap=cap+"1";
        text.setText(cap);
    }

    public void btPunt (View v){
        String cap=text.getText().toString();
        cap=cap+".";
        text.setText(cap);
    }

    public void suma (View v){
        try{
            String aux1 = text.getText().toString();
            op1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe) {}
        text.setText("");
        op=1;
    }

    public void resta (View v){
        try{
            String aux1 = text.getText().toString();
            op1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe) {}
        text.setText("");
        op=2;
    }

    public void multiplicacion (View v){
        try{
            String aux1 = text.getText().toString();
            op1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe) {}
        text.setText("");
        op=3;
    }

    public void division (View v){
        try{
            String aux1 = text.getText().toString();
            op1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe) {}
        text.setText("");
        op=4;
    }

    public void sin (View v){
        try{
            String aux1 = text.getText().toString();
            op1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe) {}
        text.setText("Sin("+op1+")");
        op=5;
    }

    public void cos (View v){
        try{
            String aux1 = text.getText().toString();
            op1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe) {}
        text.setText("Cos("+op1+")");
        op=6;
    }

    public void tan (View v){
        try{
            String aux1 = text.getText().toString();
            op1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe) {}
        text.setText("Tan("+op1+")");
        op=7;
    }

    public void igual (View v){
        try{
            String aux2 = text.getText().toString();
            op1 = Double.parseDouble(aux2);
        }catch (NumberFormatException nfe) {}
        text.setText("");

        if (op==1) {
            res=op1+op2;
        }
            else if (op==2){
                res=op1-op2;
        }
            else if (op==3){
                res=op1*op2;
        }
            else if(op==4) {
            if (op == 0) {
                text.setText("Error");
            } else {
                res = op1 / op2;
            }
        }

            else if(op==5){
                   double rad=Math.toRadians(op1);
                   res=(Math.sin(rad));
            }

            else if(op==6){
                double rad=Math.toRadians(op1);
                res=(Math.cos(rad));
            }

            else if(op==7){
                double rad=Math.toRadians(op1);
                res=(Math.tan(rad));
            }

            text.setText(""+res);
            op1=res;
        }


        public void clear (View v) {
            text.setText("");
            op1 = 0.0;
            op2 = 0.0;
            res = 0.0;
        }

        public void borrar (View v) {
            if (!text.getText().toString().equals("")){
                text.setText(text.getText().subSequence(0, text.getText().length()-1)+"");
            }
        }

    }

