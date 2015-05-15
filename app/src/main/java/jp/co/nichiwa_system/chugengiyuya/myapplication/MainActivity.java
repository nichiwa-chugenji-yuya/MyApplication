packagejp.co.nichiwa_system.chugengiyuya.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import java.util.Calendar;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView)findViewById(R.id.textView3);
        Calendar v=Calendar.getInstance();
        tv.setText(v.get(Calendar.YEAR) + "年"+ (v.get(Calendar.MONTH) +1)+"月"+v.get(Calendar.DATE)+"日");


        Button btnDisp = (Button)findViewById(R.id.button4);
        btnDisp.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("jp.gr.java_conf.nichiwa_system.chugengiyuya.myapplication", "jp.gr.java_conf.nichiwa_system.chugengiyuya.myapplication.MainActivity2Activity");
                startActivity(intent);


            }
        });
        Button atnDisp = (Button)findViewById(R.id.button3);
        atnDisp.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("jp.gr.java_conf.nichiwa_system.chugengiyuya.myapplication", "jp.gr.java_conf.nichiwa_system.chugengiyuya.myapplication.MainActivity3Activity");
                startActivity(intent);


            }
        });
        Button ctnDisp = (Button)findViewById(R.id.button2);
        ctnDisp.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("jp.gr.java_conf.nichiwa_system.chugengiyuya.myapplication", "jp.gr.java_conf.nichiwa_system.chugengiyuya.myapplication.MainActivity4");
                startActivity(intent);


            }
        });
 }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar
        // if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id=item.getItemId();

        //noinspection SimplifiableIfStatement
        if(id==R.id.action_settings){
        return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
