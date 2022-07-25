package designPattern;

public class Subscriber {
    private String name;
    private Channel channel1 = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(){
        System.out.println("Hey"+" "+name+":"+"Video Uploaded!!");

    }
    public void subscribeChannel(Channel ch){
        channel1 = ch;

    }
}
