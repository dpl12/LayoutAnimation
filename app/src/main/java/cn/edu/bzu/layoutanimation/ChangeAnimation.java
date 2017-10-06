package cn.edu.bzu.layoutanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ChangeAnimation extends AppCompatActivity {
    private LinearLayout rootview;
    private View.OnClickListener btn_onclickListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            rootview.removeView(view);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_animation);
        rootview= (LinearLayout) findViewById(R.id.change_animation);
    }
    private void addButton(){
        Button btn=new Button(this);
        btn.setText("remove me");
        rootview.addView(btn);

        btn.setOnClickListener(btn_onclickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.action_add){
            addButton();
        }
        return super.onOptionsItemSelected(item);
    }
}
