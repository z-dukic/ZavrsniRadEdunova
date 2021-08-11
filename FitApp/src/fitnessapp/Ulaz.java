package fitnessapp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;





public class Ulaz {

	public static Scanner scanner = new Scanner(System.in);
	

	public static boolean ucitajSpol(String poruka) {
		String izjava;

		while (true) {
			System.out.println(poruka);
			izjava = scanner.nextLine();
			if (izjava.trim().toLowerCase().equals("m")) {
				return true;
			}
			if (izjava.trim().toLowerCase().equals("f")) {
				return false;
			}
			System.out.println("Možete unijeti samo M za muški spol ili F za ženski spol (unos da/ne)");
		}
	}

	public static int ucitajInt(String poruka, String greska, int min, int max) {
		int broj = 0;
		while (true) {
			System.out.println(poruka);
			try {

				broj = Integer.parseInt(scanner.nextLine());
				if (broj < min || broj > max) {
					System.out.println("Broj ne smije biti manji od: " + min + " ili veći od " + max);
					continue;
				}
				break;

			} catch (Exception e) {
				System.out.println(greska);
			}
		}

		return broj;
	}

	public static boolean daIliNe(String poruka, String greska) {
		String izjava;

		while (true) {
			System.out.println(poruka);
			izjava = scanner.nextLine();
			if (izjava.trim().toLowerCase().equals("da")) {
				return true;
			}
			if (izjava.trim().toLowerCase().equals("ne")) {
				return false;
			}
			System.out.println(greska + " (unos da/ne)");
		}

	}

	public static String ucitajString(String poruka, String greska) {
		String string = "";
		while (true) {
			System.out.println(poruka);
			string = scanner.nextLine();
			if (string.trim().equals("")) {
				System.out.println(greska);
				continue;
			}
			break;
		}

		return string;
	}

	public static String formatDatuma = "dd.MM.yyyy";

	public static Date ucitajDatum(String poruka) {
		SimpleDateFormat sdf = new SimpleDateFormat(formatDatuma);
		while (true) {
			System.out.println(poruka);
			try {
				return sdf.parse(scanner.nextLine());
			} catch (Exception e) {
				System.out.println("Ne ispravan format datuma. " + "Primjer unosa: " + sdf.format(new Date()));
			}
		}
	}
	
	
	final String senderEmail = "perop8406@gmail.com"; //change email address
	final String senderPassword = "Peromajstor69."; //change password
	final String emailSMTPserver = "smtp.gmail.com";
	final String emailServerPort = "465";
	String receiverEmail = null;
	static String emailSubject;
	static String emailBody;
	
	public Ulaz(String receiverEmail, String subject, String body) {
		//receiver email
		this.receiverEmail = receiverEmail;
		//subject
		this.emailSubject = subject;
		//body
		this.emailBody = body;
		
		Properties props = new Properties();
		props.put("mail.smtp.user",senderEmail);
		props.put("mail.smtp.host", emailSMTPserver);
		props.put("mail.smtp.port", emailServerPort);
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.socketFactory.port", emailServerPort);
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.socketFactory.fallback", "false");
		SecurityManager security = System.getSecurityManager();
		
		try {
			Authenticator auth = new SMTPAuthenticator();
			Session session = Session.getInstance(props, auth);
			MimeMessage msg = new MimeMessage(session);
			msg.setText(emailBody);
			//System.out.println(emailBody);
			msg.setSubject(emailSubject);
			msg.setFrom(new InternetAddress(senderEmail));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(receiverEmail));
			Transport.send(msg);
			System.out.println("Message sent successfully");
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public class SMTPAuthenticator extends javax.mail.Authenticator {
		public PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(senderEmail, senderPassword);
		}
	}
	
	//Ulaz send = new Ulaz("zorandjukic.os@gmail.com", "subject", "body"); //change receiver email


}
