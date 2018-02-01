package demo.common.om.commonlib

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import android.widget.TextView

/**
 * Description：
 * Created by xiaoyunfei on 2018/2/1.
 * Project：Period
 */
 class ArticleView : TextView {
    constructor(context: Context) : this(context, null)

    constructor(context: Context, attr: AttributeSet?) : this(context, attr, 0)

    constructor(context: Context, attr: AttributeSet?, def: Int) : super(context, attr, def) {
        init()
    }

    private fun init() {
        setText(R.string.article)
        gravity = Gravity.CENTER
        visibility = View.GONE
    }
}