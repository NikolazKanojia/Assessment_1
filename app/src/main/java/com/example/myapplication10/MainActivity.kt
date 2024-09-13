package com.example.myapplication10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var prizeList:ArrayList<Prize>
    lateinit var userdata: java.util.ArrayList<Userinfo>
    lateinit var userdataper: java.util.ArrayList<Competitionifo>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView=findViewById<RecyclerView>(R.id.recyclerviewforPrize)
        val recyclerview1 = findViewById<RecyclerView>(R.id.recyclerview)
        val recyclerview2= findViewById<RecyclerView>(R.id.recyclerview2)
        prizeList=ArrayList()
        userdata= java.util.ArrayList()
        userdataper= java.util.ArrayList()
        val Adapter= priceAdapter(prizeList)
        val adapter = UserinfoAdapter(userdata)
        val adapter2 =competionAdapter(this ,userdataper)
        addDataprize()
        userdata()
        userdatapercentage()
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerview1.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerview2.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        recyclerView.setHasFixedSize(true)
        recyclerView.adapter=Adapter
        recyclerview1.adapter = adapter
        recyclerview2.adapter=adapter2




    }

   private fun addDataprize()
   {
       prizeList.add(Prize(R.drawable.tangoremovedbg,"watch"))
       prizeList.add(Prize(R.drawable.targetwithnobg,"Television"))
       prizeList.add(Prize(R.drawable.watch,"phone"))
       prizeList.add(Prize(R.drawable.tangoremovedbg,"waterbottel"))
       prizeList.add(Prize(R.drawable.hourglass,"wall watch"))
   }
    private fun userdata()
    {
        userdata.add(Userinfo(0,"Name",userdataper))
        userdata.add(Userinfo(R.drawable.user,"Kassidy Smith",userdataper))
        userdata.add(Userinfo(R.drawable.user,"Emory Marsh",userdataper))
        userdata.add(Userinfo(R.drawable.user,"Montgomery",userdataper))
        userdata.add(Userinfo(R.drawable.user,"Arian Vang",userdataper))
        userdata.add(Userinfo(R.drawable.user,"Willie Ortiz",userdataper))
        userdata.add(Userinfo(R.drawable.user,"Anna Gonzales",userdataper))
        userdata.add(Userinfo(R.drawable.user,"Emmalyn Mejia",userdataper))
        userdata.add(Userinfo(R.drawable.user,"Destiny Peck",userdataper))
        userdata.add(Userinfo(R.drawable.user,"Saylor Petersen",userdataper))
        userdata.add(Userinfo(R.drawable.user,"Jessica Sanchez",userdataper))
        userdata.add(Userinfo(R.drawable.user,"Kaylie Kramer",userdataper))
        userdata.add(Userinfo(R.drawable.user,"Brielle Le",userdataper))
        userdata.add(Userinfo(R.drawable.user,"Rylie Osborne",userdataper))
        userdata.add(Userinfo(R.drawable.user,"Augustus Jimenez",userdataper))
        userdata.add(Userinfo(R.drawable.user,"Kylan Williamson",userdataper))
        userdata.add(Userinfo(R.drawable.user,"Quinn Tate",userdataper))
        userdata.add(Userinfo(R.drawable.user,"Jase Savage",userdataper))
        userdata.add(Userinfo(R.drawable.user,"Colton Shaw",userdataper))
        userdata.add(Userinfo(R.drawable.user,"Elsa Perry",userdataper))
    }
    private fun userdatapercentage()
    {
        userdataper.add(Competitionifo("C1","C2","C3","C4","C5","C6","C7"))


        userdataper.add(Competitionifo("100","24","30","55","2","0","88"))
        userdataper.add(Competitionifo("5","3","0","0","0","0","0"))
        userdataper.add(Competitionifo("55","6","1","0","0","0","0"))
        userdataper.add(Competitionifo("0","100","30","45","2","0","0"))
        userdataper.add(Competitionifo("9","7","0","0","0","0","0"))
        userdataper.add(Competitionifo("68","99","100","0","0","0","0"))
        userdataper.add(Competitionifo("33","24","90","0","0","0","0"))
        userdataper.add(Competitionifo("12","55","43","0","0","0","0"))
        userdataper.add(Competitionifo("99","89","12","0","0","0","0"))
        userdataper.add(Competitionifo("100","76","33","55","0","0","0"))
        userdataper.add(Competitionifo("33","24","90","23","0","0","0"))
        userdataper.add(Competitionifo("78","56","88","34","0","0","0"))
        userdataper.add(Competitionifo("43","76","12","0","0","0","0"))
        userdataper.add(Competitionifo("90","24","30","0","0","0","0"))
        userdataper.add(Competitionifo("2","24","9","0","0","0","0"))
        userdataper.add(Competitionifo("07","24","76","0","0","0","0"))
        userdataper.add(Competitionifo("8","24","11","0","0","0","0"))
        userdataper.add(Competitionifo("56","24","3","0","0","0","0"))
        userdataper.add(Competitionifo("50","24","0","0","0","0","0"))




    }


}