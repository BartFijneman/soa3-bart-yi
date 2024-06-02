package com.soa3.Notification;

import java.time.LocalDate;

import com.soa3.Backlog.Backlog;
import com.soa3.Backlog.BacklogItem;
import com.soa3.Notification.Adapter.Email;
import com.soa3.Notification.Adapter.EmailNotificationAdapter;
import com.soa3.Notification.Adapter.SMS;
import com.soa3.Notification.Adapter.SMSNotificationAdapter;
import com.soa3.Notification.Adapter.Slack;
import com.soa3.Notification.Adapter.SlackNotificationAdapter;
import com.soa3.Person.Person;
import com.soa3.Person.ProductOwner;
import com.soa3.Pipeline.DevPipeline;
import com.soa3.Pipeline.Director;
import com.soa3.Pipeline.IDevOps;
import com.soa3.Pipeline.ReleasePipeline;
import com.soa3.Sprint.Sprint;
import com.soa3.Sprint.SprintType;

public class Main {
    public static void main(String[] args) {
        // IDevOps devPipeline = new DevPipeline();

        // IDevOps releasePipeline = new ReleasePipeline();

        // Director director = new Director();

        // director.construct(devPipeline);
        // director.construct(releasePipeline);
   

        // devPipeline.getResult().showSteps();
        // releasePipeline.getResult().showSteps();
//          Person productOwner = new ProductOwner("Pieter");
//         Person scrumMaster = new ProductOwner("Jansen");

//         Project project = new Project("Project",1, productOwner);

//         Backlog backlog = project.getBacklog();

       
//         backlog.add(new BacklogItem("Create backend"));
//         backlog.add(new BacklogItem("Create frontend"));
//         backlog.add(new BacklogItem("Create database"));

// Sprint sprint = new Sprint(project, null, null, null, null, null, scrumMaster);
//         sprint.startSprint();
//         sprint.finishSprint();
//     }


 // Create notification methods
 Email email = new Email();
 Slack slack = new Slack();
 SMS sms = new SMS();

 // Create adapters for notification methods
 NotificationType emailAdapter = new EmailNotificationAdapter(email);
 NotificationType slackAdapter = new SlackNotificationAdapter(slack);
 NotificationType smsAdapter = new SMSNotificationAdapter(sms);

 // Create observers for each notification type
 Observer emailObserver = new NotificationObserver(emailAdapter);
 Observer slackObserver = new NotificationObserver(slackAdapter);
 Observer smsObserver = new NotificationObserver(smsAdapter);

 // Create a concrete notification observable
 ConcreteNotification concreteNotification = new ConcreteNotification();

 // Add observers
 concreteNotification.addObserver(emailObserver);
 concreteNotification.addObserver(slackObserver);
 concreteNotification.addObserver(smsObserver);

 // Set a new message and notify all observers
 concreteNotification.setMessage("This is a test notification!");

 // Remove an observer and send another notification
 concreteNotification.removeObserver(slackObserver);
 concreteNotification.setMessage("This is another test notification!");
    }
}