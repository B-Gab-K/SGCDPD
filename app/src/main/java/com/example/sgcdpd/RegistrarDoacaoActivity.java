package com.example.sgcdpd;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrarDoacaoActivity extends AppCompatActivity {

    private EditText itemEditText, quantidadeEditText, descricaoEditText;
    private Spinner tipoDoacaoSpinner;
    private Button registrarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_doacao);

        itemEditText = findViewById(R.id.itemEditText);
        quantidadeEditText = findViewById(R.id.quantidadeEditText);
        descricaoEditText = findViewById(R.id.descricaoEditText);
        tipoDoacaoSpinner = findViewById(R.id.tipoDoacaoSpinner);
        registrarButton = findViewById(R.id.registrarButton);

        // Preencher o spinner com tipos de doação
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.tipos_doacao_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tipoDoacaoSpinner.setAdapter(adapter);

        registrarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registrarDoacao();
            }
        });
    }

    private void registrarDoacao() {
        String item = itemEditText.getText().toString();
        int quantidade = Integer.parseInt(quantidadeEditText.getText().toString());
        String descricao = descricaoEditText.getText().toString();
        int tipoDoacaoId = tipoDoacaoSpinner.getSelectedItemPosition(); // Supondo que os IDs sejam os índices do spinner

        // Cria uma nova doação
        Doacao doacao = new Doacao(0, tipoDoacaoId, item, quantidade, descricao, "Pendente");

        // Salva a doação (ex: em um banco de dados)
        // Aqui vamos usar uma lista temporária para exemplo
//        DoacaoDatabase.getInstance().addDoacao(doacao);

//        Toast.makeText(this, "Doação registrada com sucesso!", Toast.LENGTH_SHORT).show();

        // Limpa os campos de texto
        itemEditText.setText("");
        quantidadeEditText.setText("");
        descricaoEditText.setText("");
        tipoDoacaoSpinner.setSelection(0);
    }
}