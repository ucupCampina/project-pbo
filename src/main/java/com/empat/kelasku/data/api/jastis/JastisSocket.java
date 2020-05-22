package com.empat.kelasku.data.api.jastis;

import java.net.URISyntaxException;

import com.empat.kelasku.data.model.Environment;
import com.empat.kelasku.data.model.KelasSocketModel;
import com.empat.kelasku.util.CallbackInterface;
import com.google.gson.Gson;

import io.socket.client.Ack;
import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;

public class JastisSocket {

	private static JastisSocket single_instance = null;
	Socket socket;

	public JastisSocket() {
		try {

			socket = IO.socket(Environment.PROD.getUrl());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}

	public static JastisSocket getInstance() {
		if (single_instance == null)
			single_instance = new JastisSocket();

		return single_instance;
	}

	public void connect() throws URISyntaxException {

		System.out.println("Connecting to socket...");

		socket.on(Socket.EVENT_CONNECT, new Emitter.Listener() {

			@Override
			public void call(Object... args) {
				System.out.println("Connected");

			}

		}).on("serverMessage", new Emitter.Listener() {

			@Override
			public void call(Object... args) {
				System.out.println("Message from socket server:\n" + args[0]);
			}

		}).on(Socket.EVENT_DISCONNECT, new Emitter.Listener() {

			@Override
			public void call(Object... args) {
				System.out.println("disconnected");
			}

		});
		socket.connect();
	}

	public void listenForEmptyClass(CallbackInterface callbackInterface) {
		System.out.println("Listening for empty class");
		socket.on("listenForEmptyClassRoom", new Emitter.Listener() {
			@Override
			public void call(Object... args) {
				System.out.println(args[0]);
				KelasSocketModel kelasSocket = new Gson().fromJson(args[0].toString(), KelasSocketModel.class);
				callbackInterface.kelasSocketCallback(kelasSocket);
			}
		});
	}

}
