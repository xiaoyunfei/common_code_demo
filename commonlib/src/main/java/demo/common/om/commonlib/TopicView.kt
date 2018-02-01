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
class TopicView : TextView {

    constructor(context: Context) : this(context, null)

    constructor(context: Context, attributeSet: AttributeSet?) : this(context, attributeSet, 0)

    constructor(context: Context, attributeSet: AttributeSet?, def: Int) : super(context, attributeSet, def) {
        init()
    }

    private fun init() {
        setText(R.string.club)
        gravity = Gravity.CENTER
        visibility = View.GONE
    }
}