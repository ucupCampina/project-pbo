package com.empat.kelasku.data.api.jastis;

import java.net.URISyntaxException;

import org.json.JSONObject;

import com.empat.kelasku.data.model.KelasSocketModel;
import com.empat.kelasku.util.CallbackInterface;
import com.google.gson.Gson;

import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;

public class JastisSocket {

	private static JastisSocket single_instance = null;
	Socket socket;

	public JastisSocket() {
		try {
			socket = IO.socket("http://jastis.herokuapp.com");
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
		socket.on(Socket.EVENT_CONNECT, new Emitter.Listener() {

			@Override
			public void call(Object... args) {
				System.out.println("connected");

			}

		}).on("event", new Emitter.Listener() {

			@Override
			public void call(Object... args) {
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
