import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application(){
    companion object{
        const val TOKEN = "" // 填入你申请到的令牌值
        @SuppressLint("StaticFieldLeak")
        lateinit var contect: Context
    }

    override fun onCreate() {
        super.onCreate()
        contect = applicationContext
    }
}