package com.lee.machinosensei.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.lee.machinosensei.R
import kotlinx.android.synthetic.main.activity_slide.*
import kotlinx.android.synthetic.main.item_intropager.view.*

class SlideActivity : AppCompatActivity() {

    private var pageItemList = ArrayList<PageItem>()
    private  lateinit var introPagerAdapter: IntroPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slide)

        var btnAppStart: Button =findViewById(R.id.btn_slide_app_start)

        btnAppStart.setOnClickListener {
            val intent = Intent(this,
                HomeActivity::class.java)
            startActivity(intent)
        }

        pageItemList.add(PageItem(R.color.slideBg1, R.drawable.ic_menu_gallery,"content1"))
        pageItemList.add(PageItem(R.color.slideBg2, R.drawable.ic_menu_camera,"content2"))
        pageItemList.add(PageItem(R.color.slideBg3, R.drawable.ic_menu_slideshow,"content3"))

        introPagerAdapter = IntroPagerAdapter(pageItemList)

        vpIntro.apply {
            adapter = introPagerAdapter
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
            dots_indicator.setViewPager2(this)
        }
//        vpIntro.adapter = introPagerAdapter
//        vpIntro.orientation = ViewPager2.ORIENTATION_HORIZONTAL
    }

    class IntroPagerAdapter(private var pageList: ArrayList<PageItem>)
        : RecyclerView.Adapter<IntroPagerHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroPagerHolder {
            return IntroPagerHolder(LayoutInflater.from(parent.context)
                .inflate(R.layout.item_intropager, parent, false))
        }

        override fun getItemCount(): Int {
            return pageList.size
        }

        override fun onBindViewHolder(holder: IntroPagerHolder, position: Int) {
            holder.bindwithView(pageList[position])
        }

    }

    class IntroPagerHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val itemIage : ImageView = itemView.ivImage
        private val itemContent : TextView = itemView.tvContent
        private val itemBg : LinearLayout = itemView.pagerBg

        fun bindwithView(pageItem: PageItem) {
            itemIage.setImageResource(pageItem.imageSrc)
            itemContent.text = pageItem.content
            itemBg.setBackgroundResource(pageItem.bgColol)
        }
    }

    class PageItem(val bgColol: Int, val imageSrc: Int, val content: String) {
    }
}