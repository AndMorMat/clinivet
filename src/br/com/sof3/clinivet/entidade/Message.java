package br.com.sof3.clinivet.entidade;

import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.SmsFactory;
import com.twilio.sdk.resource.instance.Sms;
import com.twilio.sdk.resource.list.SmsList;
import java.util.HashMap;
import java.util.Map;
 
public class Message {
 
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "";
  public static final String AUTH_TOKEN = "";
 
  public void sendSMS(String celular, String mensagem) throws TwilioRestException {
    TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
 
    // Build a filter for the SmsList
    Map<String, String> params = new HashMap<String, String>();
    params.put("Body", mensagem);
    params.put("To", "+55" + celular);
    params.put("From", "+14153736456");
 
    SmsFactory messageFactory = client.getAccount().getSmsFactory();
    Sms message = messageFactory.create(params);
    System.out.println(message.getSid());
  }
}