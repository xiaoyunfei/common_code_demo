package demo.common.om.commoncode

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import demo.common.om.commonlib.ArticleView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        var articleView = ArticleView(this)
        articleView.visibility = View.VISIBLE
        setContentView(articleView)
    }
}
