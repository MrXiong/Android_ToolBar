package com.zx.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends ToolBarActivity {
 /*   1.继承ToolBarActivity，默认就有返回箭头,标题居中，继承ToolBarLeftTitleActivity标题居左
    2.把返回箭头换成叉：setNavigationIcon(R.drawable.ic_web_close);去掉返回箭头：setNavigationIcon(null);
    3.想要改变标题栏中间的字直接在menifest中的
    <activity
    android:name=".BusinessActivity"
    android:label="在这里改字" >  label 改就行了
    </activity>
    4。需要添加头部右边的图标请正常添加menu
    5.改变右上角menu的字体颜色，在style中添加
    <item name="actionMenuTextColor">@android:color/white</item>
    （记住前面不要有android:，不然就拜拜）
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/*    看一看menu.add方法的参数：
    第一个int类型的group ID参数，代表的是组概念，你可以将几个菜单项归为一组，以便更好的以组的方式管理你的菜单按钮。
    第二个int类型的item ID参数，代表的是项目编号。这个参数非常重要，一个item ID对应一个menu中的选项。在后面使用菜单的时候，就靠这个item ID来判断你使用的是哪个选项。
    第三个int类型的order ID参数，代表的是菜单项的显示顺序。默认是0，表示菜单的显示顺序就是按照add的显示顺序来显示。
    第四个String类型的title参数，表示选项中显示的文字。*/
    public boolean onCreateOptionsMenu(Menu menu) {
        //条用基类的方法，以便调出系统菜单（如果有的话）
        //super.onCreateOptionsMenu(menu);
        MenuItem item1 = menu.add(0, 1, 1, "实例1");
        //item1.setIcon(R.drawable.icon_search);
        item1.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);

        MenuItem item2 = menu.add(0, 2, 2, "实例2");
        item2.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        //返回值为“true”,表示菜单可见，即显示菜单
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == 1) {
            Toast.makeText(this, "实例1", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId() == 2) {
            Toast.makeText(this, "实例2", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
