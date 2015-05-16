package xyz.codeme.loginer.data;

import android.os.Bundle;
import android.os.Message;

public class MessageBuilder {
    public static Message simpleMessage(int what, String key, String value) {
        Bundle bundle = new Bundle();
        bundle.putString(key, value);
        Message message = new Message();
        message.setData(bundle);
        message.what = what;
        return message;
    }

    public static Message bundleMessage(int what, Bundle bundle) {
        Message message = new Message();
        message.setData(bundle);
        message.what = what;
        return message;
    }
}
