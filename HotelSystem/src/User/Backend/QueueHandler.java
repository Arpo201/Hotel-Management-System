package User.Backend;

import User.Frontend.UserSite;
import User.Frontend.UserWelcome;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.text.MessageFormat;

public class QueueHandler {
    private static JSONArray queues = new JSONArray();

    public static JSONArray getQueues() {
        return queues;
    }

    public static void pushQueues(JSONObject queue) {
        queue.put("id", UserSite.getRoomId());
        queues.add(queue);
        UserWelcome.notifySocket();
        System.out.println(MessageFormat.format("Got new queue: {0} | total: {1}", queue.toJSONString(), queues.size()));
    }
}
