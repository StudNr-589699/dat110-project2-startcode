package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;
import no.hvl.dat110.common.TODO;

public class DisplayDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {

		System.out.println("Display starting ...");

		// TODO - START

		// create a client object and use it to
		Client dispClient = new Client("display", Common.BROKERHOST, Common.BROKERPORT);

		// - connect to the broker - use "display" as the username
		dispClient.connect();

		// - create the temperature topic on the broker
		dispClient.createTopic(Common.TEMPTOPIC);

		// - subscribe to the topic
		dispClient.subscribe(Common.TEMPTOPIC);

		// - receive messages on the topic

		dispClient.receive();

		// - unsubscribe from the topic
		dispClient.unsubscribe(Common.TEMPTOPIC);

		// - disconnect from the broker
		dispClient.disconnect();

		// TODO - END

		System.out.println("Display stopping ... ");

	}
}
