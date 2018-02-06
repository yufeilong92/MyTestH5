package io.dcloud.Impl;

import android.annotation.SuppressLint;
import android.widget.Toast;

import com.bozo.badger.ShortcutBadger;

import org.json.JSONArray;
import org.json.JSONException;

import io.dcloud.common.DHInterface.IWebview;
import io.dcloud.common.DHInterface.StandardFeature;

/**
 * All rights Reserved, Designed By www.lawyee.com
 *
 * @version V 1.0 xxxxxxxx
 * @Title: MyTest
 * @Package com.lawyee
 * @Description: $todo$
 * @author: YFL
 * @date: 2018/2/5 10:23
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018 www.lawyee.com Inc. All rights reserved.
 * 注意：本内容仅限于北京法意科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class ShowLogImpl extends StandardFeature {
    public static final String TAG = "ShowLog.class";
    /**
     * 显示错误
     * @param
     */
    @SuppressLint("NewApi")
    public void erromsg(IWebview iWebview, JSONArray jsonArray){
        int count ;
            try {
                count = jsonArray.getInt(1);
                Toast.makeText(iWebview.getContext(),"2222",Toast.LENGTH_SHORT).show();
                ShortcutBadger.applyCount(iWebview.getContext(), count);
            } catch (JSONException e) {
                e.printStackTrace();
        }
    }

    /**
     * 删除内容
     * @param iWebview
     * @param jsonArray
     */
    public void removedata(IWebview iWebview, JSONArray jsonArray){
        ShortcutBadger.applyCount(iWebview.getContext(), 0);
    }

    /**
     * 传递参数
     * @param iWebview
     * @param jsonArray
     */
    public void addString(IWebview iWebview, JSONArray jsonArray){
        try {
            String string = jsonArray.getString(1);
            Toast.makeText(iWebview.getContext(),""+string,Toast.LENGTH_SHORT).show();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /***
     * 测试返回数
     * @param iWebview
     * @param jsonArray
     * @return
     */
    public String getStringData(IWebview iWebview, JSONArray jsonArray) {
      Toast.makeText(iWebview.getContext(),"测试获取数据",Toast.LENGTH_SHORT).show();
        return "测试返回数据";
    }


}
