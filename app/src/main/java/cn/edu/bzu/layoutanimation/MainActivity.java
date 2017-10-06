package cn.edu.bzu.layoutanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.LayoutAnimationController;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout rootView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rootView= (LinearLayout) findViewById(R.id.activity_main);
        ScaleAnimation scaleAnimation=new ScaleAnimation(0,1,0,1);
        scaleAnimation.setDuration(5000);
        LayoutAnimationController controller=new LayoutAnimationController(scaleAnimation,0.5f);
        //LayoutAnimationController用于为一个layout里面的控件，或者是一个ViewGroup里面的控件设置动画效果
        controller.setOrder(LayoutAnimationController.ORDER_RANDOM);//设置控件显示的顺序
         /*LayoutAnimationController.ORDER_NORMAL;    //顺序显示
          LayoutAnimationController.ORDER_REVERSE;//反显示
          LayoutAnimationController.ORDER_RANDOM//随机显示*/
        rootView.setLayoutAnimation(controller);
    }
}
