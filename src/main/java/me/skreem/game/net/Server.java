package me.skreem.game.net;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class Server {
    private HttpServer server;

    public void start(int port) throws IOException {
        System.out.println("Starting server on port " + port);
        InetSocketAddress addr = new InetSocketAddress(port);
        server = HttpServer.create(addr, 0);

        server.createContext("/", new HttpEventHandler());
        server.setExecutor(Executors.newCachedThreadPool());
        server.start();
    }


}
