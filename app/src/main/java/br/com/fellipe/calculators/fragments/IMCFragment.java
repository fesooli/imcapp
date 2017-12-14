package br.com.fellipe.calculators.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.com.fellipe.calculators.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class IMCFragment extends Fragment {

    private EditText altura, peso;
    private TextView resultado;
    private Button calcular;

    public IMCFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_imc, container, false);

        this.altura = (EditText) v.findViewById(R.id.edAltura);
        this.peso = (EditText) v.findViewById(R.id.edPeso);
        this.resultado = (TextView) v.findViewById(R.id.tvResultado);
        this.calcular = (Button) v.findViewById(R.id.btnCalcular);

        this.calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular(v);
            }
        });

        return v;
    }

    public void calcular(View v){
        Double altura = Double.valueOf(this.altura.getText().toString());
        Double peso = Double.valueOf(this.peso.getText().toString());

        Double resultado = peso / (altura * altura);
        this.resultado.setText(resultado.toString());
    }
}
