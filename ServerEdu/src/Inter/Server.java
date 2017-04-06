/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author stalwx
 */
public class Server extends Thread {
    
    Socket s;
    int num;
    private volatile boolean mFinish = false;
    
    public Server(int port, Socket s) throws IOException
    {
        // копируем данные
        this.num = num;
        this.s = s;
        
        ServerSocket ss = new ServerSocket(port);

        // и запускаем новый вычислительный поток (см. ф-ю run())
        //setDaemon(true);
        //setPriority(NORM_PRIORITY);
        //start();
    }
    
    public Server(){
        
    }
    
    public void finish(){
        mFinish = true;
    }
    
    @Override
    public void run() {
        while (true) {
            System.out.println("Привет из побочного потока!");
            if(mFinish){
                return;
            }
            
            // TimeUnit.SECONDS.sleep(1);
            /*
            try
            {
            // из сокета клиента берём поток входящих данных
            InputStream is = s.getInputStream();
            // и оттуда же - поток данных от сервера к клиенту
            OutputStream os = s.getOutputStream();

            // буффер данных в 64 килобайта
            byte buf[] = new byte[64*1024];
            // читаем 64кб от клиента, результат - кол-во реально принятых данных
            int r = is.read(buf);

            // создаём строку, содержащую полученную от клиента информацию
            String data = new String(buf, 0, r);

            // добавляем данные об адресе сокета:
            data = ""+num+": "+"\n"+data;

            // выводим данные:
            os.write(data.getBytes());

            // завершаем соединение
            s.close();
            }
            catch(Exception e)
            {System.out.println("init error: "+e);} // вывод исключений
            */
        }
    }
}
