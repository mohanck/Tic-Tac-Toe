package com.wk.android.tictactoe;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    TextView txt1,txt2,p1,p2;

    int turn,level=1,time=60,count=time*1000,player1=0,player2=0;
	
	CountDownTimer t;

    String winner = "";

    AlertDialog.Builder builder;

    public void createTimer(int time)
    {
        count=time*1000;
        t = new CountDownTimer(count,1000){
            public void onTick(long millisUntilFinished){
                count -= 1000;
                if(count <= 1000) {
                    gameOver();
                }
                else {
                    txt2.setText((count / 1000) + "");
                }
            }

            public void onFinish()
            {                
            }
        };
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startGame();
		t = new CountDownTimer(time*1000,1000){
			public void onTick(long millisUntilFinished){
				count -= 1000;
				txt2.setText((count/1000)+"");
			}

            public void onFinish()
            {
            }
		};
    }

    public void startGame()
    {
        txt1 = (TextView) findViewById(R.id.txt1);
        txt1.setText(level+"");

        txt2 = (TextView) findViewById(R.id.txt2);
        txt2.setText(time-(10*(level-1))+"");

        p1 = (TextView) findViewById(R.id.p1);
        p2 = (TextView) findViewById(R.id.p2);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        b1.setText("");
        b1.setTextColor(Color.parseColor("#000000"));

        b2.setText("");
        b2.setTextColor(Color.parseColor("#000000"));

        b3.setText("");
        b3.setTextColor(Color.parseColor("#000000"));

        b4.setText("");
        b4.setTextColor(Color.parseColor("#000000"));

        b5.setText("");
        b5.setTextColor(Color.parseColor("#000000"));

        b6.setText("");
        b6.setTextColor(Color.parseColor("#000000"));

        b7.setText("");
        b7.setTextColor(Color.parseColor("#000000"));

        b8.setText("");
        b8.setTextColor(Color.parseColor("#000000"));

        b9.setText("");
        b9.setTextColor(Color.parseColor("#000000"));

        turn = 1;


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b1.setText("X");
                    } else {
                        turn = 1;
                        b1.setText("O");
                    }
                    gameAlive();
                }
                else{
                    Toast.makeText(MainActivity.this,"Cell is already filled",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("X");
                    } else {
                        turn = 1;
                        b2.setText("O");
                    }
                    gameAlive();
                }
                else{
                    Toast.makeText(MainActivity.this,"Cell is already filled",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("X");
                    } else {
                        turn = 1;
                        b3.setText("O");
                    }
                    gameAlive();
                }
                else{
                    Toast.makeText(MainActivity.this,"Cell is already filled",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("X");
                    } else {
                        turn = 1;
                        b4.setText("O");
                    }
                    gameAlive();
                }
                else{
                    Toast.makeText(MainActivity.this,"Cell is already filled",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("X");
                    } else {
                        turn = 1;
                        b5.setText("O");
                    }
                    gameAlive();
                }
                else{
                    Toast.makeText(MainActivity.this,"Cell is already filled",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("X");
                    } else {
                        turn = 1;
                        b6.setText("O");
                    }
                    gameAlive();
                }
                else{
                    Toast.makeText(MainActivity.this,"Cell is already filled",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("X");
                    } else {
                        turn = 1;
                        b7.setText("O");
                    }
                    gameAlive();
                }
                else{
                    Toast.makeText(MainActivity.this,"Cell is already filled",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("X");
                    } else {
                        turn = 1;
                        b8.setText("O");
                    }
                    gameAlive();
                }
                else{
                    Toast.makeText(MainActivity.this,"Cell is already filled",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("X");
                    } else {
                        turn = 1;
                        b9.setText("O");
                    }
                    gameAlive();
                }
                else{
                    Toast.makeText(MainActivity.this,"Cell is already filled",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
/*
    public void restartGame(){
        level = 1;
        time = 60;
        startGame();
    }

    public void restartLevel(){
        startGame();
    }
*/
    public void gameAlive(){
        t.cancel();
        createTimer(time);
        t.start();
        if(checkHorizontal(b1,b2,b3) ||
           checkHorizontal(b4,b5,b6) ||
           checkHorizontal(b7,b8,b9) ||
           checkVertical(b1,b4,b7)   ||
           checkVertical(b2,b5,b8)   ||
           checkVertical(b3,b6,b9)   ||
           checkDiagonal(b1,b5,b9)   ||
           checkDiagonal(b3,b5,b7))
        {
            Toast.makeText(MainActivity.this,"Winner is Player "+winner,Toast.LENGTH_LONG).show();
            new CountDownTimer(3000,3000) {

                public void onTick(long millisUntilFinished) {
                    //do nothing
                }

                public void onFinish() {
                    nextLevel();
                }
            }.start();

        }

        else if(b1.getText().toString().length() != 0 &&
           b2.getText().toString().length() != 0 &&
           b3.getText().toString().length() != 0 &&
           b4.getText().toString().length() != 0 &&
           b5.getText().toString().length() != 0 &&
           b6.getText().toString().length() != 0 &&
           b7.getText().toString().length() != 0 &&
           b8.getText().toString().length() != 0 &&
           b9.getText().toString().length() != 0)
        {
            Toast.makeText(MainActivity.this,"Level Drawn! ",Toast.LENGTH_LONG).show();
            new CountDownTimer(3000,3000) {

                public void onTick(long millisUntilFinished) {
                    //do nothing
                }

                public void onFinish() {
                    nextLevel();
                }
            }.start();
        }
    }

    public boolean checkHorizontal(Button a,Button b,Button c){;
        String aStr = a.getText().toString(),bStr = b.getText().toString(),cStr = c.getText().toString();
        if(aStr.equals(bStr) && bStr.equals(cStr) && (aStr.equals("X") || aStr.equals("O"))) {
            winGame(a,b,c);
            if(aStr.equals("X")) {
                winner = "1";
                player1++;
            }
            else {
                winner = "2";
                player2++;
            }
            return true;
        }
        return false;
    }

    public boolean checkVertical(Button a,Button b,Button c){
        String aStr = a.getText().toString(),bStr = b.getText().toString(),cStr = c.getText().toString();
        if(aStr.equals(bStr) && bStr.equals(cStr) && (aStr.equals("X") || aStr.equals("O"))) {
            winGame(a,b,c);
            if(aStr.equals("X")){
                winner = "1";
                player1++;
            }
            else{
                winner = "2";
                player2++;
            }
            return true;
        }
        return false;
    }

    public boolean checkDiagonal(Button a,Button b,Button c){
        String aStr = a.getText().toString(),bStr = b.getText().toString(),cStr = c.getText().toString();
        if(aStr.equals(bStr) && bStr.equals(cStr) && (aStr.equals("X") || aStr.equals("O"))) {
            winGame(a,b,c);
            if(aStr.equals("X")){
                winner = "1";
                player1++;
            }
            else{
                winner = "2";
                player2++;
            }
            return true;
        }
        return false;
    }

    public void nextLevel(){

        p1.setText(String.valueOf(player1));
        p2.setText(String.valueOf(player2));

        builder = new AlertDialog.Builder(this);
        builder.setTitle("Level Completed!");
        builder.setMessage("Do you want to proceed to next level?");

        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {
                level++;
				time = time-(10*(level-1));
				count = time*1000;
                startGame();
            }
        });

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                onDestroy();
            }
        });

        AlertDialog alert = builder.create();
        alert.show();
    }

    public void winGame(Button a,Button b,Button c)
    {
        a.setTextColor(Color.parseColor("#808080"));
        b.setTextColor(Color.parseColor("#808080"));
        c.setTextColor(Color.parseColor("#808080"));
    }
/*
    public void resetGame(Button a,Button b,Button c)
    {
        a.setTextColor(Color.parseColor("#FFFFFF"));
        a.setBackgroundColor(Color.parseColor("#808080"));
        b.setTextColor(Color.parseColor("#FFFFFF"));
        b.setBackgroundColor(Color.parseColor("#808080"));
        c.setTextColor(Color.parseColor("#FFFFFF"));
        c.setBackgroundColor(Color.parseColor("#808080"));
    }
*/
    public void gameOver()
    {
        String text = (player1>player2)?"Player 1":"Player 2";

        builder.setTitle("Game Over!!!");
        builder.setMessage("Winner is "+text);
        builder.show();

        onDestroy();
    }
}