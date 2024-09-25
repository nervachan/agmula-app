package com.nervagodz.agmula

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.nervagodz.agmula.ui.theme.AgmulaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start_screen) // start of app
    }
        //button functions
        fun getStarted(view: View){
            setContentView(R.layout.home_page) // get started button
        }

        fun seeCalendar(view: View){
            setContentView(R.layout.calendar_page) // button for calendar
        }

        fun seeForecast(view: View){
            setContentView(R.layout.forecast_page) // button for the forecast
        }

        fun seeAvailPlants(view: View){
            setContentView(R.layout.garden_database) // button for the available plants wiki
        }

        fun seePlantSickness(view: View){
            setContentView(R.layout.garden_sickness) // button for the possible plant sickness wiki
        }

        fun seePlantSicknessEntry(view: View){
            setContentView(R.layout.garden_sickness_entry1)
        }

        fun seeAvailPlantsEntry(view: View){
            setContentView(R.layout.garden_database_entry1)
        }






}




