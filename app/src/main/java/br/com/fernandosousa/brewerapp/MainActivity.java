package br.com.fernandosousa.brewerapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/ {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        ImageView imagem  = (ImageView) findViewById(R.id.imagemLogin);
        imagem.setImageResource(R.drawable.login_img);

        TextView texto  = (TextView) findViewById(R.id.mensagemInicio);
        texto.setText(R.string.mensagem_login_activity);

        TextView campoUsuario = (TextView) findViewById(R.id.campoUsuario);
        TextView campoSenha = (TextView) findViewById(R.id.campoSenha);

        String txtUsuario = campoUsuario.toString();
        String txtSenha = campoSenha.toString();

        Button botao = (Button)findViewById(R.id.botaoLogin);

        // Vincular evento de click -  modo 1
        botao.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView campoUsuario = (TextView) findViewById(R.id.campoUsuario);
                TextView campoSenha = (TextView) findViewById(R.id.campoSenha);

                String txtUsuario = campoUsuario.getText().toString();
                String txtSenha = campoSenha.getText().toString();

                Toast.makeText(MainActivity.this, "Usuário: "+ txtUsuario+ "; Senha: "+ txtSenha, Toast.LENGTH_LONG).show();


            }
        });

        // Vincular evento de click -  modo 2
        // Activity deve implementar View.OnClickListener
       // botao.setOnClickListener(this);

        // Vincular evento de click -  modo 3
        botao.setOnClickListener(onClickLogin());
    }

    // implenetar método onClick - modo2
    public void onClick(View v) {
        TextView campoUsuario = (TextView) findViewById(R.id.campoUsuario);
        TextView campoSenha = (TextView) findViewById(R.id.campoSenha);

        String txtUsuario = campoUsuario.getText().toString();
        String txtSenha = campoSenha.getText().toString();

        Toast.makeText(MainActivity.this, "Usuário: "+ txtUsuario+ "; Senha: "+ txtSenha, Toast.LENGTH_LONG).show();


    }

    // implementar evento de click - modo 3
    private View.OnClickListener onClickLogin() {
        return new View.OnClickListener() {
            public void onClick(View v) {
                TextView campoUsuario = (TextView) findViewById(R.id.campoUsuario);
                TextView campoSenha = (TextView) findViewById(R.id.campoSenha);

                String txtUsuario = campoUsuario.getText().toString();
                String txtSenha = campoSenha.getText().toString();

                Toast.makeText(MainActivity.this, "Usuário: " + txtUsuario + "; Senha: " + txtSenha, Toast.LENGTH_LONG).show();


            }
        };
    }
}
