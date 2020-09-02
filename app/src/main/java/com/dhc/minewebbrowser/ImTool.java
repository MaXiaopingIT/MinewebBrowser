package com.dhc.minewebbrowser;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * @author xp.m
 * @date 2019/8/6 0006 16:48
 * @description 输入法工具类
 **/
public class ImTool {
    /**
     * 关闭输入法
     */
    public static void closeKeyBoard(Context context, View editText){
	//我加的
        InputMethodManager imm = (InputMethodManager) context
                .getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    /**
     *打开输入法
     */
    public void showSoftInputFromWindow(EditText editText){
        InputMethodManager inputManager =
                (InputMethodManager) editText.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.showSoftInput(editText, 0);
    }
}
