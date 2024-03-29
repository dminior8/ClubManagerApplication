package com.projektsemv.clubmanagement.UserFunction;
import java.io.PrintWriter;
import java.io.BufferedReader;
public class Message {
    public void sendLoginMessage(PrintWriter writer,String... arguments ) {
        writer.println("LOGIN" + "|" + String.join("|", arguments));
    }
    public void sendRegisterMessage(PrintWriter writer,String... arguments ) {
        writer.println("REGISTER" + "|" + String.join("|", arguments));
    }
    public void sendGetPage(PrintWriter writer,String... arguments ) {
        writer.println("GETPAGE" + "|" + String.join("|", arguments));
    }
    public void sendGetSettings(PrintWriter writer,String... arguments ) {
        writer.println("GETSETTINGS" + "|" + String.join("|", arguments));
    }
    public void sendGetStatisticsPage(PrintWriter writer,String... arguments ) {
        writer.println("GETSTATISICS" + "|" + String.join("|", arguments));
    }
    public void sendGetFinancePage(PrintWriter writer,String... arguments ) {
        writer.println("GETFINANCE" + "|" + String.join("|", arguments));
    }
    public void sendUserListPage(PrintWriter writer,String... arguments ) {
        writer.println("GETUSERLIST" + "|" + String.join("|", arguments));
    }
    public void sendDeleteUser(PrintWriter writer,String... arguments ){
        writer.println("DELETEUSER" + "|" + String.join("|", arguments));
    }
    public void sendUpdateUser(PrintWriter writer,String... arguments ){
        writer.println("UPDATEUSER" + "|" + String.join("|", arguments));
    }
    public void sendUpdateSettingsUser(PrintWriter writer,String... arguments ){
        writer.println("UPDATESETTINGSUSER" + "|" + String.join("|", arguments));
    }
    public void sendGetNewsPage(PrintWriter writer,String... arguments ) {
        writer.println("GETNEWS" + "|" + String.join("|", arguments));
    }
    public void sendNews(PrintWriter writer,String... arguments ) {
        writer.println("SENDNEWS" + "|" + String.join("|", arguments));
    }
    public void sendGetFanSettings(PrintWriter writer,String... arguments ) {
        writer.println("GETSETTINGSFAN" + "|" + String.join("|", arguments));
    }
    public void sendGetFanClubs(PrintWriter writer,String... arguments ) {
        writer.println("GETSETTINGSCLUBS" + "|" + String.join("|", arguments));
    }
    public void sendUpdateFanSettings(PrintWriter writer,String... arguments ) {
        writer.println("UPDATEFANSETTINGS" + "|" + String.join("|", arguments));
    }
    public void sendGetFanTickets(PrintWriter writer,String... arguments ) {
        writer.println("GETTICKETS" + "|" + String.join("|", arguments));
    }
    public void sendGetBuyTicketsPage(PrintWriter writer,String... arguments ) {
        writer.println("BUYTICKETSPAGE" + "|" + String.join("|", arguments));
    }
    public void sendBuyTickets(PrintWriter writer,String... arguments ) {
        writer.println("BUYTICKET" + "|" + String.join("|", arguments));
    }
}
