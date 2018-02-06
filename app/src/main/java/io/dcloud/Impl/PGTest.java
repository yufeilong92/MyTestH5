package io.dcloud.Impl;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import io.dcloud.common.DHInterface.AbsMgr;
import io.dcloud.common.DHInterface.IFeature;
import io.dcloud.common.DHInterface.IWebview;
import io.dcloud.common.util.JSUtil;

/**
 * All rights Reserved, Designed By www.lawyee.com
 *
 * @version V 1.0 xxxxxxxx
 * @Title: MyTest
 * @Package io.dcloud.Impl
 * @Description: $todo$
 * @author: YFL
 * @date: 2018/2/6 11:50
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2018 www.lawyee.com Inc. All rights reserved.
 * 注意：本内容仅限于北京法意科技有限公司内部传阅，禁止外泄以及用于其他的商业目
 */
public class PGTest implements IFeature {
    @Override
    public String execute(IWebview iWebview, String action, String[] strings) {
        if ("PluginTestFunctionSyncArrayArgu".equals(action)) {
            JSONArray newArray = null;
            JSONObject retJSONObj = null;

            try {
                newArray = new JSONArray(strings[0]);
                String inValue1 = newArray.getString(0);
                String inValue2 = newArray.getString(1);
                String inValue3 = newArray.getString(2);
                String inValue4 = newArray.getString(3);

                retJSONObj = new JSONObject();
                retJSONObj.putOpt("RetArgu1", inValue1);
                retJSONObj.putOpt("RetArgu2", inValue2);
                retJSONObj.putOpt("RetArgu3", inValue3);
                retJSONObj.putOpt("RetArgu4", inValue4);

            } catch (JSONException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

            return JSUtil.wrapJsVar(retJSONObj);
        } else if (action.equals("getIntData")) {
            JSONObject retJSONObj = null;

            try {
                retJSONObj = new JSONObject();
                retJSONObj.putOpt("One", "1");
                retJSONObj.putOpt("Two", 2);
                retJSONObj.putOpt("Three", true);
                retJSONObj.putOpt("Four", 2.05);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return JSUtil.wrapJsVar(retJSONObj);
        }else if (action.equals("getbooleanData")){
            return JSUtil.wrapJsVar(true);
        }
        return null;
    }

    @Override
    public void init(AbsMgr absMgr, String s) {

    }

    @Override
    public void dispose(String s) {

    }
}
