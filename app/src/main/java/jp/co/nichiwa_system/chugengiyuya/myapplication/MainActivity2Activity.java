package jp.co.nichiwa_system.chugengiyuya.myapplication;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.os.Bundle;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.MenuItem;
import android.widget.EditText;


public class MainActivity2Activity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        loadInt((EditText)findViewById(R.id.textView6),"otona_people");
        loadInt((EditText)findViewById(R.id.textView9),"kodomo_people");
        loadInt((EditText) findViewById(R.id.textView12), "kizitu_hiduke");
        loadInt((EditText)findViewById(R.id.textView15),"setei_hiduke");
        loadInt((EditText)findViewById(R.id.textView35),"youzi_people");


        Button btnDisp = (Button)findViewById(R.id.button5);
        btnDisp.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
               if(
                    saveInt((EditText)findViewById(R.id.textView6),"otona_people")&&
                    saveInt((EditText)findViewById(R.id.textView9),"kodomo_people")&&
                    saveInt((EditText)findViewById(R.id.textView12), "kizitu_hiduke")&&
                    saveInt((EditText)findViewById(R.id.textView15),"setei_hiduke")&&
                    saveInt((EditText)findViewById(R.id.textView35),"youzi_people")
                ){
                    finish();

                }else{
                    Builder alertDialog=new Builder(MainActivity2Activity.this);

                    alertDialog.setTitle("Error");
                    alertDialog.setMessage("値が入力されていません");

                    alertDialog.setPositiveButton("はい", null);

                    alertDialog.create();
                    alertDialog.show();
                }


                Intent intent = new Intent();
                intent.setClassName("jp.co.nichiwa_system.chugengiyuya.myapplication", "jp.co.nichiwa_system.chugengiyuya.myapplication.MainActivity");
                startActivity(intent);


            }
        });
        Button atnDisp = (Button)findViewById(R.id.button6);
        atnDisp.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("jp.co.nichiwa_system.chugengiyuya.myapplication", "jp.co.nichiwa_system.chugengiyuya.myapplication.MainActivity4");
                startActivity(intent);


            }
        });
        Button ctnDisp = (Button)findViewById(R.id.button7);
        ctnDisp.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("jp.co.nichiwa_system.chugengiyuya.myapplication", "jp.co.nichiwa_system.chugengiyuya.myapplication.MainActivity3Activity");
                startActivity(intent);


            }
        });
    }
    //値データをプレファレンスで保存する関数
    public void loadInt(EditText et,String name)
    {
        SharedPreferences pref=
                  getSharedPreferences("Preferences",MODE_PRIVATE);
        int i=pref.getInt(name,0);
        String str=String.valueOf(i);
        et.setText(str);

    }
    public boolean saveInt(EditText et,String name)
    {
        //プレファレンスの生成
        SharedPreferences pref;

        pref = getSharedPreferences("Preferences",MODE_PRIVATE);//箱を作る
        Editor e = pref.edit();

        String str=et.getText().toString();

        if(str.length()<=0)
        {
            return false;
        }

        int i=Integer.parseInt(str);

        e.putInt(name,i);
        e.commit();//保存する

        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
