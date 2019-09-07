package com.example.wheelandnickname;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;



public class Main3Activity extends AppCompatActivity {

    String player1,player2;
    int p1=0,p2=0;
    static String turn = "O";
    static String tableGame[]={null,null,null,null,null,null,null,null,null};
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
    TextView t1,t2,t3,t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b10 =(Button) findViewById(R.id.restart);
        b11 =(Button) findViewById(R.id.exit);
        t1 = (TextView)findViewById(R.id.p11);
        t2 = (TextView)findViewById(R.id.p22);
        t3 = (TextView)findViewById(R.id.p1);
        t4 = (TextView)findViewById(R.id.p2);

        playerSign();
        t3.setText("player 1  "+player1);
        t4.setText("komputer  "+player2);





        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(b1.getText().toString()=="") {
                    b1.setText(turn);
                    tableGame[6]=turn;
                    if(win())
                    {
                        Toast.makeText(Main3Activity.this,
                                "Wygrał gracz: "+turn, Toast.LENGTH_LONG).show();
                        disable();
                        add();

                    }
                    tryChange();
                    if(!busy()) {
                        game();
                    }

                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(b2.getText().toString()=="") {
                    b2.setText(turn);
                    tableGame[7]=turn;
                    if(win())
                    {
                        Toast.makeText(Main3Activity.this,
                                "Wygrał gracz: "+turn, Toast.LENGTH_LONG).show();
                        disable();
                        add();

                    }
                    tryChange();
                    if(!busy()) {
                        game();
                    }

                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(b3.getText().toString()=="") {
                    b3.setText(turn);
                    tableGame[8]=turn;
                    if(win())
                    {
                        Toast.makeText(Main3Activity.this,
                                "Wygrał gracz: "+turn, Toast.LENGTH_LONG).show();
                        disable();
                        add();

                    }
                    tryChange();
                    if(!busy()) {
                        game();
                    }

                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(b4.getText().toString()=="") {
                    b4.setText(turn);
                    tableGame[3]=turn;
                    if(win())
                    {
                        Toast.makeText(Main3Activity.this,
                                "Wygrał gracz: "+turn, Toast.LENGTH_LONG).show();
                        disable();
                        add();

                    }
                    tryChange();
                    if(!busy()) {
                        game();
                    }

                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(b5.getText().toString()=="") {
                    b5.setText(turn);
                    tableGame[4]=turn;
                    if(win())
                    {
                        Toast.makeText(Main3Activity.this,
                                "Wygrał gracz: "+turn, Toast.LENGTH_LONG).show();
                        disable();
                        add();

                    }
                    tryChange();
                    if(!busy()) {
                        game();
                    }

                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(b6.getText().toString()=="") {
                    b6.setText(turn);
                    tableGame[5]=turn;
                    if(win())
                    {
                        Toast.makeText(Main3Activity.this,
                                "Wygrał gracz: "+turn, Toast.LENGTH_LONG).show();
                        disable();
                        add();

                    }
                    tryChange();
                    if(!busy()) {
                        game();
                    }

                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(b7.getText().toString()=="") {
                    b7.setText(turn);
                    tableGame[0]=turn;
                    if(win())
                    {
                        Toast.makeText(Main3Activity.this,
                                "Wygrał gracz: "+turn, Toast.LENGTH_LONG).show();
                        disable();
                        add();

                    }
                    tryChange();
                    if(!busy()) {
                        game();
                    }

                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(b8.getText().toString()=="") {
                    b8.setText(turn);
                    tableGame[1]=turn;
                    if(win())
                    {
                        Toast.makeText(Main3Activity.this,
                                "Wygrał gracz: "+turn, Toast.LENGTH_LONG).show();
                        disable();
                        add();

                    }
                    tryChange();
                    if(!busy()) {
                        game();
                    }

                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(b9.getText().toString()=="") {
                    b9.setText(turn);
                    tableGame[2]=turn;
                    if(win())
                    {
                        Toast.makeText(Main3Activity.this,
                                "Wygrał gracz: "+turn, Toast.LENGTH_LONG).show();
                        disable();
                        add();

                    }
                    tryChange();
                    if(!busy()) {
                        game();
                    }

                }
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                restart();
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

        set();
    }

    public void playerSign()
    {
        Random rand = new Random();
        System.out.println(rand.nextInt(2));
        if(rand.nextInt(2)==1)
        {
            player1="X";
            player2="O";
        }
        else
        {
            player2="X";
            player1="O";
        }

    }

    public void tryChange()
    {
        if(turn == "X")
        {
            turn="O";
        }
        else
        {
            turn = "X";
        }
    }


    public boolean win() {
        return ((tableGame[0] == turn && tableGame[1]==turn && tableGame[2] == turn)
                ||(tableGame[3] == turn && tableGame[4] == turn && tableGame[5] == turn)
                ||(tableGame[6] == turn && tableGame[7] == turn && tableGame[8] == turn)
                ||(tableGame[6] == turn && tableGame[3] == turn && tableGame[0] == turn)
                ||(tableGame[7] == turn && tableGame[4] == turn && tableGame[1] == turn)
                ||(tableGame[8] == turn && tableGame[5] == turn && tableGame[2] == turn)
                ||(tableGame[6] == turn && tableGame[4] == turn && tableGame[2] == turn)
                ||(tableGame[8] == turn && tableGame[4] == turn && tableGame[0] == turn));
    }

    public void set()
    {
        turn = "O";
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        for(int i=0;i<tableGame.length;i++)
        {
            tableGame[i]=null;
        }
        game();
    }

    public void restart()
    {
        turn = "O";
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        for(int i=0;i<tableGame.length;i++)
        {
            tableGame[i]=null;
        }
        enable();
        playerSign();
        t3.setText("player 1  "+player1);
        t4.setText("komputer  "+player2);
        game();



    }

    public void add()
    {
        if(turn==player1)
        {
            p1+=1;
            t1.setText(Integer.toString(p1));
        }
        else
        {
            p2+=1;
            t2.setText(Integer.toString(p2));
        }
    }

    void disable()
    {
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
    }

    void enable()
    {
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
    }

    void motion(String[] board,String letter,int index)
    {
        try {
            board[index]=letter;

        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }

    String[] Copy() {
        String copyBoard[]=new String[9];
        int i=0;
        for(String s: tableGame) {
            copyBoard[i] = s;
            i++;
        }
        return copyBoard;
    }

    Boolean freeField(String list[],int index)
    {
        return list[index]==null;
    }


    public boolean winIt(String[] table, String t) {
        return ((table[0] == t && table[1] == t && table[2] == t)
                || (table[3] == t && table[4] == t && table[5] == t)
                || (table[6] == t && table[7] == t && table[8] == t)
                || (table[6] == t && table[3] == t && table[0] == t)
                || (table[7] == t && table[4] == t && table[1] == t)
                || (table[8] == t && table[5] == t && table[2] == t)
                || (table[6] == t && table[4] == t && table[2] == t)
                || (table[8] == t && table[4] == t && table[0] == t));
    }


    int RandomMotion(int[]capabilities)
    {
        ArrayList<Integer> array =new ArrayList<Integer>();

        for(int i = 0; i<capabilities.length;i++)
        {
            if(tableGame[capabilities[i]]==null)
            {
                array.add(capabilities[i]);
            }
        }
        if(array.size()!=0) {
            int rnd = new Random().nextInt(array.size());
            return array.get(rnd);
        }

        return -1;
    }

    int itMotion()
    {
        for(int i = 0; i<9;i++)
        {
            String copy[] = Copy();
            if(freeField(copy,i))
            {
                motion(copy,player2,i);
                if(winIt(copy,player2))
                {
                    return i;
                }
            }

        }

        for(int i = 0; i<9;i++)
        {
            String copy[] = Copy();
            if(freeField(copy,i))
            {
                motion(copy,player1,i);
                if(winIt(copy,player1))
                {
                    return i;
                }
            }

        }


        int motion=RandomMotion(new int[]{0,2,6,8});
        if(motion!= -1)
        {return RandomMotion(new int[]{0,2,6,8});}



        if(freeField(tableGame,4))
        {
            return 4;
        }


        return RandomMotion(new int[]{1,3,5,7});
    }

    Boolean busy()
    {
        for(String i : tableGame)
        {
            if(i=="X" || i=="O"){return false;}
        }
        return true;
    }

    void buttons(int index)
    {
        if(index==0)
        {
            b7.setText(player2);
        }
        if(index==1)
        {
            b8.setText(player2);
        }
        if(index==2)
        {
            b9.setText(player2);
        }
        if(index==3)
        {
            b4.setText(player2);
        }
        if(index==4)
        {
            b5.setText(player2);
        }
        if(index==5)
        {
            b6.setText(player2);
        }
        if(index==6)
        {
            b1.setText(player2);
        }
        if(index==7)
        {
            b2.setText(player2);
        }
        if(index==8)
        {
            b3.setText(player2);
        }
    }



    void game()
    {
        if (turn == player2) {


            int motion = itMotion();
            motion(tableGame, player2, motion);
            buttons(motion);




            if (winIt(tableGame, player2)) {
                Toast.makeText(Main3Activity.this,
                        "Wygrał komputer: " + turn, Toast.LENGTH_LONG).show();
                disable();
                add();
            }

            if (busy()) {
                disable();

            }
            tryChange();

        }


    }
}





