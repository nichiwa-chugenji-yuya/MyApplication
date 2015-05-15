package jp.co.nichiwa_system.chugengiyuya.myapplication;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.AlertDialog;
import android.widget.EditText;
import android.view.MenuItem;


public class MainActivity3Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main_activity3);


            ImageButton atn=(ImageButton)findViewById(R.id.button12);
            ImageButton btn=(ImageButton)findViewById(R.id.button13);
            ImageButton ctn=(ImageButton)findViewById(R.id.button14);
            ImageButton dtn=(ImageButton)findViewById(R.id.button15);
            ImageButton etn=(ImageButton)findViewById(R.id.button16);
            ImageButton ftn=(ImageButton)findViewById(R.id.button17);
            ImageButton gtn=(ImageButton)findViewById(R.id.button18);
            ImageButton htn=(ImageButton)findViewById(R.id.button19);

            atn.setOnClickListener(new OnClickListener(){
                  public void onClick(View v) {

                      AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity3Activity.this);
                      alert.setTitle("ガスコンロ");

                      LayoutInflater inflater=LayoutInflater.from(MainActivity3Activity.this);
                      final View viw=inflater.inflate(R.layout.activity_popup1,null);

                      //プリファレンスの生成
                      SharedPreferences pref=
                              getSharedPreferences("Prefercnces",MODE_PRIVATE);
                      int i=0;
                      i=pref.getInt("gas",0);
                      String str=String.valueOf(i);

                      //必ずView変数で生成したデータを使うこと
                      EditText et=(EditText)viw.findViewById(R.id.textView18);

                      et.setText(str);
                      alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                          @Override
                          public void onClick(DialogInterface dialog, int which) {
                              SharedPreferences pref=
                                            getSharedPreferences("Prefercnces",MODE_PRIVATE);

                              Editor e=pref.edit();

                              EditText et=(EditText)viw.findViewById(R.id.textView18);

                              String str=et.getText().toString();

                              int i=Integer.parseInt(str);

                              e.putInt("gas",i);

                              e.commit();
                          }
                      });
                      alert.setView(viw);
                      alert.show();

                  }
            });
            btn.setOnClickListener(new OnClickListener(){
                public void onClick(View v) {

                    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity3Activity.this);
                     alert.setTitle("マッチ・ライター");

                    LayoutInflater inflater=LayoutInflater.from(MainActivity3Activity.this);
                    final View viw;
                     viw=inflater.inflate(R.layout.activity_popup2,null);

                     //プリファレンスの生成
                    SharedPreferences pref=
                            getSharedPreferences("Prefercnces",MODE_PRIVATE);
                    int i=0;
                    i=pref.getInt("matti",0);
                    String str=String.valueOf(i);
                    //必ずView変数で生成したデータを使うこと
                    EditText et=(EditText)viw.findViewById(R.id.textView20);

                    et.setText(str);
                    alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            SharedPreferences pref=
                                    getSharedPreferences("Prefercnces",MODE_PRIVATE);

                            Editor e=pref.edit();

                            EditText et=(EditText)viw.findViewById(R.id.textView20);

                            String str=et.getText().toString();

                            int i=Integer.parseInt(str);

                            e.putInt("matti",i);

                            e.commit();
                        }
                    });


                    alert.setView(viw);
                    alert.show();
            }
        });
        ctn.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {

                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity3Activity.this);
                alert.setTitle("ガスボンベ");

                LayoutInflater inflater=LayoutInflater.from(MainActivity3Activity.this);
                final View viw;
                viw=inflater.inflate(R.layout.activity_popup3,null);

                //プリファレンスの生成
                SharedPreferences pref=
                        getSharedPreferences("Prefercnces",MODE_PRIVATE);
                int i=0;
                i=pref.getInt("bombe",0);
                String str=String.valueOf(i);
                //必ずView変数で生成したデータを使うこと
                EditText et=(EditText)viw.findViewById(R.id.textView22);

                et.setText(str);
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences pref=
                                getSharedPreferences("Prefercnces",MODE_PRIVATE);

                        Editor e=pref.edit();

                        EditText et=(EditText)viw.findViewById(R.id.textView22);

                        String str=et.getText().toString();

                        int i=Integer.parseInt(str);

                        e.putInt("bombe",i);

                        e.commit();
                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });
        dtn.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {

                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity3Activity.this);
                alert.setTitle("笛");

                LayoutInflater inflater=LayoutInflater.from(MainActivity3Activity.this);
                final View viw;
                viw=inflater.inflate(R.layout.activity_popup4,null);

                //プリファレンスの生成
                SharedPreferences pref=
                        getSharedPreferences("Prefercnces",MODE_PRIVATE);
                int i=0;
                i=pref.getInt("hue",0);
                String str=String.valueOf(i);
                //必ずView変数で生成したデータを使うこと
                EditText et=(EditText)viw.findViewById(R.id.textView24);

                et.setText(str);
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences pref=
                                getSharedPreferences("Prefercnces",MODE_PRIVATE);

                        Editor e=pref.edit();

                        EditText et=(EditText)viw.findViewById(R.id.textView24);

                        String str=et.getText().toString();

                        int i=Integer.parseInt(str);

                        e.putInt("hue",i);

                        e.commit();
                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });
        etn.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {

                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity3Activity.this);
                alert.setTitle("衣類（下着）");

                LayoutInflater inflater=LayoutInflater.from(MainActivity3Activity.this);
                final View viw;
                viw=inflater.inflate(R.layout.activity_popup5,null);

                //プリファレンスの生成
                SharedPreferences pref=
                        getSharedPreferences("Prefercnces",MODE_PRIVATE);
                int i=0;
                i=pref.getInt("sitagi",0);
                String str=String.valueOf(i);
                //必ずView変数で生成したデータを使うこと
                EditText et=(EditText)viw.findViewById(R.id.textView26);

                et.setText(str);
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences pref=
                                getSharedPreferences("Prefercnces",MODE_PRIVATE);

                        Editor e=pref.edit();

                        EditText et=(EditText)viw.findViewById(R.id.textView26);

                        String str=et.getText().toString();

                        int i=Integer.parseInt(str);

                        e.putInt("sitagi",i);

                        e.commit();
                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });
        ftn.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {

                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity3Activity.this);
                alert.setTitle("ティッシュ");

                LayoutInflater inflater=LayoutInflater.from(MainActivity3Activity.this);
                final View viw;
                viw=inflater.inflate(R.layout.activity_popup6,null);

                //プリファレンスの生成
                SharedPreferences pref=
                        getSharedPreferences("Prefercnces",MODE_PRIVATE);
                int i=0;
                i=pref.getInt("thissyu",0);
                String str=String.valueOf(i);
                //必ずView変数で生成したデータを使うこと
                EditText et=(EditText)viw.findViewById(R.id.textView28);

                et.setText(str);
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences pref=
                                getSharedPreferences("Prefercnces",MODE_PRIVATE);

                        Editor e=pref.edit();

                        EditText et=(EditText)viw.findViewById(R.id.textView28);

                        String str=et.getText().toString();

                        int i=Integer.parseInt(str);

                        e.putInt("thissyu",i);

                        e.commit();
                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });
        gtn.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {

                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity3Activity.this);
                alert.setTitle("ラップ・アルミホイル");

                LayoutInflater inflater=LayoutInflater.from(MainActivity3Activity.this);
                final View viw;
                viw=inflater.inflate(R.layout.activity_popup7,null);

                //プリファレンスの生成
                SharedPreferences pref=
                        getSharedPreferences("Prefercnces",MODE_PRIVATE);
                int i=0;
                i=pref.getInt("almi",0);
                String str=String.valueOf(i);
                //必ずView変数で生成したデータを使うこと
                EditText et=(EditText)viw.findViewById(R.id.textView30);

                et.setText(str);
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences pref=
                                getSharedPreferences("Prefercnces",MODE_PRIVATE);

                        Editor e=pref.edit();

                        EditText et=(EditText)viw.findViewById(R.id.textView30);

                        String str=et.getText().toString();

                        int i=Integer.parseInt(str);

                        e.putInt("almi",i);

                        e.commit();
                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });
        htn.setOnClickListener(new OnClickListener(){
            public void onClick(View v) {

                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity3Activity.this);
                alert.setTitle("軍手");

                LayoutInflater inflater=LayoutInflater.from(MainActivity3Activity.this);
                final View viw;
                viw=inflater.inflate(R.layout.activity_popup8,null);

                //プリファレンスの生成
                SharedPreferences pref=
                        getSharedPreferences("Prefercnces",MODE_PRIVATE);
                int i=0;
                i=pref.getInt("gunte",0);
                String str=String.valueOf(i);
                //必ずView変数で生成したデータを使うこと
                EditText et=(EditText)viw.findViewById(R.id.textView32);

                et.setText(str);
                alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        SharedPreferences pref=
                                getSharedPreferences("Prefercnces",MODE_PRIVATE);

                        Editor e=pref.edit();

                        EditText et=(EditText)viw.findViewById(R.id.textView32);

                        String str=et.getText().toString();

                        int i=Integer.parseInt(str);

                        e.putInt("gunte",i);

                        e.commit();
                    }
                });

                alert.setView(viw);
                alert.show();
            }
        });

        Button btnDisp = (Button)findViewById(R.id.button11);
        btnDisp.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("jp.co.nichiwa_system.chugengiyuya.myapplication", "jp.co.nichiwa_system.chugengiyuya.myapplication.MainActivity2Activity");
                startActivity(intent);


            }
        });
        Button atnDisp = (Button)findViewById(R.id.button2);
        atnDisp.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("jp.co.nichiwa_system.chugengiyuya.myapplication", "jp.co.nichiwa_system.chugengiyuya.myapplication.MainActivity");
                startActivity(intent);


            }
        });
        Button ctnDisp = (Button)findViewById(R.id.button9);
        ctnDisp.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("jp.co.nichiwa_system.chugengiyuya.myapplication", "jp.co.nichiwa_system.chugengiyuya.myapplication.MainActivity4");
                startActivity(intent);


            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity3, menu);
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
