package proxyChecker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.*;
import java.util.Arrays;

public class ProxyChecker {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("ip.txt");
            int i;

            String socketsString = "";
            while ( (i=fis.read()) != -1){
                if(i == 13){
                    continue;
                }else if(i == 10){
                    socketsString += "\n";
                }else if (i == 9) {
                    socketsString += ":";
                }else{
                    socketsString += (char) i;
                }
            }


            String[] sockets = socketsString.split("\n");
            for (String socket : sockets) {
                String ip = socket.split(":")[0];
                int port = Integer.parseInt(socket.split(":")[1]);
                MyThread thread = new MyThread(ip, port);
                thread.start();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static void checkSocket(String ip, int port){

    }
}

class MyThread extends Thread{
    String ip;
    int port;
    public MyThread(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }

    @Override
    public void run() {
        super.run();
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
            URL url = new URL("https://vozhzhaev.ru/test.php");
            HttpURLConnection con = (HttpURLConnection) url.openConnection(proxy);
            InputStream is = con.getInputStream();
            System.out.println(ip+":"+port+" - работает");
        } catch (Exception e) {
            System.out.println(ip+":"+port+" - не работает");
        }
    }
}