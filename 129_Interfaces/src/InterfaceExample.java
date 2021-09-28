
class Phone
{
    public void call(){
        System.out.println("Phone call");
    }
    public void sms(){
        System.out.println("Phone sending SMS");
    }
}

interface ICamera{
    void click();
    void record();
}

interface IMusicPlayer{
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer{
    public void videoCall(){
        System.out.println("Smart Phone Video Calling...");
    }
    public void click(){
        System.out.println("Smart Phone Clicking Photo");
    }
    public void record(){
        System.out.println("Smart phone recording video");
    }

    public void play(){
        System.out.println("Smart phone playing music");
    }
    public void stop(){
        System.out.println("Smart phone stopped!");
    }
}

public class InterfaceExample{
    public static void main(String[] args) {
        ICamera sp = new SmartPhone();
        sp.click();
        sp.record();

    }
}