import java.util.*;
import java.io.*;
import java.net.*;

/*Main class to use run the application*/
class Main {
    private static final Scanner Sc = new Scanner(System.in);
    private static final Runtime rt = Runtime.getRuntime();

    public static void main(String[] args) throws Exception {
        rt.exec("cmd.exe /c cd \"" + System.getProperty("user.dir") + "\\src" + "\" & start cmd.exe /k \"javac Main.java\"" + "\" & exit cmd.exe /k \"");
        System.out.println("Pattern: -x <number> -t <udp or tcp> -s <host name of the server> -p <Port>");
        System.out.print("InputCommand: ");
        String Input = Sc.nextLine();
        String[] List = Input.split(" ");
        List<String> Keep = Arrays.asList(List);

        try {
            if (!Keep.get(0).equals("-x")) {
                System.out.println("Command not found");
            } else if (!Keep.get(2).equals("-t")) {
                System.out.println("Command not found");
            } else if (!Keep.get(4).equals("-s")) {
                System.out.println("Command not found");
            } else if (!Keep.get(6).equals("-p")) {
                System.out.println("Command not found");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please input the command by pattern");
        }

        if (Keep.get(3).equals("TCP") || Keep.get(3).equals("tcp")) {
            new TCPClient(Integer.parseInt(Keep.get(1)), Keep.get(5), Integer.parseInt(Keep.get(7)));
            rt.exec("cmd.exe /c cd \"" + System.getProperty("user.dir") + "\\src" + "\" & start cmd.exe /k \"java TCPServer " + Integer.parseInt(Keep.get(7)) + "\"");
            TCPClient.main(args);
        } else if (Keep.get(3).equals("UDP") || Keep.get(3).equals("udp")) {
            new UDPClient(Integer.parseInt(Keep.get(1)), Keep.get(5), Integer.parseInt(Keep.get(7)));
            rt.exec("cmd.exe /c cd \"" + System.getProperty("user.dir") + "\\src" + "\" & start cmd.exe /k \"java UDPServer " + Integer.parseInt(Keep.get(7)) + "\"");
            UDPClient.main(args);
        } else {
            System.out.println("Please enter the value that in the pattern");
        }
    }
}
/*Code from chapter 2 and I adapt it*/
class TCPClient {
    static int num;
    static int port;
    static String host;

    public TCPClient(int x, String s, int p) {
        try {
            num = x;
            host = s;
            port = p;
        } catch (Exception e) {
            System.out.println("Error!!!!!");
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            System.out.print("InputFromClient: ");
            String Pattern = "The number is: " + num + " from client " + host + " on port " + port;
            Socket clientSocket = new Socket(host, port);
            DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            outToServer.writeBytes(Pattern + '\n');
            inFromServer.readLine();
            System.out.println(Pattern);
            clientSocket.close();
        } catch (SocketException e) {
            System.out.println("Error!!!");
        }
    }
}
/*Code from chapter 2 and I adapt it*/
class TCPServer {
    static int port;

    public TCPServer(int p) {
        try {
            port = p;
        } catch (Exception e) {
            System.out.println("Error!!!!!");
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            String clientSentence;
            String capitalizedSentence;
            ServerSocket welcomeSocket = new ServerSocket(Integer.parseInt(args[0]));
            System.out.println("server: Waiting for client to connect\n");

            while (true) {
                Socket connectionSocket = welcomeSocket.accept();
                System.out.println("server: Connection established\n");
                BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
                DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
                clientSentence = inFromClient.readLine();
                capitalizedSentence = clientSentence.toUpperCase() + '\n';
                outToClient.writeBytes(capitalizedSentence);
                System.out.println(capitalizedSentence);
            }
        } catch (SocketException e) {
            System.out.println("Error!!!!!!!");

        }

    }
}
/*Code from chapter 2 and I adapt it*/
class UDPClient {
    static int num;
    static int port;
    static String host;

    public UDPClient(int x, String s, int p) {
        try {
            num = x;
            host = s;
            port = p;
        } catch (Exception e) {
            System.out.println("Error!!!!!");
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            System.out.print("Confirm(Y/N): ");
            String Pattern = "The number is: " + num + " from client " + host + " on port " + port;
            BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
            DatagramSocket clientSocket = new DatagramSocket();
            InetAddress IPAddress = InetAddress.getByName(host);
            String sentence = inFromUser.readLine();
            if (sentence.equals("y") || sentence.equals("Y")) {
                byte[] sendData = Pattern.getBytes();
                byte[] receiveData = new byte[1024];
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
                clientSocket.send(sendPacket);
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                clientSocket.receive(receivePacket);
                String modifiedSentence = new String(receivePacket.getData());
                System.out.println("FROM SERVER:" + modifiedSentence);
                clientSocket.close();
            } else if (sentence.equals("n") || sentence.equals("N")) {
                System.out.println("Close");
                clientSocket.close();
            } else {
                System.out.println("Please enter Y (y) or N (n)");
            }

        } catch (SocketException e) {
            System.out.println("Error!!!");
        }
    }
}
/*Code from chapter 2 and I adapt it*/
class UDPServer {
    static int port;

    public UDPServer(int p) {
        try {
            port = p;
        } catch (Exception e) {
            System.out.println("Error!!!!!");
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            System.out.println("server: Waiting for client to connect");
            DatagramSocket serverSocket = new DatagramSocket(Integer.parseInt(args[0]));
            byte[] receiveData = new byte[1024];
            byte[] sendData;

            while (true) {
                System.out.println("server: Connection established");
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);
                String sentence = new String(receivePacket.getData());
                InetAddress IPAddress = receivePacket.getAddress();
                int ports = receivePacket.getPort();
                String capitalizedSentence = sentence.toUpperCase();
                sendData = capitalizedSentence.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, ports);
                serverSocket.send(sendPacket);
                System.out.println(sentence);
            }
        } catch (SocketException e) {
            System.out.println("Error!!!");
        }
    }
}
