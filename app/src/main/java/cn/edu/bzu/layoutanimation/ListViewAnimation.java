package cn.edu.bzu.layoutanimation;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.animation.LayoutAnimationController;
import android.view.animation.ScaleAnimation;
import android.widget.ArrayAdapter;
/* 1、ListActivity可以不用setContentView(R.layout.main)，它默认是LIstView占满屏。
   2、如果想在屏幕中显示其他控件，如文本框和按钮之类，可以采用如下方法：
      a、代码中添加：setContentView(R.layout.main)
      b、在 main.xml 文件中，添加一个LIstView控件，和一个 TextView 控件，注意它们 id 必须为"@id/Android:list"、
         "@id/android:empty"；前一个表示匹配的ListView，后一个表示若LIstView没有内容则显示的提示
*/
public class ListViewAnimation extends ListActivity {
    private ArrayAdapter<String> adapter;
    private LayoutAnimationController layoutAnimationController;
    private ScaleAnimation scaleAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,new String[]{"hello","nohello","fuck","hi","hello","nohello","fuck","hi","hello","nohello","fuck","hi"});
        setListAdapter(adapter);
        scaleAnimation=new ScaleAnimation(0,1,0,1);
        scaleAnimation.setDuration(1000);
        layoutAnimationController=new LayoutAnimationController(scaleAnimation,0.5f);
        getListView().setLayoutAnimation(layoutAnimationController);
    }
}
