package evan.chen.tutorial.tdd.instrumentedtestsample

import android.content.Context
import android.content.SharedPreferences

class SharedPreferenceManager(override val context: Context) : ISharePreferenceManager {

    private val sharedPreferenceKey = "USER_DATA"

    private var sharedPreference: SharedPreferences = context.getSharedPreferences(sharedPreferenceKey, Context.MODE_PRIVATE)

    override fun saveString(key: String, value: String){
        sharedPreference.edit().putString(key, value).apply()
    }

    override fun getString(key: String): String? {
        return sharedPreference.getString(key, "")
    }
}