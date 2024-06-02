package com.soa3.Notification.Adapter;

import com.soa3.Notification.NotificationType;

public class SlackNotificationAdapter implements NotificationType {
    private Slack slack;

    public SlackNotificationAdapter(Slack slack) {
        this.slack = slack;
    }

    @Override
    public void sendNotification(String message) {
        slack.sendSlackMessage(message);
    }
}