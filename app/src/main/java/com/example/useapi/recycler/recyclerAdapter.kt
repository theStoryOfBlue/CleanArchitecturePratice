package com.example.useapi.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.useapi.databinding.ItemListBinding


class recyclerAdapter: RecyclerView.Adapter<recyclerAdapter.MyViewHolder>() {

    var datalist = mutableListOf<recyclerData>()//리사이클러뷰에서 사용할 데이터 미리 정의 -> 나중에 MainActivity등에서 datalist에 실제 데이터 추가

    inner class MyViewHolder(private val binding: ItemListBinding): RecyclerView.ViewHolder(binding.root) {
        //원래라면 class MyViewHolder(itemView:View):RecyclerView.Viewholder(itemView)인데 바인딩으로 구현!
        //binding전달받았기 때문에 홀더 내부 어디에서나 binding 사용가능
        fun bind(data: recyclerData){
            //binding.dogPhotoImg.=dogData.dog_img
            binding.textView6.text= data.num +"."
            binding.textView7.text= data.name
        }
    }

    //만들어진 뷰홀더 없을때 뷰홀더(레이아웃) 생성하는 함수
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding=ItemListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int =datalist.size

    //recyclerview가 viewholder를 가져와 데이터 연결할때 호출
    //적절한 데이터를 가져와서 그 데이터를 사용하여 뷰홀더의 레이아웃 채움
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(datalist[position])
    }
}