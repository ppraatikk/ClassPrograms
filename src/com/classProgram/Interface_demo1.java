package com.classProgram;

interface MessagingService{
	void sendMessage(String msg , String recieve);
	void recieveMessage(String msg , String send);
}
class EmailService implements MessagingService{
		public void sendMessage(String msg,String recieve)
		{
			System.out.println("Email Send to "+recieve+"     "+msg);
		}
		public void recieveMessage(String msg,String send)
		{
		 System.out.println("Email Recieved From "+send+"      "+msg);	
		}
}
class SMSservice implements MessagingService{
	    public void sendMessage(String msg,String recieve)
	    {
	    	System.out.println("SMS send to "+recieve+"     "+msg);
	    }
	    public void recieveMessage(String msg,String send)
	    {
	    	System.out.println("SMS Recieve From "+send+"    "+msg);
	    }
}

public class Interface_demo1 {

	public static void main(String[] args) {
		
		EmailService email = new EmailService();
			email.sendMessage("hello","ASDF@gmail.com");
			email.recieveMessage("heelo","QWER@gmail.commm");
		
		SMSservice sms = new SMSservice();
			sms.sendMessage("hiii","ZXCV@gmaol.com");
			sms.recieveMessage("hieeee","POLMK@gmail.com");
	}

}
