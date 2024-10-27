package br.ulbra.appcadastro;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CadastrarActivity extends AppCompatActivity {
    EditText edtUsuario, edtNome, edtSenha, edtSenha2;
    Button btCadastrar;
    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telacadastro);
        db = new DBHelper(this);
        edtUsuario = (EditText)findViewById(R.id.edtUsuario);
        edtNome = (EditText)findViewById(R.id.edtNome);
        edtSenha = (EditText)findViewById(R.id.edtSenha);
        edtSenha2 = (EditText)findViewById(R.id.edtSenha2);
        btCadastrar = (Button)findViewById(R.id.btCadastrar);
        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String NomeUsuario = edtUsuario.getText().toString();
                String S1 = edtSenha.getText().toString();
                String S2 = edtSenha2.getText().toString();
                if (NomeUsuario.equals("")) {
                    Toast.makeText(CadastrarActivity.this,"Insira o LOGIN DO USUÁRIO", Toast.LENGTH_SHORT).show();
                } else if (S1.equals("") || S2.equals("")){
                    Toast.makeText(CadastrarActivity.this,"Insira a SENHA DO USUÁRIO", Toast.LENGTH_SHORT).show();
                }else if(!S1.equals(S2)){
                    Toast.makeText(CadastrarActivity.this,"As senhas não correspondem ao login do usuário", Toast.LENGTH_SHORT).show();
                }else{
                    long res = db.criarUtilizador(NomeUsuario,S1);
                    if(res<0){
                        Toast.makeText(CadastrarActivity.this,"Resgistro OK", Toast.LENGTH_SHORT).show();
                    }else{
                        Toast.makeText(CadastrarActivity.this,"Senha inválida!", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
