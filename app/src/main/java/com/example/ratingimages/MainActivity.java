package com.example.ratingimages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText УказатьИмя;
    //Button Подтверждение;

    TextView Sum;
    TextView СуммаЛайков;
    TextView СуммаДизлайков;

    TextView Выбор;
    String str;
    int like, dis, sum;

    String ИмяПользователя;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        УказатьИмя = (EditText)findViewById(R.id.editTextTextPersonName);
        //Подтверждение = (Button)findViewById(R.id.button);

        СуммаЛайков = (TextView)findViewById(R.id.ValueL);
        СуммаДизлайков = (TextView)findViewById(R.id.ValueD);

        Выбор = (TextView)findViewById(R.id.YourChoose);

        Sum = (TextView)findViewById(R.id.Sum);

        like = 0;
        dis = 0;
        sum = 0;

        ИмяПользователя = "";
    }
    public void onButton(View V)
    {
        ИмяПользователя = УказатьИмя.getText().toString();
        Выбор.setText(ИмяПользователя);
    }
    public void onDislike(View V)
    {
        if(ИмяПользователя != "")
        {
            dis -= 1;
            sum -=1;
            str = Integer.toString(dis);
            Выбор.setText(getResources().getString(R.string.chooseD));
            СуммаДизлайков.setText(str);
            Sum.setText(Integer.toString(sum));
        }
        else
        {
            Выбор.setText(getResources().getString(R.string.error));
        }
    }
    public void onLike(View V)
    {
        if(ИмяПользователя != "")
        {
            like += 1;
            sum += 1;
            str = Integer.toString(like);
            Выбор.setText(getResources().getString(R.string.chooseL));
            СуммаЛайков.setText(str);
            Sum.setText(Integer.toString(sum));
        }
        else
        {
            Выбор.setText(getResources().getString(R.string.error));
        }
    }
}