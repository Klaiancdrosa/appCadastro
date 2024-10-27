package br.ulbra.appcadastro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btEntrar, btRegistrar;
    EditText edtUsuario, edtSenha;
    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telalogin); // Certifique-se de que este é o layout correto

        db = new DBHelper(this);
        edtUsuario = findViewById(R.id.edtUsuario);
        edtSenha = findViewById(R.id.edtSenha);
        btEntrar = findViewById(R.id.btLogar);
        btRegistrar = findViewById(R.id.btCadastrarL); // Certifique-se de que o ID está correto

        btEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String NomeUsuario = edtUsuario.getText().toString();
                    String S1 = edtSenha.getText().toString();

                    if (NomeUsuario.isEmpty()) {
                        Toast.makeText(MainActivity.this, "Usuário não inserido, tente novamente", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if (S1.isEmpty()) {
                        Toast.makeText(MainActivity.this, "Senha não inserida, tente novamente", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    String res = db.validarLogin(NomeUsuario, S1);
                    if ("OK".equals(res)) {
                        Toast.makeText(MainActivity.this, "Login OK !!", Toast.LENGTH_SHORT).show();
                        // Inicie a próxima atividade aqui, se necessário
                    } else {
                        Toast.makeText(MainActivity.this, "Login ou Senha errados!!", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Erro: " + e.getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });

        btRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, CadastrarActivity.class);
                startActivity(i);
            }
        });
    }
}

