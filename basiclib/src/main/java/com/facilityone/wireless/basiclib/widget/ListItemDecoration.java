package com.facilityone.wireless.basiclib.widget;

import androidx.annotation.ColorInt;

/**
 * Author：gary
 * Email: xuhaozv@163.com
 * description:
 * Date: 2018/5/16 下午2:32
 */
public class ListItemDecoration extends DefaultItemDecoration {

    public ListItemDecoration(@ColorInt int color) {
        super(color);
    }

    public ListItemDecoration(@ColorInt int color, int dividerWidth, int dividerHeight, int... excludeViewType) {
        super(color, dividerWidth, dividerHeight, excludeViewType);
    }
}
