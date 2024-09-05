package com.oops.inher.communication;

public class CommunicationMain {

	public static void main(String[] args) {

		Communication mailcommunication = new MailCommunication();
		mailcommunication.sendMessage();
		MailCommunication mail = (MailCommunication) mailcommunication;
		String[] types = mail.showTypes();
		for (String type : types) {
			System.out.println(type);
		}
		
		Communication smscommunication = new SMSCommunication();
		smscommunication.sendMessage();
		SMSCommunication sms = (SMSCommunication) smscommunication;
		sms.messageLength();
		
		Communication phonecommunication = new PhoneCommunication();
		phonecommunication.sendMessage();
		PhoneCommunication phone = (PhoneCommunication) phonecommunication;
		phone.callService();
		
		Communication whatsupcommunication = new WhatsupCommunication();
		whatsupcommunication.sendMessage();
		WhatsupCommunication whatsup = (WhatsupCommunication) whatsupcommunication;
		whatsup.otherFeatures();
	}

}
