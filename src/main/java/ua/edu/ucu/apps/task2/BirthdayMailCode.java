package ua.edu.ucu.apps.task2;

public class BirthdayMailCode implements MailCode{

    @Override
    public String generate(Client client) {
        return String.format("Dear %s! Happy %d bithday!",
        client.getName(), client.getAge());
    }

}
