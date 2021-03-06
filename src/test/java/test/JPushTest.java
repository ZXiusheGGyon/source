package test;

import org.apache.log4j.Logger;

import cn.jiguang.common.ClientConfig;
import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jpush.api.JPushClient;
import cn.jpush.api.push.PushResult;
import cn.jpush.api.push.model.Message;
import cn.jpush.api.push.model.Options;
import cn.jpush.api.push.model.Platform;
import cn.jpush.api.push.model.PushPayload;
import cn.jpush.api.push.model.SMS;
import cn.jpush.api.push.model.audience.Audience;
import cn.jpush.api.push.model.audience.AudienceTarget;
import cn.jpush.api.push.model.notification.IosNotification;
import cn.jpush.api.push.model.notification.Notification;
/**
 *  * @author Administrator
 *
 */
public class JPushTest {
	private Logger log = Logger.getLogger(JPushTest.class);
	/**
	 * 推送消息示例
	 * @param MASTER_SECRET
	 * @param APP_KEY
	 */
	public void push(String MASTER_SECRET, String APP_KEY){
		JPushClient jpushClient = new JPushClient(MASTER_SECRET, APP_KEY, null, ClientConfig.getInstance());

	    // For push, all you need do is to build PushPayload object.
	    PushPayload payload = buildPushObject_all_all_alert("消息内容");

	    try {
	        PushResult result = jpushClient.sendPush(payload);
	        log.info("Got result - " + result);

	    } catch (APIConnectionException e) {
	        // Connection error, should retry later
	    	log.error("Connection error, should retry later", e);

	    } catch (APIRequestException e) {
	        // Should review the error, and fix the request
	    	log.error("Should review the error, and fix the request", e);
	    	log.info("HTTP Status: " + e.getStatus());
	    	log.info("Error Code: " + e.getErrorCode());
	    	log.info("Error Message: " + e.getErrorMessage());
	    }
	}
	/**
	 * 推送对象：所有平台，所有设备，内容为 ALERT 的通知。
	 * @param ALERT
	 * @return
	 */
	public static PushPayload buildPushObject_all_all_alert(String ALERT) {
        return PushPayload.alertAll(ALERT);
    }
	/**
	 * 构建推送对象：平台是 Android，目标是 tag 为 "tag1" 的设备，内容是 Android 通知 ALERT，并且标题为 TITLE。
	 * @param ALERT 
	 * @param TITLE
	 * @return
	 */
	public static PushPayload buildPushObject_android_tag_alertWithTitle(String ALERT, String TITLE) {
        return PushPayload.newBuilder()
                .setPlatform(Platform.android())
                .setAudience(Audience.tag("tag1"))
                .setNotification(Notification.android(ALERT, TITLE, null))
                .build();
    }
	/**
	 * 推送对象：所有平台，推送目标是别名为 "alias1"，通知内容为 ALERT。
	 * @param ALERT
	 * @return
	 */
	public static PushPayload buildPushObject_all_alias_alert(String ALERT) {
        return PushPayload.newBuilder()
                .setPlatform(Platform.all())
                .setAudience(Audience.alias("alias1"))
                .setNotification(Notification.alert(ALERT))
                .build();
    }
	/**
	 * 推送对象：平台是 iOS，推送目标是 "tag1", "tag_all" 的交集，推送内容同时包括通知与消息 - 
	 * 通知信息是 ALERT，角标数字为 5，通知声音为 "happy"，并且附加字段 from = "JPush"；消息内容是 MSG_CONTENT。
	 * 通知是 APNs 推送通道的，消息是 JPush 应用内消息通道的。APNs 的推送环境是“生产”（如果不显式设置的话，Library 会默认指定为开发）
	 * @param ALERT
	 * @param MSG_CONTENT
	 * @return
	 */
	public static PushPayload buildPushObject_ios_tagAnd_alertWithExtrasAndMessage(String ALERT, String MSG_CONTENT) {
        return PushPayload.newBuilder()
                .setPlatform(Platform.ios())
                .setAudience(Audience.tag_and("tag1", "tag_all"))
                .setNotification(Notification.newBuilder()
                        .addPlatformNotification(IosNotification.newBuilder()
                                .setAlert(ALERT)
                                .setBadge(5)
                                .setSound("happy")
                                .addExtra("from", "JPush")
                                .build())
                        .build())
                 .setMessage(Message.content(MSG_CONTENT))
                 .setOptions(Options.newBuilder()
                         .setApnsProduction(true)
                         .build())
                 .build();
    }
	/**
	 * 推送对象：平台是 Andorid 与 iOS，推送目标是 （"tag1" 与 "tag2" 的并集）交（"alias1" 与 "alias2" 的并集），
	 * 推送内容是 - 内容为 MSG_CONTENT 的消息，并且附加字段 from = JPush。
	 * @param MSG_CONTENT
	 * @return
	 */
	public static PushPayload buildPushObject_ios_audienceMore_messageWithExtras(String MSG_CONTENT) {
        return PushPayload.newBuilder()
                .setPlatform(Platform.android_ios())
                .setAudience(Audience.newBuilder()
                        .addAudienceTarget(AudienceTarget.tag("tag1", "tag2"))
                        .addAudienceTarget(AudienceTarget.alias("alias1", "alias2"))
                        .build())
                .setMessage(Message.newBuilder()
                        .setMsgContent(MSG_CONTENT)
                        .addExtra("from", "JPush")
                        .build())
                .build();
    }
	
}
