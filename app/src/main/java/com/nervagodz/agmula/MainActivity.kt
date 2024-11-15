package com.nervagodz.agmula

import android.app.Notification
import android.app.Notification.Builder
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.Toast
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
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.nervagodz.agmula.ui.theme.AgmulaTheme
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
            val CHANNEL_ID = "ChannelID"
            val CHANNEL_NAME = "Agmula"
            val NOTIF_ID =0
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page) // start of app
        Toast.makeText(applicationContext, "Ensure internet is enabled for best experience", Toast.LENGTH_LONG).show()

        var builder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.gears)
            .setContentTitle("Agmula")
            .setContentText("Agmula is running, please enjoy the app!")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setAutoCancel(true)

        val youTubePlayerView: YouTubePlayerView = findViewById(R.id.youtube_player_view)

        lifecycle.addObserver(youTubePlayerView)

        youTubePlayerView.addYouTubePlayerListener(object: AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                val videoId ="5bhcCpNTbC0"
                youTubePlayer.loadVideo(videoId, 0f)
            }
        })
    }


        fun homePage(view: View){
            setContentView(R.layout.home_page)
        }
        fun seeCalendar(view: View){
            setContentView(R.layout.calendar_page) // button for calendar
        }

        fun seeForecast(view: View){
            setContentView(R.layout.forecast_page) // button for the forecast
            val webView= findViewById<WebView>(R.id.forecastView)
            webView.loadUrl("https://weather.com/en-PH/weather/today/l/dd6a0ea2120e46fec2a46e541100ae99ffe70fe5edcffe73af67ddf0980042db")



        }

        fun seeAvailPlants(view: View){
            setContentView(R.layout.garden_database) // button for the available plants wiki
            Toast.makeText(applicationContext, "Credits: PlantVillage | plantvillage.psu.edu", Toast.LENGTH_SHORT).show()
        }


        fun seeBaguioBeans(view: View){
            setContentView(R.layout.baguio_beans)
            val webView= findViewById<WebView>(R.id.beanView)
            webView.loadUrl("https://plantvillage.psu.edu/topics/bean/infos")
        }

        fun seeBrocolli(view: View){
            setContentView(R.layout.brocolli)
            val webView= findViewById<WebView>(R.id.broccoliView)
            webView.loadUrl("https://plantvillage.psu.edu/topics/broccoli/infos")
        }

        fun seeCabbage(view: View){
        setContentView(R.layout.cabbage)
            val webView= findViewById<WebView>(R.id.cabbageView)
            webView.loadUrl("https://plantvillage.psu.edu/topics/cabbage-red-white-savoy/infos")
        }

        fun seeCarrots(view: View){
        setContentView(R.layout.carrots)
            val webView= findViewById<WebView>(R.id.carrotView)
            webView.loadUrl("https://plantvillage.psu.edu/topics/carrot/infos")
        }
        fun seeCauliflower(view: View){
        setContentView(R.layout.cauliflower)
            val webView= findViewById<WebView>(R.id.cauliView)
            webView.loadUrl("https://plantvillage.psu.edu/topics/cauliflower/infos")
        }
        fun seeLettuce(view: View){
        setContentView(R.layout.lettuce)
            val webView= findViewById<WebView>(R.id.lettuceView)
            webView.loadUrl("https://plantvillage.psu.edu/topics/lettuce/infos")
        }
        fun seePotato(view: View){
        setContentView(R.layout.potato)
            val webView= findViewById<WebView>(R.id.potatoView)
            webView.loadUrl("https://plantvillage.psu.edu/topics/potato/infos")
        }
        fun seeSayote(view: View){
        setContentView(R.layout.sayote)
            val webView= findViewById<WebView>(R.id.sayoteView)
            webView.loadUrl("https://plantvillage.psu.edu/topics/chayote/infos")
        }
        fun seeStrawberry(view: View){
        setContentView(R.layout.strawberry)
            val webView= findViewById<WebView>(R.id.strawberryView)
            webView.loadUrl("https://plantvillage.psu.edu/topics/strawberry/infos")
        }

        fun showToast(view: View){
            Toast.makeText(applicationContext, "Hello!", Toast.LENGTH_SHORT).show()
        }




}




