package com.shpearce.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.shpearce.dinnerdecider.databinding.ActivityMainBinding
import java.util.Random

//The Dinner Decider App
class MainActivity : AppCompatActivity() {

    //Binding to elements that exist in the Apps User Interface
    private lateinit var binding:ActivityMainBinding

    //The list of Restaurants that will be selected that will decide where user will go to dinner
    val foodList = arrayListOf("McDonalds", "Sonic", "Olive Garden", "Panda Express", "Domino's Pizza", "Raising Cane's")

    //What needs to occur when the app is created?
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Set the binding that will be used to reference elements in the main Activity Interface
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //What happens when the decideBtn is pressed?
        binding.decideBtn.setOnClickListener {
            //Create Random Object
            val random = Random()

            //Select random integer value from range of the foodList Array
            val randomFood = random.nextInt(foodList.count())

            //set selectedFoodTxt to be the an element from foodList at index randomFood
            binding.selectedFoodTxt.text = foodList[randomFood]
        }

        //What happens when the addFoodBtn is pressed?
        binding.addFoodBtn.setOnClickListener {

            //Extract data from addFoodTxt and convert it into a string and store it in newFood
            val newFood = binding.addFoodTxt.text.toString()

            //Add newFood to the foodList
            foodList.add(newFood)

            //Clear the new Input Item after it has been added to foodList
            binding.addFoodTxt.text.clear()
        }
    }
}