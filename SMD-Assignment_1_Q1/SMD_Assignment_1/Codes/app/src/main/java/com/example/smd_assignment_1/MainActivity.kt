package com.example.smd_assignment_1


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

interface Cricketer {
    val Name: String
    val Age: Int
    val Nationality: String

    fun Print()
}

interface Batsman : Cricketer {
    val Score: Int
    val BatsmenRanking: Int

    fun getBatsmanRanking(): Int // Rename to avoid conflict
}

interface Bowler : Cricketer {
    val Wickets: Int
    val BowlingRanking: Int

    fun getBowlerRanking(): Int // Rename to avoid conflict
}

class AllRounder(
    override val Name: String,
    override val Age: Int,
    override val Nationality: String,
    override val Score: Int,
    override val BatsmenRanking: Int,
    override val BowlingRanking: Int,
    override val Wickets: Int,
    val Ranking: Int
) : Batsman, Bowler {
    override fun Print() {
        println("Name: $Name")
        println("Age: $Age")
        println("Nationality: $Nationality")
        println("Score: $Score")
        println("Batsmen Ranking: $BatsmenRanking")
        println("Bowler Ranking: $BowlingRanking")
        println("Wickets: $Wickets")
        println("Ranking: $Ranking")
    }


    override fun getBatsmanRanking(): Int {
        return BatsmenRanking
    }

    override fun getBowlerRanking(): Int {
        return BowlingRanking
    }
}


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val allRounder = AllRounder("Shadab Khan", 24, "Pakistan", 7000, 5, 12,1000, 8 )
        allRounder.Print()
}
}
