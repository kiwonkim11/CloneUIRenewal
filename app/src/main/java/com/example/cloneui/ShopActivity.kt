package com.example.cloneui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cloneui.databinding.ActivityShopBinding

private lateinit var binding: ActivityShopBinding
private val dataList = mutableListOf<Food>()
class ShopActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityShopBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dataList.add(Food(R.drawable.ic_shop1, "영커피&수제붕어빵", 5.0, "밀크빙수, 팥빙수", "39~54분", "0원~1,500원", 8000))
        dataList.add(Food(R.drawable.ic_shop2, "김호두", 5.0, "호두과자 커피 Set", "39~54분", "0원~3,000원", 3000))
        dataList.add(Food(R.drawable.ic_shop3, "쑝쑝돈까스", 5.0, "[실속있는] 사뽀로 경양식", "30~45분", "1,100원~3,100원", 8500))
        dataList.add(Food(R.drawable.ic_shop4, "진세이우동 족타현", 4.9, "(해장) 순두부 짬뽕우동, 마제 우동", "48~63분", "500원~2,500원", 8500))
        dataList.add(Food(R.drawable.ic_shop5, "덮밥만드는남자", 5.0, "®[1.5인분][대.박.맛.집]고기덮밥,\n [맛없으면 환불un해줌]돈까스카레덮밥,\n [매움주의]불닭덮밥", "39~54분", "0원~2,500원", 8500))
        dataList.add(Food(R.drawable.ic_shop6, "국가대표김치찜", 5.0, "[꿀템] 1인도시락, 고기없이 담백한 두부 \n", "34~49분", "1,000원~3,000원", 10000))
        dataList.add(Food(R.drawable.ic_shop7, "덮밥90도씨", 4.9, "[NEW 신메뉴] 쭈꾸미덮밥, [NEW 신메뉴 \n", "33~48분", "0원~3,000원", 8000))
        dataList.add(Food(R.drawable.ic_shop8, "모두의닭강정", 5.0, "1인 닭강정 세트", "49~64분", "200원~2,200원", 10900))
        dataList.add(Food(R.drawable.ic_shop9, "든든소고기비빔밥 & 뼈해장국", 4.8, "든든 소고기비빔밥", "29~44분", "4,500원", 6500))
        dataList.add(Food(R.drawable.ic_shop10, "김치백서", 4.9, "[재주문율 100%]1인 김치찜", "39~54분", "0원~2,500원", 10000))

        val adapter = FoodAdapter(dataList)
        binding.recyclerview.adapter = adapter
        binding.recyclerview.layoutManager = LinearLayoutManager(this)
        binding.recyclerview.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))

        binding.ivBack.setOnClickListener {
            finish()
        }

    }

}