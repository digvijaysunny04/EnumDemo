package com.demo.Factory;

public class FActory1 {
      public Notification1 get1(String s)

      {
        if(s.equals("SMS"))
        {
          return new SMSNotification();
        }
        else if(s.equals("EMAIL"))
        {
          return new EMAILNotification();
        }
        return null;
      }

}
