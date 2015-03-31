package cn.edu.pku.ss.zhangqx.weather.Util;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo.State;

/**
 * Created by 露阳 on 2015/3/21.
 */
public class NetUtil {
    public static final int NETWORN_NONE = 0;
    public static final int NETWORN_WIFI = 1;
    public static final int NETWORN_MOBILE = 2;
    public static int getNetworkState(Context context){
        ConnectivityManager connManager=(ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);

        //wifi
        State state=connManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState();
        if (state == State.CONNECTED || state==State.CONNECTING){
            return NETWORN_WIFI;
        }
        //mobile
        state= connManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState();
        if (state==State.CONNECTED || state==State.CONNECTING){
            return NETWORN_MOBILE;
        }
        return NETWORN_NONE;
    }
}
